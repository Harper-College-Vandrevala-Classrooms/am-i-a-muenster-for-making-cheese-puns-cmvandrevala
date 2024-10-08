package com.csc;

import java.util.ArrayList;

// SRP:
// Manage information about a list of cheeses

public class CheeseList {
  private ArrayList<Cheese> cheeses = new ArrayList<>();

  public void addCheese(Cheese cheese) {
    cheeses.add(cheese);
  }

  public int numberOfCheeses() {
    return cheeses.size();
  }

  public int calculateNumberOfCheesesWithSomeProperty() {
    int count = 0;
    for (Cheese cheese : cheeses) {
      if (cheese.property == "whatever") {
        count++;
      }
    }
    return count;
  }
}
