package concepts.patterns;

public class pattern3 {
    
    public static void main(String[] args) {
    pattern(5);
    }
    
    static void pattern(int n){
        
        for(int i = 1 ; i <= 5; i++){
            
            for(int j =1 ; j <=i; j++){
    
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
