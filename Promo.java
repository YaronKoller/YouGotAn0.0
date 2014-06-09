package project;

public class Promo{
  private int ID;
  private int type;
  private int amount;
  
  public Promo(int id, int t, int a){
    ID = id;
    type = t;
    amount = a;
  }
  
  public double findPrice(double price){
    if(type == 1)
      price *= (1-amount/100.0);
    else if(type==2 && price<=amount)
      price = 0;
    else if(type == 2)
      price -= amount;
    
    return (Math.round(price*100))/100.0;
  }
  
  public int getID(){
    return ID;
  }
  
  public String getInfo(){
    return (ID + ",\t" + type + ",\t" + amount);
  }
  
  public String toString(){
    if(type == 1)
      return (amount + "% off");
    else if(type == 2)
      return ("$" + amount + " off");
    else
      return "Invalid promo code";
  }
}
