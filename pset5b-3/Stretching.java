import java.util.Arrays;

public class Stretching  {
    
   public static void main(String[] args)
   {
        int[] list = {18, 7, 4, 14, 11};
        int[] list2 = stretch(list);
                 
        System.out.println(Arrays.toString(list));  // the above prints [18, 7, 4, 14, 11]
        System.out.println(Arrays.toString(list2)); // the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]
}

    public static int[] stretch(int[] arr){
        
        int[] list = new int [10];
        int j = 0;
        
        for(int i = 0; i < arr.length; i++){
           
            if (arr[i]%2 == 0) {      // if number is even implies it saves half of the number to two consecutive slots
             list[i+j] = arr[i]/2;
             j++;
             list[i+j] = arr[i]/2;

            } else {
             list[i+j] = arr[i]/2 +1 ; // if it is odd implies it saves the half + 1  in the first 
             j++;
             list[i+j] = arr [i]/2;  // saves the half to the second ( here the decimal drops since it's an int)
                
            }
          
        }
         return list; 
    }
}