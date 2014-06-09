package project;
import java.io.*;
import java.util.*;

public class Menu{
  
  private static Scanner in = new Scanner(System.in);
  private static Admin[] admins;
  private static User[] users;
  private static Clothing[] clothes;
  private static Food[] food;
  private static Game[] games;
  private static Promo[] promos;
  
  
  public static void main(String[] args) throws IOException{
    boolean repeat = true;
    
    while(repeat){
      admins = Read.admins();
      users = Read.users();
      clothes = Read.clothes();
      food = Read.food();
      games = Read.games();
      promos = Read.promos();
      
      System.out.println("Welcome to LooMart!");
      System.out.println("1. Browse store");
      System.out.println("2. User loggin");
      System.out.println("3. Admin loggin");
      System.out.println("4. [Exit]");
      
      String input = in.nextLine();
      System.out.println();
      
      if(input.equals("1")){
        Store.browse(clothes, food, games);
        clothes = Read.clothes();
        food = Read.food();
        games = Read.games();
      }
      
      else if(input.equals("2")){
        boolean loggedIn = Loggin.user(users);
        users = Read.users();
        if(loggedIn)
          userMenu();
      }
      
      else if(input.equals("3")){
        boolean loggedIn = Loggin.admin(admins);
        admins = Read.admins();
        if(loggedIn)
          adminMenu();
      }
      
      else{
        System.out.println("Thank you for shopping at LooMart!");
        repeat = false;
      }
    }
  }
  
  
  public static void userMenu() throws IOException{
    System.out.println("Welcome, " + Loggin.online.getName());
    System.out.println("1. Browse store");
    System.out.println("2. View shopping cart");
    System.out.println("3. Manage account info");
    System.out.println("4. Sign out");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      Store.browse(clothes, food, games);
      clothes = Read.clothes();
      food = Read.food();
      games = Read.games();
      userMenu();
    }
    
    else if(input.equals("2")){
      int n = Store.cart(promos, 0);
      
      if(n != 0){
        Promo[] temp = new Promo[promos.length-1];
        
        for(int i=0; i<temp.length; i++){
          if(i<n)
            temp[i] = promos[i];
          else
            temp[i] = promos[i+1];
        }
        promos = temp;
        Write.promos(promos);
      }
      userMenu();
    }
    
    else if(input.equals("3")){
      System.out.println("Please confirm password before continuing:");
      input = in.nextLine();
      System.out.println();
      
      if(Loggin.online.checkPass(input)){
        Loggin.online = Update.user(users, Loggin.online);
        users[Loggin.index] = Loggin.online;
        Write.users(users);
      }
      else{
        System.out.println("Incorrect password!");
        System.out.println();
      }
      userMenu();
    }
    
    else if(input.equals("4"))
      Loggin.online = null;
  }
  
  
  public static void adminMenu() throws IOException{
    
  }
}
