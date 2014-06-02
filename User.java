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
    cart = new ShoppingCart();
  }
  
  public boolean signIn(String pass){
    if(pass.equals(password))
      return true;
    else
      return false;
  }
  
  public void changeEmail(String e){
    email = e;
  }
  
  public void changePass(String p){
    password = p;
  }
  
  public void changeName(String n){
    name = n;
  }
  
  public String getEmail(){
    return email;
  }
  
  public String getName(){
    return name;
  }
  
  public ShoppingCart getCart(){
    return cart;
  }
  
  public String toString(){
    return (name + ", " + email);
  }
}
