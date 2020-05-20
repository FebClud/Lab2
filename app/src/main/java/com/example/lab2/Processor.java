package com.example.lab2;

import java.util.ArrayList;
import java.util.List;

public class Processor {
  static Processor instance;
  List<Item> items;
  private Processor(List<Item> items) {
      this.items = new ArrayList<Item>();
      for(Item item : items) {
          if(item.getName() != null) {
              this.items.add(item);
          }
      }

  }
  public static Processor createInstance(List<Item> items) {
      if(instance == null) {
          instance = new Processor(items);
      }
      return instance;
  }
  public static Processor getInstance() {
      return instance;
  }
  public List<Item> getItems() {
      return items;
  }

}
