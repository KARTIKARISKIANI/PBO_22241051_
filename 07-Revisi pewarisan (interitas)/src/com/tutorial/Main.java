package com.tutorial;

class Hero{
   String nama;
   float health;

   void display(){
      System.out.println("Nama Hero : " + nama);
      System.out.println("Health : " + 45);
   }
}

class HeroTank extends Hero{
   float health;
   void display(){
      System.out.println("Nama Hero : " + nama) ;
      System.out.println("Health : " + 54);
   }

}

public class Main {
   public static void main(String[] args) {
      Hero hero_1 = new Hero();
      hero_1.nama = "Laila";
      hero_1.display();

      HeroTank hero_2 = new HeroTank();
      hero_2.nama = "Zilong";
      hero_2.display();
   }
}
      
     