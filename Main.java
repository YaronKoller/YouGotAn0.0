package project;
import java.io.*;
import java.util.*;

public class Main{
  
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    
    Admin[] admins = readAdmins();
    User[] users = readUsers();
    Clothing[] clothes = readClothes();
    Food[] food = readFood();
    Game[] games = readGames();
    
    boolean repeat = true;
    
    while(repeat){
      System.out.println("Welcome to LooMart!");
      System.out.println("1. Browse store");
      System.out.println("2. User loggin");
      System.out.println("3. Admin loggin");
      System.out.println("4. Exit");
      
      String input = in.nextLine();
      System.out.println();
      
      if(input.equals("1")){
        display(admins);
        display(users);
        display(clothes);
        display(food);
        display(games);
      }
      else if(input.equals("2")){
        System.out.println();
      }
      else if(input.equals("3")){
        System.out.println();
      }
      else
        repeat = false;
    }
  }
  
  
  public static Admin[] readAdmins() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("admins.txt"));
    BufferedReader check = new BufferedReader(new FileReader("admins.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    Admin[] admins = new Admin[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      admins[i] = new Admin(Integer.parseInt(temp[0].trim()), temp[1].trim(), temp[2].trim());
    }
    return admins;
  }
  
  
  public static User[] readUsers() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("users.txt"));
    BufferedReader check = new BufferedReader(new FileReader("users.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    User[] users = new User[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      users[i] = new User(temp[0].trim(), temp[1].trim(), temp[2].trim());
    }
    return users;
  }
  
  
  public static Clothing[] readClothes() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("clothes.txt"));
    BufferedReader check = new BufferedReader(new FileReader("clothes.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    Clothing[] clothes = new Clothing[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      clothes[i] = new Clothing(temp[0].trim(), temp[1].trim(), temp[2].trim(), temp[3].trim(), Double.parseDouble(temp[4].trim()), 
                                Integer.parseInt(temp[5].trim()), Integer.parseInt(temp[6].trim()), Double.parseDouble(temp[7].trim()), 
                                Integer.parseInt(temp[8].trim()));
    }
    return clothes;
  }
  
  
  public static Food[] readFood() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("food.txt"));
    BufferedReader check = new BufferedReader(new FileReader("food.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    Food[] food = new Food[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      food[i] = new Food(temp[0].trim(), temp[1].trim(), Integer.parseInt(temp[2].trim()), Boolean.parseBoolean(temp[3].trim()), 
                         Double.parseDouble(temp[4].trim()), Integer.parseInt(temp[5].trim()), Integer.parseInt(temp[6].trim()), 
                         Double.parseDouble(temp[7].trim()), Integer.parseInt(temp[8].trim()));
    }
    return food;
  }
  
  
  public static Game[] readGames() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("games.txt"));
    BufferedReader check = new BufferedReader(new FileReader("games.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    Game[] games = new Game[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      games[i] = new Game(temp[0].trim(), temp[1].trim(), temp[2].trim(), Double.parseDouble(temp[3].trim()), Integer.parseInt(temp[4].trim()), 
                          Integer.parseInt(temp[5].trim()), Double.parseDouble(temp[6].trim()), Integer.parseInt(temp[7].trim()));
    }
    return games;
  }
  
  
  public static void display(Admin[] a){
    System.out.println("Admins:");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void display(User[] a){
    System.out.println("Users:");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void display(Clothing[] a){
    System.out.println("Clothes:");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void display(Food[] a){
    System.out.println("Food:");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void display(Game[] a){
    System.out.println("Games:");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
}
