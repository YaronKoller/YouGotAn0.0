package project;
import java.io.*;

public class Write{
  
  public static void admins(Admin[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("admins.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
  
  public static void users(User[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("users.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
  
  public static void clothes(Clothing[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("clothes.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
  
  public static void food(Food[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("food.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
  
  public static void games(Game[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("games.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
  
  public static void promos(Promo[] a) throws IOException{
    BufferedWriter out = new BufferedWriter(new FileWriter("promos.txt."));
    
    for(int i=0; i<a.length; i++){
      out.write(a[i].getInfo());
      out.newLine();
    }
    out.close();
  }
}
