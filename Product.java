package project;

public class Product{

  private double price;
  private int ID;
  private int amount;
  private int[] ratings;
  
  public Food(double p, int id, int a){
    price = p;
    ID = id;
    amount = a;
    ratings = new int[0];
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
    int[] temp = new int[ratings.length+1];
    
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
    int sum = 0;
    for(int i=0; i<ratings.length; i++)
      sum += ratings[i];
    return 1.0*sum/ratings.length;
  }
}
