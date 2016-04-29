package com.sgs.lumba.t5.models;


import com.google.gdata.util.ServiceException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import models.GoogleSpreadsheetService;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.*;


public class CSVReaderClass {

  public static String [][] ReadCSV(String filePath) throws IOException {
    String [][] output = new String [GetRowCount(filePath)][GetColumnCount(filePath)];
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(filePath));
    } catch (Exception e) {
      System.out.println("file not found");
      e.printStackTrace();
    }
    String [] nextLine;

    int row = 0;
    while ((nextLine = reader.readNext()) != null) {
      // nextLine[] is an array of values from the line
      for(int column = 0; column < nextLine.length; column++) {
        output[row][column] = nextLine[column] ;
      }
      row++;
    }
    return output;
  }

  public static String ReadCSVToString(String filePath) throws IOException {
    String output = "";
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(filePath));
    } catch (Exception e) {
      System.out.println("file not found");
      e.printStackTrace();
    }
    String [] nextLine;

    while ((nextLine = reader.readNext()) != null) {
      // nextLine[] is an array of values from the line
      for (int column = 0; column < nextLine.length; column++) {
        if (column < nextLine.length - 1) {
          output += nextLine[column] + "\t";
        } else {
          output += nextLine[column];
        }
      }
      output += "\n";
    }
    return output;
  }

  public static int GetColumnCount(String filePath) throws IOException {
    int count;
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(filePath));
    } catch (Exception e) {
      e.printStackTrace();
    }
    count = reader.readNext().length;
    return count;
  }

  public static int GetRowCount(String filePath) throws IOException {
    int count = 0;
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(filePath));
    } catch (Exception e) {
      e.printStackTrace();
    }
    while (reader.readNext() != null) {
      count++;
    }
    return count;
  }

  public static File WriteToCSVFile(String spreadsheetId, String worksheetName, String newFilePath)  throws IOException, GeneralSecurityException, ServiceException {

    String[] header = GoogleSpreadsheetService.GetWorkSheetHeader(spreadsheetId, worksheetName);
    List<String[]> spreadsheetData = GoogleSpreadsheetService.getWorksheetDataToList(spreadsheetId, worksheetName);

    CSVWriter writer = new CSVWriter(new FileWriter(newFilePath));
    writer.writeNext(header);
    writer.writeAll(spreadsheetData);
    writer.close();

    return  new File(newFilePath);
  }


}
