package project;

public class Food{
  
  private String type;
  private String producer;
  private int calories;
  private boolean kosher;
  
  public Food(String t, String pr, int c, boolean k, double p, int id, int a){
    type = t;
    producer = pr;
    calories = c;
    kosher = k;
    super(p, id, a);
  }
}
