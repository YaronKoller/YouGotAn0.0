package project;

public class Game{
  
  private String title;
  private String genre;
  private String developer;
  private String ageRestriction;
  
  public Game(String t, String g, String d, String a, double p, int id, int a){
    title = t;
    genre = g;
    developer = d;
    ageRestriction = a;
    super(p, id, a);
  }
}
