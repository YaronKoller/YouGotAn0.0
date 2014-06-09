package project;
import java.io.*;
import java.util.*;

public class Store{
  
  private static Scanner in = new Scanner(System.in);
  
  public static void browse(Clothing[] clothes, Food[] food, Game[] games) throws IOException{
    System.out.println("What type of products would you like to browse?");
    System.out.println("1. Clothing");
    System.out.println("2. Food");
    System.out.println("3. Games");
    System.out.println("4. Search through all products");
    System.out.println("5. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      browse(clothes);
      browse(clothes, food, games);
    }
    else if(input.equals("2")){
      browse(food);
      browse(clothes, food, games);
    }
    else if(input.equals("3")){
      browse(games);
      browse(clothes, food, games);
    }
    else if(input.equals("4")){
      search(clothes, food, games);
      browse(clothes, food, games);
    }
  }
  
  
  public static void browse(Clothing[] clothes) throws IOException{
    System.out.println("How would you like to view the products?");
    System.out.println("1. By clothing type");
    System.out.println("2. By brand");
    System.out.println("3. By price");
    System.out.println("4. Top rated");
    System.out.println("5. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      Print.clothes(Sort.byType(clothes));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.clothes(clothes, Integer.parseInt(choice));
        clothes[i].remove(browse(clothes[i]));
        Write.clothes(clothes);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(clothes);
      }
    }
    
