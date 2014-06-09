package project;

public class Product{
  
  private double price;
  private int ID;
  private int amount;
  private double[] ratings;
  
  public Product(double p, int id, int a, double r, int nr){
    price = p;
    ID = id;
    amount = a;
    
    ratings = new double[nr];
    for(int i=0; i<nr; i++)
      ratings[i] = r;
  }
  
  public void addSingle(){
    amount++;
  }
  
  public void addBulk(int n){
    amount += n;
  }
  
  public void remove(int n){
    amount -= n;
    
    if(amount < 0)
      amount = 0;
  }
  
  public void addRating(int r){
    double[] temp = new double[ratings.length+1];
    
    for(int i=0; i<ratings.length; i++)
      temp[i]=ratings[i];
    
    temp[ratings.length] = r;
    ratings = temp;
  }
  
  public double getPrice(){
    return price;
  }
  
  public int getID(){
    return ID;
  }
  
  public int getAmount(){
    return amount;
  }
  
  public double getAverageRating(){
    double sum = 0.0;
    
    for(int i=0; i<ratings.length; i++)
      sum += ratings[i];
    
    double average = 1.0*sum/ratings.length;
    return (Math.round(average*10))/10.0;
  }
  
  public String getInfo(){
    return (price + ",\t" + ID + ",\t" + amount + ",\t" + getAverageRating() + ",\t" + ratings.length);
  }
}
