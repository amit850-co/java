import java.util.Scanner;



public class Aaryp1 {
    public static void main(String[] args) { //
        Scanner input=new Scanner(System.in);
         int[] Aarryof={1,10,15,20};
         int num=input.nextInt();
         boolean isnumber=isnumber(Aarryof, num);
        if (isnumber) {
            System.out.println("yes this is the number");
        }else{
            System.out.println("not a array number");
        }
    }


    public static boolean isnumber(int[] Aarryof, int num){
      int index=0;
      
      while (index<Aarryof.length) {
              if (Aarryof[index]==num) {
                return true;
              }
        index++;
      }
      
      
      
        return false;


    }
}
