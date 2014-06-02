package project;

public class Clothing extends Product{
  
  private String type;
  private String brand;
  private String colour;
  private String size;
  
  public Clothing(String t, String b, String c, String s, double p, int id, int a, double r, int nr){
    super(p, id, a, r, nr);
    type = t;
    brand = b;
    colour = c;
    size = s;
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
  
  public String getSize(){
    return size;
  }
  
  public String toString(){
    return (brand + " " + type + " (" + colour + ")");
  }
}
