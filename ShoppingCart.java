package project;

public class ShoppingCart{
  
  private Clothing[] c;
  private Food[] f;
  private Game[] g;
  
  public ShoppingCart(){
    c = new Clothing[0];
    f = new Food[0];
    g = new Game[0];
  }
  
  public void addProduct(Clothing cl){
    Clothing[] temp = new Clothing[c.length+1];
    
    for(int i=0; i<c.length; i++)
      temp[i]=c[i];
    
    temp[c.length] = cl;
    c = temp;
  }
  
  public void addProduct(Food fo){
    Food[] temp = new Food[f.length+1];
    
    for(int i=0; i<f.length; i++)
      temp[i]=f[i];
    
    temp[f.length] = fo;
    f = temp;
  }
  
  public void addProduct(Game ga){
    Game[] temp = new Game[g.length+1];
    
    for(int i=0; i<g.length; i++)
      temp[i]=g[i];
    
    temp[g.length] = ga;
    g = temp;
  }
  
  public String[] listAll(){
    String list[] = new String[2];
    
    list[0]="";
    for(int i=0; i<(c.length-1); i++)
      list[0] += (c[i].toString() + ",");
    list[0] += c[c.length-1].toString();
    
    list[1]="";
    for(int i=0; i<(f.length-1); i++)
      list[1] += (f[i].toString() + ",");
    list[1] += f[f.length-1].toString();
    
    list[2]="";
    for(int i=0; i<(g.length-1); i++)
      list[2] += (g[i].toString() + ",");
    list[2] += g[g.length-1].toString();
    
    return list;
  }
  
  public void checkOut(){
    c = new Clothing[0];
    f = new Food[0];
    g = new Game[0];
  }
}
