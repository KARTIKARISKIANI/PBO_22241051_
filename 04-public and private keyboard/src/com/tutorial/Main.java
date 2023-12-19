package com.tutorial;

class player {
    // Data Member
    String name; // default, bisa diakses oleh class lain
    public int exp; // public, bisa diakses oleh class
    private int health; // private, tidak bisa diakses oleh class lain

    player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

void Display() {
    
        System.out.println("Nama Player : " + this.
        name);
        System.out.println("Player EXP : " + this.
        exp);
        System.out.println("Player Health : " + this.
        health);
}
       





}


public class Main {
    public static void main(String[] arg) {
        // instansiansi atau member pembuat objek baru
        player hero_1 = new player ("kartika",
        20, 100);

        hero_1.Display();
       

    }   
}