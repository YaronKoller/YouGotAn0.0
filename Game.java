package project;

public class Game extends Product{
  
  private String genre;
  private String developer;
  private String title;
  
  public Game(String g, String d, String t, double p, int id, int a, double r, int nr){
    super(p, id, a, r, nr);
    genre = g;
    developer = d;
    title = t;
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
  
  public String toString(){
    return (title + " by " + developer);
  }
}
