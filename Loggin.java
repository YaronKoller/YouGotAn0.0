package project;
import java.io.*;
import java.util.*;

public class Loggin{
  
  private static Scanner in = new Scanner(System.in);
  protected static User online;
  protected static int index;
  
  
  public static boolean user(User[] users) throws IOException{
    System.out.println("USER LOGGIN");
    System.out.println("1. Sign in");
    System.out.println("2. Create new account");
    System.out.println("3. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      return signIn(users);
    }
    else if(input.equals("2")){
      return newAccount(users);
    }
    else
      return false;
  }
  
  
  public static boolean signIn(User[] users) throws IOException{
    System.out.println("Email:");
    String email = in.nextLine();
    
    System.out.println("Password:");
    String pass = in.nextLine();
    System.out.println();
    
    int i = Search.users(users, email);
    
    if(i == -1){
      System.out.println("Incorrect username or password.");
      System.out.println();
      return user(users);
    }
    else if(users[i].checkPass(pass)){
      online = users[i];
      index = i;
      return true;
    }
    else{
      System.out.println("Incorrect username or password.");
      System.out.println();
      return user(users);
    }
  }
  
  
  public static boolean newAccount(User[] users) throws IOException{
    System.out.println("Full name:");
    String name = in.nextLine();
    
    System.out.println("Email address:");
    String email = in.nextLine();
    
    if(Search.users(users, email) != -1){
      System.out.println("An account already exists under this email address.");
      System.out.println();
      return user(users);
    }
    
    System.out.println("Password:");
    String pass = in.nextLine();
    
    User[] temp = new User[users.length+1];
    temp[users.length] = new User(email, pass, name);;
    
    for(int i=0; i<users.length; i++)
      temp[i]=users[i];
    
    Write.users(temp);
    
    System.out.println("Your account has been created.");
    System.out.println();
    
    return user(temp);
  }
  
  
  public static boolean admin(Admin[] admins){
    return false;
  }
}
