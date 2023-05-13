package Management;

import Clothers.*;
import Clothers.Shirt;
import java.util.*;

public class Stock {
     private ArrayList<Clothers> all_stock;
     public Stock(){
         all_stock = new ArrayList<Clothers>();
         all_stock.add(new Shirt("kelly", "good", "heaw", 45, "C:\\Users\\Ploy\\OneDrive\\เดสก์ท็อป\\pic_natnicha.jpg"));
         System.out.println(all_stock.get(0).getName());
     }

    public ArrayList<Clothers> getAll_stock() {
        return all_stock;
    }

    public void setAll_stock(ArrayList<Clothers> all_stock) {
        this.all_stock = all_stock;
    }
     
     public static void main(String[] args) {
        new Stock();
    }
}
