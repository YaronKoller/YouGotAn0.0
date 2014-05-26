package project;

public class User{
  
  private String email;
  private String password;
  private String name;
  private ShoppingCart cart;
  
  public User(String e, String p, String n){
    email = e;
    password = p;
    name = n;
  }
}
