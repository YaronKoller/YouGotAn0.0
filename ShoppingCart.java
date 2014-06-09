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
  
  
  public boolean isEmpty(){
    boolean empty = true;
    
    if(c.length > 0)
      empty = false;
    
    if(f.length > 0)
      empty = false;
    
    if(g.length > 0)
      empty = false;
    
    return empty;
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
  
  
  public int removeProduct(int ID){
    int n = Search.clothes(c, ID);
    if(n != -1){
      Clothing[] C = new Clothing[c.length-1];
      
      for(int i=0; i<C.length; i++){
        if(i<n)
          C[i] = c[i];
        else
          C[i] = c[i+1];
      }
      c = C;
      return 0;
    }
    
    n = Search.food(f, ID);
    if(n != -1){
      Food[] F = new Food[f.length-1];
      
      for(int i=0; i<F.length; i++){
        if(i<n)
          F[i] = f[i];
        else
          F[i] = f[i+1];
      }
      f = F;
      return 0;
    }
    
    n = Search.games(g, ID);
    if(n != -1){
      Game[] G = new Game[g.length-1];
      
      for(int i=0; i<G.length; i++){
        if(i<n)
          G[i] = g[i];
        else
          G[i] = g[i+1];
      }
      g = G;
      return 0;
    }
    
    return 0/0;
  }
  
  
  public void listAll(){
    System.out.println("SHOPPING CART");
    System.out.println();
    
    for(int i=0; i<c.length; i++)
      System.out.println(c[i].toString());
    
    for(int i=0; i<f.length; i++)
      System.out.println(f[i].toString());
    
    for(int i=0; i<g.length; i++)
      System.out.println(g[i].toString());
    
    System.out.println();
  }
  
  
  public double totalPrice(){
    double n = 0.0;
    
    for(int i=0; i<c.length; i++)
      n += c[i].getPrice();
    
    for(int i=0; i<f.length; i++)
      n += f[i].getPrice();
    
    for(int i=0; i<g.length; i++)
      n += g[i].getPrice();
    
    return (Math.round(n*100))/100.0;
  }
  
  
  public void checkOut(){
    c = new Clothing[0];
    f = new Food[0];
    g = new Game[0];
  }
}
