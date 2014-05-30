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
}
