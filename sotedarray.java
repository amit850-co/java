 class sotedarray {
    public static void main(String[] args) {
        int arr[]=ArrayUtility.inputArray();
      
        boolean isdcreee=isdcreee(arr);
        boolean isin=isin(arr);
       if (isin|| isdcreee) {
        System.out.println("your array is soted");
       }
       else{
        System.out.println("your array is not soted");
       }
    }
    public static boolean isdcreee(int arr[]){
       int i=1; 
       while (i<arr.length) {
        if (arr[i] > arr[i-1]) {
           i++; 
           return false;
        }
        i++; 
     }
     return true;
        
       
    
      


       }

        public static boolean isin(int arr[]){
            int i=1; 
            while (i<arr.length) {
             if (arr[i] < arr[i-1]) {
                i++; 
                return false;
             }
             i++; 
          }
          return true;
       
    }
}
