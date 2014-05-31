package project;

public class ShoppingCart{
  
  private Clothing[] c;
  private Game[] g;
  private Food[] f;
  
  public void ShoppingCart(){
    c = new Clothing[0];
    g = new Game[0];
    f = new Food[0];
  }
  
  public void addProduct(cl: Clothing){
    Clothing[] temp = new Clothing[c.length+1];
    
    for(int i=0; i<c.length; i++)
      temp[i]=c[i];
    
    temp[c.length] = cl;
    c = temp;
  }
  
  public void addProduct(ga: Game){
    Game[] temp = new Game[g.length+1];
    
    for(int i=0; i<g.length; i++)
      temp[i]=g[i];
    
    temp[g.length] = ga;
    g = temp;
  }
  
  public void addProduct(fo: Food){
    Food[] temp = new Food[f.length+1];
    
    for(int i=0; i<f.length; i++)
      temp[i]=f[i];
    
    temp[f.length] = fo;
    f = temp;
  }
  
  public String[] listProducts(){
    String list[] = new String[3];
    
    list[0]="";
    for(int i=0; i<c.length; i++)
      list[0] += (c[i].toString() + "_");
    
    list[1]="";
    for(int i=0; i<g.length; i++)
      list[1] += (g[i].toString() + "_");
    
    list[2]="";
    for(int i=0; i<f.length; i++)
      list[2] += (f[i].toString() + "_");
    
    return list;
  }
  
  public void checkOut(){
    c = new Clothing[0];
    g = new Game[0];
    f = new Food[0];
  }
}
