package concepts.patterns;

public class Pattern1 {
    
    public static void main(String[] args) {
        pattern1(5);
        
    }
    
    static void pattern1(int n){
        
        
        for(int i = 1; i <= 5; i ++){
            
            
            for(int j =0 ; j < i; j++ ){
    
                System.out.print("* ");
            }
    
            System.out.println();
        }
        
        
        
    }
}
