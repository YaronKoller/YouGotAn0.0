package project;

public class Admin{
  
  private int ID;
  private String password;
  private String name;
  
  public Admin(int id, String p, String n){
    ID = id;
    password = p;
    name = n;
  }
  
  public boolean signIn(String pass){
    if(pass.equals(password))
      return true;
    else
      return false;
  }
  
  public int getID(){
    return ID;
  }
  
  public String getName(){
    return name;
  }
  
  public String toString(){
    return (name + ", " + ID);
  }
}
