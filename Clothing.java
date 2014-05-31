package project;

public class Clothing extends Product{
  
  private String type;
  private String brand;
  private String colour;
  private String material;
  
  public Game(String t, String b, String c, String m, double p, int id, int a){
    type = t;
    brand = b;
    colour = c;
    material = m;
    super(p, id, a);
  }
  
  public String getType(){
    return type;
  }
  
  public String getBrand(){
    return brand;
  }
  
  public String getColour(){
    return colour;
  }
  
  public String getMaterial(){
    return material;
  }
  
  public String toString(){
    return (brand + " " + type + " (" + colour + ")";
  }
}
