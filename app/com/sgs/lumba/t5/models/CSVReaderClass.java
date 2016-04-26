package com.sgs.lumba.t5.models;


import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;


public class CSVReaderClass {

  public static String [][] ReadCSV(String fileName) throws IOException {
    String [][] output = new String [GetRowCount(fileName)][GetColumnCount(fileName)];
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader("DataFiles/"+fileName));
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

  public static String ReadCSVToString(String fileName) throws IOException {
    String output = "";
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader("DataFiles/"+fileName));
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

  public static int GetColumnCount(String fileName) throws IOException {
    int count;
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(fileName));
    } catch (Exception e) {
      e.printStackTrace();
    }
    count = reader.readNext().length;
    return count;
  }

  public static int GetRowCount(String fileName) throws IOException {
    int count = 0;
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(fileName));
    } catch (Exception e) {
      e.printStackTrace();
    }
    while (reader.readNext() != null) {
      count++;
    }
    return count;
  }


}
