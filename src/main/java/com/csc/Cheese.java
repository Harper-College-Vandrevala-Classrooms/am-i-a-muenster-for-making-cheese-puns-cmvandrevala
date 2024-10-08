package com.csc;

// SRP:
// Manage information about a single cheese

public class Cheese {
  private String id;
  private String milkType;
  public String property;

  Cheese(String CheeseId, String MilkType, String Property) {
    id = CheeseId;
    milkType = MilkType;
    property = Property;
  }
}
