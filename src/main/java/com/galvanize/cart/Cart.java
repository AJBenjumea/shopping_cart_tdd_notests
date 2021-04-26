package com.galvanize.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cart {
    ArrayList<Item> cart = new ArrayList<>();
    HashMap<String, Integer> freqCount = new HashMap<>();

    public ArrayList<Item> getCartItems() {
        return cart;
    }

    public int addItem(Item item) {
        cart.add(item);
        return cart.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item i : cart) {
            total += i.price;
        }
        return total;
    }

    public String itemizedList() {
        if (cart.size() != 0) {
            String print = "";
            for (Item item : cart) {
                print += "item: " + item.getName() + " price: " + item.getPrice() +
                "\n";
            }
            return print;
        } else {
            return "Cart is empty";
        }
    }

  public String itemQuantities() {
  if (cart.size() == 0) return "No items";

    for (Item item : cart) {
        if (freqCount.containsKey(item.getName())) {
            freqCount.put(item.getName(), freqCount.get(item.getName()) + 1);
        } else {
            freqCount.put(item.getName(), 1);
        }
    }

    String print = "";
    for (String item : freqCount.keySet()) {
        print += "item: " + item + " qt: " + freqCount.get(item) + "\n";
    }
    return print;
  }

  public String onSaleItems() {
      HashSet<String> uniqueOnSaleItems = new HashSet<>();
      for (Item item : cart) {
          if(item.isOnSale) {
              uniqueOnSaleItems.add(item.getName());
          }
      }

      String print = "";
      for(String item : uniqueOnSaleItems) {
          print += item + "\n";
      }

      if (print == "") return "No Items on Sale";
      return print;
  }

}
