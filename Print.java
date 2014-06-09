package project;

public class Print{
  
  public static void admins(Admin[] a){
    System.out.println("ADMINS");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void users(User[] a){
    System.out.println("USERS");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
    System.out.println();
  }
  
  
  public static void clothes(Clothing[] a){
    System.out.println("CLOTHES");
    System.out.println();
    
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
      System.out.println("Available in size: " + a[i].getSize());
      
      System.out.println("Customer rating: " + a[i].getAverageRating() + "/5 stars");
      System.out.println("Amount in stock: " + a[i].getAmount());
      System.out.println("PRICE: $" + a[i].getPrice());
      
      System.out.println();
    }
  }
  
  
  public static void food(Food[] a){
    System.out.println("FOOD");
    System.out.println();
    
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
      System.out.println("Calories: " + a[i].getCalories());
      
      if(a[i].getKosher())
        System.out.println("Kosher!");
      
      System.out.println("Customer rating: " + a[i].getAverageRating() + "/5 stars");
      System.out.println("Amount in stock: " + a[i].getAmount());
      System.out.println("PRICE: $" + a[i].getPrice());
      
      System.out.println();
    }
  }
  
  
  public static void games(Game[] a){
    System.out.println("GAMES");
    System.out.println();
    
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
      System.out.println("Genre: " + a[i].getGenre());
      
      System.out.println("Customer rating: " + a[i].getAverageRating() + "/5 stars");
      System.out.println("Amount in stock: " + a[i].getAmount());
      System.out.println("PRICE: $" + a[i].getPrice());
      
      System.out.println();
    }
  }
}
