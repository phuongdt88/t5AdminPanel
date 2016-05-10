package models;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.*;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.Permission;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;



public class GoogleDrive {


  // CODE TEST - EMAIL TEST
  /** Email of the Service Account */
  private static final String SERVICE_ACCOUNT_ID = "t5-380@com-sgs-lumba-t5.iam.gserviceaccount.com";

  /** Path to the Service Account's Private Key file */
  private static final String SERVICE_ACCOUNT_PKCS12_FILE_PATH = "app/t5.p12";

  private static final String USER_EMAIL = "phuongdt2711@gmail.com";


//    public static void main(String[] args) {
//
//        try {
//            Drive service = getDriveService(SERVICE_ACCOUNT_ID);
//
//            //Insert a file
//            File body = new File();
//            body.setTitle("My document3");
//            body.setDescription("A test document");
//            body.setMimeType("text/plain");
//
//            java.io.File fileContent = new java.io.File("document.txt");
//            FileContent mediaContent = new FileContent("text/plain", fileContent);
//
//            File file = service.files().insert(body, mediaContent).execute();
//            System.out.println("File ID: " + file.getId());
//
//        } catch (GeneralSecurityException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

  /** Upload file to Google Drive */
  private static String uploadCSVFile(Drive service, java.io.File file, String title, String mimeType) {
    try {

      File body = new File();
      body.setTitle(title);
      body.setMimeType(mimeType);
      //Insert a file
      FileContent mediaContent = new FileContent(mimeType, file);
      File upload = service.files().insert(body, mediaContent).setConvert(true).execute();
      return upload.getId();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  /** Share the documents to USER_EMAIL */
  private static void sharePermission(Drive service, String fileId) {
    try {
      Permission newPermission1 = new Permission();
      newPermission1.setValue(USER_EMAIL);
      newPermission1.setType("user");
      newPermission1.setRole("writer");
      service.permissions().insert(fileId, newPermission1).setSendNotificationEmails(false).execute();
    } catch (IOException e) {
      System.out.println("An error occurred: " + e);
    }
  }
  /** Public upload file method */
  public static String uploadFile(java.io.File file, String title, String mimeType) {

    try{

      Drive service = getDriveService();
      String fileId = uploadCSVFile(service, file, title, mimeType);
      sharePermission(service, fileId);
      insertPermission(service, fileId);
      return fileId;
    } catch(Exception e){
      System.out.println("An error occurred: " + e);
    }
    return null;

  }

  /**
   * Insert a new permission.
   *
   * @param service Drive API service instance.
   * @param fileId ID of the file to insert permission for.
   * @param value User or group e-mail address, domain name or {@code null}
  "default" type.
   * @param type The value "user", "group", "domain" or "default".
   * @param role The value "owner", "writer" or "reader".
   * @return The inserted permission if successful, {@code null} otherwise.
   */
  private static Permission insertPermission(Drive service, String fileId) {
    Permission newPermission = new Permission();

    newPermission.setValue(USER_EMAIL);
    newPermission.setType("user");
    newPermission.setRole("writer");
    try {
      return service.permissions().insert(fileId, newPermission).setSendNotificationEmails(false).execute();
    } catch (IOException e) {
      System.out.println("An error occurred: " + e);
    }
    return null;
  }


  /**
   * Build and returns a Drive service object authorized with the service accounts
   * that act on behalf of the given user.
   *
   * @param userEmail The email of the user.
   * @return Drive service object that is ready to make requests.
   */
  public static Drive getDriveService() throws GeneralSecurityException,
          IOException {

    java.io.File key = new java.io.File(SERVICE_ACCOUNT_PKCS12_FILE_PATH);
    System.out.println(key.getAbsolutePath());
    HttpTransport httpTransport = new NetHttpTransport();
    JacksonFactory jsonFactory = new JacksonFactory();
    try {
      GoogleCredential credential = new GoogleCredential.Builder()
              .setTransport(httpTransport)
              .setJsonFactory(jsonFactory)
              .setServiceAccountId(SERVICE_ACCOUNT_ID)
              .setServiceAccountScopes(Arrays.asList(DriveScopes.DRIVE))
//              .setServiceAccountUser(USER_EMAIL)
              .setServiceAccountPrivateKeyFromP12File(
                      new java.io.File(SERVICE_ACCOUNT_PKCS12_FILE_PATH))
              .build();
      Drive service = new Drive.Builder(httpTransport, jsonFactory, null)
              .setHttpRequestInitializer(credential).setApplicationName("t5").build();
      return service;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}