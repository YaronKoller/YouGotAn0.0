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
  
  public String getID(){
    return ID;
  }
  
  public String getName(){
    return name;
  }
}