    else if(input.equals("2")){
      Print.clothes(Sort.byBrand(clothes));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.clothes(clothes, Integer.parseInt(choice));
        clothes[i].remove(browse(clothes[i]));
        Write.clothes(clothes);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(clothes);
      }
    }
    
    else if(input.equals("3")){
      Print.clothes(Sort.byPrice(clothes));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.clothes(clothes, Integer.parseInt(choice));
        clothes[i].remove(browse(clothes[i]));
        Write.clothes(clothes);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(clothes);
      }
    }
    
    else if(input.equals("4")){
      Print.clothes(Sort.topRated(clothes));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.clothes(clothes, Integer.parseInt(choice));
        clothes[i].remove(browse(clothes[i]));
        Write.clothes(clothes);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(clothes);
      }
    }
  }
  
  
  public static void browse(Food[] food) throws IOException{
    System.out.println("How would you like to view the products?");
    System.out.println("1. By food type");
    System.out.println("2. By producer");
    System.out.println("3. By price");
    System.out.println("4. Top rated");
    System.out.println("5. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      Print.food(Sort.byType(food));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.food(food, Integer.parseInt(choice));
        food[i].remove(browse(food[i]));
        Write.food(food);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(food);
      }
    }
    
    else if(input.equals("2")){
      Print.food(Sort.byProducer(food));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.food(food, Integer.parseInt(choice));
        food[i].remove(browse(food[i]));
        Write.food(food);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(food);
      }
    }
    
    else if(input.equals("3")){
      Print.food(Sort.byPrice(food));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.food(food, Integer.parseInt(choice));
        food[i].remove(browse(food[i]));
        Write.food(food);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(food);
      }
    }
    
    else if(input.equals("4")){
      Print.food(Sort.topRated(food));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.food(food, Integer.parseInt(choice));
        food[i].remove(browse(food[i]));
        Write.food(food);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(food);
      }
    }
  }
  
  
  public static void browse(Game[] games) throws IOException{
    System.out.println("How would you like to view the products?");
    System.out.println("1. By genre");
    System.out.println("2. By publisher");
    System.out.println("3. By price");
    System.out.println("4. Top rated");
    System.out.println("5. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      Print.games(Sort.byGenre(games));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.games(games, Integer.parseInt(choice));
        games[i].remove(browse(games[i]));
        Write.games(games);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(games);
      }
    }
    
    else if(input.equals("2")){
      Print.games(Sort.byPublisher(games));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.games(games, Integer.parseInt(choice));
        games[i].remove(browse(games[i]));
        Write.games(games);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(games);
      }
    }
    
    else if(input.equals("3")){
      Print.games(Sort.byPrice(games));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.games(games, Integer.parseInt(choice));
        games[i].remove(browse(games[i]));
        Write.games(games);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(games);
      }
    }
    
    else if(input.equals("4")){
      Print.games(Sort.topRated(games));
      System.out.println("Choose a product and enter its ID number below:");
      String choice = in.nextLine();
      System.out.println();
      
      try{
        int i = Search.games(games, Integer.parseInt(choice));
        games[i].remove(browse(games[i]));
        Write.games(games);
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        browse(games);
      }
    }
  }
  
  
  public static void search(Clothing[] clothes, Food[] food, Game[] games) throws IOException{
    System.out.println("Enter any product's ID number below:");
    String input = in.nextLine();
    System.out.println();
    
    int ID;
    
    try{
      ID = Integer.parseInt(input);
    }
    catch(Exception e){
      System.out.println("Not a valid ID number.");
      System.out.println();
      return;
    }
    
    int i = Search.clothes(clothes, ID);
    if(i != -1){
      clothes[i].remove(browse(clothes[i]));
      Write.clothes(clothes);
      search(clothes, food, games);
      return;
    }
    
    i = Search.food(food, ID);
    if(i != -1){
      food[i].remove(browse(food[i]));
      Write.food(food);
      search(clothes, food, games);
      return;
    }
    
    i = Search.games(games, ID);
    if(i != -1){
      games[i].remove(browse(games[i]));
      Write.games(games);
      search(clothes, food, games);
      return;
    }
    
    System.out.println("Not a valid ID number.");
    System.out.println();
    return;
  }
  
  
  public static int browse(Clothing A){
    System.out.println(A);
    System.out.println("Available in size: " + A.getSize());
    System.out.println("Customer rating: " + A.getAverageRating() + "/5 stars");
    System.out.println("Amount in stock: " + A.getAmount());
    System.out.println("PRICE: $" + A.getPrice());
    System.out.println("ID: " + A.getID());
    System.out.println();
    
    System.out.println("What would you like to do?");
    System.out.println("1. Add to shopping cart");
    System.out.println("2. Rate the product");
    System.out.println("3. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      if(Loggin.online == null){
        System.out.println("You must be signed in to add a product to your shopping cart.");
        System.out.println();
        return browse(A);
      }
      
      else if(A.getAmount() < 1){
        System.out.println("This product is currently out of stock.");
        System.out.println();
        return browse(A);
      }
      
      else{
        Loggin.online.getCart().addProduct(A);
        System.out.println(A + " was added to cart successfully!");
        System.out.println();
        return 1;
      }
    }
    
    else if(input.equals("2")){
      System.out.println("What would you like to rate this product (out of 5)?");
      input = in.nextLine();
      
      try{
        int n = Integer.parseInt(input);
        if(n>=0 && n<=5){
          A.addRating(n);
          System.out.println("Rating added. Thanks for your input!");
          System.out.println();
        }
        else
          n = 0/0;
      }
      catch(Exception e){
        System.out.println("Not a valid rating.");
        System.out.println();
      }
      finally{
        return browse(A);
      }
    }
    
    return 0;
  }
  
  
  public static int browse(Food A){
    System.out.println(A);
    System.out.println("Calories: " + A.getCalories());
    if(A.getKosher())
      System.out.println("Kosher!");
    System.out.println("Customer rating: " + A.getAverageRating() + "/5 stars");
    System.out.println("Amount in stock: " + A.getAmount());
    System.out.println("PRICE: $" + A.getPrice());
    System.out.println("ID: " + A.getID());
    System.out.println();
    
    System.out.println("What would you like to do?");
    System.out.println("1. Add to shopping cart");
    System.out.println("2. Rate the product");
    System.out.println("3. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      if(Loggin.online == null){
        System.out.println("You must be signed in to add a product to your shopping cart.");
        System.out.println();
        return browse(A);
      }
      
      else if(A.getAmount() < 1){
        System.out.println("This product is currently out of stock.");
        System.out.println();
        return browse(A);
      }
      
      else{
        Loggin.online.getCart().addProduct(A);
        System.out.println(A + " was added to cart successfully!");
        System.out.println();
        return 1;
      }
    }
    
    else if(input.equals("2")){
      System.out.println("What would you like to rate this product (out of 5)?");
      input = in.nextLine();
      
      try{
        int n = Integer.parseInt(input);
        if(n>=0 && n<=5){
          A.addRating(n);
          System.out.println("Rating added. Thanks for your input!");
          System.out.println();
        }
        else
          n = 0/0;
      }
      catch(Exception e){
        System.out.println("Not a valid rating.");
        System.out.println();
      }
      finally{
        return browse(A);
      }
    }
    
    return 0;
  }
  
  
  public static int browse(Game A){
    System.out.println(A);
    System.out.println("Genre: " + A.getGenre());
    System.out.println("Customer rating: " + A.getAverageRating() + "/5 stars");
    System.out.println("Amount in stock: " + A.getAmount());
    System.out.println("PRICE: $" + A.getPrice());
    System.out.println("ID: " + A.getID());
    System.out.println();
    
    System.out.println("What would you like to do?");
    System.out.println("1. Add to shopping cart");
    System.out.println("2. Rate the product");
    System.out.println("3. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      if(Loggin.online == null){
        System.out.println("You must be signed in to add a product to your shopping cart.");
        System.out.println();
        return browse(A);
      }
      
      else if(A.getAmount() < 1){
        System.out.println("This product is currently out of stock.");
        System.out.println();
        return browse(A);
      }
      
      else{
        Loggin.online.getCart().addProduct(A);
        System.out.println(A + " was added to cart successfully!");
        System.out.println();
        return 1;
      }
    }
    
    else if(input.equals("2")){
      System.out.println("What would you like to rate this product (out of 5)?");
      input = in.nextLine();
      
      try{
        int n = Integer.parseInt(input);
        if(n>=0 && n<=5){
          A.addRating(n);
          System.out.println("Rating added. Thanks for your input!");
          System.out.println();
        }
        else
          n = 0/0;
      }
      catch(Exception e){
        System.out.println("Not a valid rating.");
        System.out.println();
      }
      finally{
        return browse(A);
      }
    }
    
    return 0;
  }
  
  
  public static int cart(Promo[] promos, int n){
    if(Loggin.online.getCart().isEmpty()){
      System.out.println("Your shopping cart is empty!");
      System.out.println();
      return 0;
    }
    
    Loggin.online.getCart().listAll();
    double price = Loggin.online.getCart().totalPrice();
    
    if(n!=0){
      price = promos[n].findPrice(price);
      System.out.println("Promotion: " + promos[n]);
      System.out.println();
    }
    
    System.out.println("Subtotal: $" + price);
    System.out.println("Total: $" + (Math.round(price*113))/100.0);
    System.out.println();
    
    System.out.println("What would you like to do?");
    System.out.println("1. Remove a product");
    System.out.println("2. Enter promo code");
    System.out.println("3. Proceed to checkout");
    System.out.println("4. [Go back]");
    
    String input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      System.out.println("Enter the ID number of the product you would like to remove:");
      input = in.nextLine();
      System.out.println();
      
      try{
        Loggin.online.getCart().removeProduct(Integer.parseInt(input));
        System.out.println("Product removed successfully.");
        System.out.println();
      }
      catch(Exception e){
        System.out.println("Not a valid ID number.");
        System.out.println();
      }
      finally{
        return cart(promos, n);
      }
    }
    
    else if(input.equals("2")){
      System.out.println("Enter any available promo code below:");
      System.out.println("(Note: this will replace any currently activated promo code)");
      input = in.nextLine();
      System.out.println();
      
      try{
        n = Search.promos(promos, Integer.parseInt(input));
      }
      catch(Exception e){}
      
      price = promos[n].findPrice(Loggin.online.getCart().totalPrice());
      System.out.println(promos[n]);
      System.out.println();
      
      System.out.println("Subtotal: $" + price);
      System.out.println("Total: $" + (Math.round(price*113))/100.0);
      System.out.println();
      
      System.out.println("What would you like to do?");
      System.out.println("1. Proceed to checkout");
      System.out.println("2. [Return to shopping cart]");
      
      input = in.nextLine();
      System.out.println();
      
      if(input.equals("1")){
        if(checkout(price))
          return n;
        else
          return cart(promos, n);
      }
      else
        return cart(promos, n);
    }
    
    else if(input.equals("3")){
      if(checkout(price))
        return n;
      else
        return cart(promos, n);
    }
    
    return 0;
  }
  
  
  public static boolean checkout(double price){
    System.out.println("CHECKOUT");
    System.out.println();
    
    System.out.println("Credit card number:");
    String input = in.nextLine();
    System.out.println();
    
    System.out.println("Expiry date:");
    input = in.nextLine();
    System.out.println();
    
    System.out.println("Security code:");
    input = in.nextLine();
    System.out.println();
    
    System.out.println("Delivery adress:");
    input = in.nextLine();
    System.out.println();
    
    System.out.println("Subtotal: $" + price);
    System.out.println("Total: $" + (Math.round(price*113))/100.0);
    System.out.println();
    
    System.out.println("1. [Confirm]");
    System.out.println("2. [Cancel]");
    input = in.nextLine();
    System.out.println();
    
    if(input.equals("1")){
      Loggin.online.getCart().checkOut();
      System.out.println("Thank you for shopping at LooMart!");
      System.out.println("Please come again");
      System.out.println();
      return true;
    }
    else
      return false;
  }
}
