package project;

public class Game extends Product{
  
  private String genre;
  private String publisher;
  private String title;
  
  public Game(String g, String pu, String t, double p, int id, int a, double r, int nr){
    super(p, id, a, r, nr);
    genre = g;
    publisher = pu;
    title = t;
  }
  
  public String getTitle(){
    return title;
  }
  
  public String getGenre(){
    return genre;
  }
  
  public String getPublisher(){
    return publisher;
  }
  
  public String getInfo(){
    return (genre + ",\t" + publisher + ",\t" + title + ",\t" + super.getInfo());
  }
  
  public String toString(){
    return (title + " (by " + publisher + "), ID: " + getID());
  }
}
