package concepts.patterns;

public class Pattern2 {
    
    public static void main(String[] args) {
        
        pattern2(5);
    }
    
    static void pattern2(int n){
        
        for(int i = 1; i <=5; i++){
            
            for(int j = 0; j < n + 1 - i; j++){
    
                System.out.print("* ");
            }
    
            System.out.println();
    
        }
    
    }
}
