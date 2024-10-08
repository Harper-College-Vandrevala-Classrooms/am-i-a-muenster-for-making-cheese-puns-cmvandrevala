package com.csc;

// SRP:
// Take a row of CSV data (string) and turn it into a Cheese object

public class CheeseParser {
  public Cheese parse(String s) {
    // take s and figure out the cheese id and the milk type and the property
    Cheese cheese = new Cheese("PUT THAT ID HERE", "PUT THE MILK TYPE HERE", "PUT THE PROPERTY HERE");
    return cheese;
  }
}
