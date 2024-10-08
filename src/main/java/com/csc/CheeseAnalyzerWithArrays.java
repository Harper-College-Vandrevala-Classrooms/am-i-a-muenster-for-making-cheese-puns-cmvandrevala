package com.csc;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheeseAnalyzerWithArrays {
  public static void main(String args[]) {
    List<List<String>> records = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader("cheese_data.csv"));
      String line;
      while ((line = br.readLine()) != null) {
        // pre-process the line somehow...?
        String[] values = line.split(",");
        List<String> record = Arrays.asList(values);
        records.add(record);
      }
      String output = "";
      for (List<String> r : records) {
        // Do something with r... save it to output?
      }
      br.close();

      try {
        FileOutputStream outputStream = new FileOutputStream("output.csv");
        byte[] strToBytes = output.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
      } catch (Exception e) {
        // do something here
      }
    } catch (Exception e) {
      // Do something else here?
    }
  }
}
