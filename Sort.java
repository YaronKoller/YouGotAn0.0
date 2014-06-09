package project;

public class Sort{
  
  public static Clothing[] byType(Clothing[] A){
    for(int i=1; i<A.length; i++){
      Clothing value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getType().charAt(0) > value.getType().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Clothing[] byBrand(Clothing[] A){
    for(int i=1; i<A.length; i++){
      Clothing value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getBrand().charAt(0) > value.getBrand().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Clothing[] byPrice(Clothing[] A){
    for(int i=1; i<A.length; i++){
      Clothing value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getPrice() > value.getPrice()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Clothing[] topRated(Clothing[] A){
    for(int i=1; i<A.length; i++){
      Clothing value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getAverageRating() < value.getAverageRating()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Food[] byType(Food[] A){
    for(int i=1; i<A.length; i++){
      Food value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getType().charAt(0) > value.getType().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Food[] byProducer(Food[] A){
    for(int i=1; i<A.length; i++){
      Food value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getProducer().charAt(0) > value.getProducer().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Food[] byPrice(Food[] A){
    for(int i=1; i<A.length; i++){
      Food value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getPrice() > value.getPrice()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Food[] topRated(Food[] A){
    for(int i=1; i<A.length; i++){
      Food value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getAverageRating() < value.getAverageRating()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Game[] byGenre(Game[] A){
    for(int i=1; i<A.length; i++){
      Game value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getGenre().charAt(0) > value.getGenre().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Game[] byPublisher(Game[] A){
    for(int i=1; i<A.length; i++){
      Game value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getPublisher().charAt(0) > value.getPublisher().charAt(0)){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Game[] byPrice(Game[] A){
    for(int i=1; i<A.length; i++){
      Game value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getPrice() > value.getPrice()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
  
  
  public static Game[] topRated(Game[] A){
    for(int i=1; i<A.length; i++){
      Game value = A[i];
      int j = i-1;
      while(j >= 0 && A[j].getAverageRating() < value.getAverageRating()){
        A[j+1] = A[j];
        j = j-1;
      }
      A[j+1] = value;
    }
    return A;
  }
}
