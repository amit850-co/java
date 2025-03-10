import java.util.Scanner;

public class aarayreverse {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in) ;
      System.out.println("enter the array size");
      int n=input.nextInt() ;
      int array[]=new int[n];
      int temp[]=new int[n];
      int tempvar=n;
      for( int i=0;i<n;i++){
        array[i]=input.nextInt();
      }
      for(int i=0;i<n;i++ ){
        temp[tempvar-1]=array[i];
        tempvar=tempvar-1;

      }
      System.out.println("array is reverse");
      for( int i=0;i<n;i++){
       System.out.println(temp[i]);

       

       }

       
    }
    
}
