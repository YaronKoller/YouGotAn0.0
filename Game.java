package project;

public class Game extends Product{
  
  private String title;
  private String genre;
  private String developer;
  private String ageRestriction;
  
  public Game(String t, String g, String d, String ar, double p, int id, int a){
    title = t;
    genre = g;
    developer = d;
    ageRestriction = ar;
    super(p, id, a);
  }
  
  public String getTitle(){
    return title;
  }
  
  public String getGenre(){
    return genre;
  }
  
  public String getDeveloper(){
    return developer;
  }
  
  public String getAgeRestriction(){
    return ageRestriction;
  }
  
  public String toString(){
    return (title + " by " + developer);
  }
}
