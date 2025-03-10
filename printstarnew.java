class B{
    void Pattern(){
      System.out.println("normal number");
      for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j );
            
        }
        System.out.println();
      }
    }
void Patterns(){
    System.out.println("reverse number");
    for(int i=1;i<=4;i++){
      for(int j=1;j<=4-i+1;j++){
         System.out.print(j );
          
      }
      System.out.println();
    }
  }
    }



  public class printstarnew {
    public static void main(String[] args) {
         B ob = new B();
        ob. Pattern();
        ob.Patterns();
            }
        
          
    
}

