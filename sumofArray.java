

public class sumofArray {
    public static void main(String[] args) {
      
        System.out.println("sum of two arrays");
        int[] numarray = ArrayUtility.inputArray();
    //  long sum=sum(numarray);
     // int avg=average(numarray);
     /// System.out.println("sum of the number is "+ sum);
      ////System.out.println("average of number is"+avg);
    
//}
  //  public static long sum(int[] numarray){
     //   long sum=0;
     //   int i=0;
     //   while (i<numarray.length) {
      //      sum+= numarray[i];
      //      i++;
       // }
       // return sum;
   // }
  ////  public static int average(int[] numarray){
      //  long sum = sum(numarray);
      //  return (int)  (sum/numarray.length);
 //   }




   //    }

   long sum=sum(numarray);
   int fact=fact(numarray);
   System.out.println("sum of the number "+sum);
   System.out.println("sum of the number "+fact);
    }


    public static long sum(int[] numarray){
      int  sum=0;
      int i=0;
       while (i<numarray.length) {
      sum+=numarray[i];
      
        i++;
       }
       
       
        return sum;


    }
    public static int fact (int[] numarray){
       
        long sum=sum(numarray);



        return (int) (sum/numarray.length);
     }  
      } 
   