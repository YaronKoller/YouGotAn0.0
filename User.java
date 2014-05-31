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
  
  public boolean modifyInfo(int choice, String newInfo){
    if(choice=1){
      email = newInfo;
      return true;
    }
    else if(choice=2){
      password = newInfo;
      return true;
    }
    else if(choice=3){
      name = newInfo;
      return true;
    }
    else
      return false;
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
}
