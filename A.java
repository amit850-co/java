  
 
    
  class A{
  void pattern(){
      System.out.println("nomal number");
      for( int i=1;i<=4;i++){
       for( int j=1;j<=i;j++){
            System.out.print(i); 
        }
        System.out.println();
      }

 }
  void patterns(){
    System.out.println("reverse  number");
    for( int i=4;i>=1;i--){
      for( int j=1;j<=i;j++){
          System.out.print(i); 
      }
      System.out.println();
    }

}
    
 } 

    




















 class spacialpattern {
    public static void main(String[] args) {
        A amit = new A();
        amit.pattern();
        amit.patterns()
    }
}
