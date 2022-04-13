package concepts.java;

import java.util.Arrays;

public class PassByRefDemo {
    
    public static void main(String[] args) {
        Integer array [] = {1,2,3};
        passByRef(array);
        System.out.println(Arrays.toString(array));
        
    }
    
    public static void passByRef(Integer array []){
        array[2] = -1;
    }
}
