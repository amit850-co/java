class A{
    void pattern(){
        System.out.println("normal pattren");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
               System.out.print(i); 
            }
            System.out.println();
        }

    }
  

   void patterns(){
   System.out.println("reverse number");
   for(int i=4;i>=1;i--){
    for(int j=1;j<=i+1;j++){
       System.out.print(i); 
    }
    System.out.println();
} 
   }



 
   }




public class hash {

    public static void main(String[] args) {
         A ob =new A();
        ob.pattern();
        ob.patterns();
       
    }
}

 

