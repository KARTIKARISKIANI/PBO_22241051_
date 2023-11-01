package com.tutorial;

class Polos{
   String dataString;
   int dataInterger;
}

public class Main {
   public static void main(String[] args) {
      // intansiasi objek
      Polos pls = new Polos();

      // memberi nilai pada objek pls
      pls.dataString = "polos";
      pls.dataInterger = 110;

      System.out.println("dataString : " + pls.dataString);
      System.out.println("dataInterger : " + pls.dataInterger);


   }
}