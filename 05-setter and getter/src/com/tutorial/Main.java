package com.tutorial;

class User{
   // Data Member dengan keyboard private
   private String username;
   private String password;

   User(String username, String password) {
      this.username = username;
      this.password = password;
   }
   
   // method getter
   public String getUsername(){
    return this.username;

   }
    public String getPassword(){
         return this.password;
      }
   // method setter untuk mengganti password
      public void setPassword(String password) {
            this.password = password;
      }

}

public class Main {
   public static void main(String[] args) {
      // instansiansi atau buat objek
      User Person_1 = new User("undikma", "jayajayajaya");

      //get username
      System.out.println(Person_1.getUsername());
      System.out.println(Person_1.getPassword());

      Person_1.setPassword("sukses");

      System.out.println("Password Baru : " + Person_1.getPassword());
   }
}
      
   
  