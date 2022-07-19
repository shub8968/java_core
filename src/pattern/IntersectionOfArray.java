package pattern;

import java.util.Arrays;

public class IntersectionOfArray {
    
    public static void main(String[] args) {
    
        int result [] = intersect(new int []{1,2,2,7,0}, new int[] {2,2,0,3,1,1});
    
        Arrays.toString(result);
        System.out.println(Arrays.toString(result));
    }
    
    private static int [] intersect(int arr_a [], int arr_b []){
        
        int length = arr_a.length;
        int count = 0;
        if(arr_b.length > length){
            length = arr_b.length;
        }
        
        int arr_i [] = new int[length];
       
        for(int i = 0; i < arr_a.length; i++){
        
            for(int j = i; j < arr_b.length; j++){
                
                if(arr_a[i] == arr_b[j]){
                    arr_i[count++] = arr_a[i];
                    break;
                }
            }
        }
       
        return Arrays.copyOfRange(arr_i, 0, count );
    }
}
