package project;

public class Search{
  
  public static int admins(Admin[] array, int target){
    for(int i=0; i<array.length; i++){
      if(array[i].getID() == target)
        return i;
    }
    return -1;
  }
  
  public static int users(User[] array, String target){
    for(int i=0; i<array.length; i++){
      if(array[i].getEmail().equalsIgnoreCase(target))
        return i;
    }
    return -1;
  }
  
  public static int clothes(Clothing[] array, int target){
    for(int i=0; i<array.length; i++){
      if(array[i].getID() == target)
        return i;
    }
    return -1;
  }
  
  public static int food(Food[] array, int target){
    for(int i=0; i<array.length; i++){
      if(array[i].getID() == target)
        return i;
    }
    return -1;
  }
  
  public static int games(Game[] array, int target){
    for(int i=0; i<array.length; i++){
      if(array[i].getID() == target)
        return i;
    }
    return -1;
  }
  
  public static int promos(Promo[] array, int target){
    for(int i=0; i<array.length; i++){
      if(array[i].getID() == target)
        return i;
    }
    return 0;
  }
}
