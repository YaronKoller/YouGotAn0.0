package project;
import java.util.*;

public class Update{
  
  private static Scanner in = new Scanner(System.in);
  
  public static User user(User[] users, User u){
    System.out.println("UPDATE USER INFO");
    System.out.println("User: " + u);
    System.out.println();
    
    System.out.println("1. Change name");
    System.out.println("2. Change email");
    System.out.println("3. Change password");
    System.out.println("4. [Go back]");
    
    String choice = in.nextLine();
    System.out.println();
    
    if(choice.equals("1")){
      System.out.println("Enter new name:");
      u.changeName(in.nextLine());
      System.out.println("Name updated successfully.");
      System.out.println();
      return user(users, u);
    }
    
    else if(choice.equals("2")){
      System.out.println("Enter new email address:");
      String email = in.nextLine();
      
      if(Search.users(users, email) != -1){
        System.out.println("An account already exists under this email address.");
        System.out.println();
        return user(users, u);
      }
      
      u.changeEmail(email);
      System.out.println("Email address updated successfully.");
      System.out.println();
      return user(users, u);
    }
    
    else if(choice.equals("3")){
      System.out.println("Enter new password:");
      u.changePass(in.nextLine());
      System.out.println("Password updated successfully.");
      System.out.println();
      return user(users, u);
    }
    
    return u;
  }
}
