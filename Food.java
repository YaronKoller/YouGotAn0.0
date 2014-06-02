package project;

public class Food extends Product{
  
  private String type;
  private String producer;
  private int calories;
  private boolean kosher;
  
  public Food(String t, String pr, int c, boolean k, double p, int id, int a, double r, int nr){
    super(p, id, a, r, nr);
    type = t;
    producer = pr;
    calories = c;
    kosher = k;
  }
  
  public String getType(){
    return type;
  }
  
  public String getProducer(){
    return producer;
  }
  
  public int getCalories(){
    return calories;
  }
  
  public boolean getKosher(){
    return kosher;
  }
  
  public String toString(){
    return (producer + " " + type);
  }
}
