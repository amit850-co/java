public class Loop {
    public static void main(String[] args) {
       int i=0;
       while (i< 5) {    
        System.out.print("* ");
        int rows =0;
        while (rows<i) {
            System.out.print("*");
            rows++;
        }
        System.out.println();
 i++;
       } 
    }
}
