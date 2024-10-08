package com.csc;

import java.io.BufferedReader;
import java.io.FileReader;

// SRP:
// Manage the reading of the cheese data file

public class CheeseReader {
  private String filename;
  private CheeseParser parser = new CheeseParser();
  private CheeseRowCleaner cleaner = new CheeseRowCleaner();

  public CheeseReader(String inputFilename) {
    filename = inputFilename;
  }

  public CheeseList read_cheeses() {
    CheeseList list = new CheeseList();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = reader.readLine()) != null) {
        Cheese cheese = deserialize_cheese(line);
        list.addCheese(cheese);
      }
      reader.close();
    } catch (Exception e) {
      // do something here
    }

    return list;
  }

  private Cheese deserialize_cheese(String line) {
    String cleaned_line = cleaner.clean(line);
    Cheese cheese = parser.parse(cleaned_line);
    return cheese;
  }
}
