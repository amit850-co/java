import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n=input.nextInt();
        int array[] = new int [n];
        int nagativenumber=0 ;
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
          array[i]=input.nextInt();
            }  
            
            for(int i=0;i<array.length;i++){
              if (array[i]<0){
                nagativenumber++;
             }
              
         
         }
       
        
          
         System.out.println("nagative number" +nagativenumber ); 
            }  
      
       
        }
       



    
  
