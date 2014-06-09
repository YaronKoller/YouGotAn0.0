package project;
import java.io.*;

public class Read{
  
  public static Admin[] admins() throws IOException{
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
  
  
  public static User[] users() throws IOException{
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
  
  
  public static Clothing[] clothes() throws IOException{
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
  
  
  public static Food[] food() throws IOException{
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
  
  
  public static Game[] games() throws IOException{
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
  
  
  public static Promo[] promos() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("promos.txt"));
    BufferedReader check = new BufferedReader(new FileReader("promos.txt"));
    int n = 0;
    
    while(check.readLine()!=null)
      n++;
    
    Promo[] promos = new Promo[n];
    
    for(int i=0; i<n; i++){
      String[] temp = in.readLine().split(",");
      promos[i] = new Promo(Integer.parseInt(temp[0].trim()), Integer.parseInt(temp[1].trim()), Integer.parseInt(temp[2].trim())); 
    }
    return promos;
  }
}
