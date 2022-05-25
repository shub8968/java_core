package concepts.patterns;

public class pattern4 {
    
    public static void main(String[] args) {
    pattern1(11);
    }
    
    static void pattern(int n){
        int i = 1;
        for(; i <=n/2; i++){
            
            for(int j = 1; j<=i; j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
        for(; i <=n; i++){
            
            for(int j = 1 ;  j <=  n - i  + 1 ; j++ ){
    
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern1(int n){
        
        for(int i = 1 ; i < 2 * n; i=i*2){
            
            if(i < n){
                
                for(int j = 1; j < i/2 + 1; j++){
                    System.out.print("*");
                    
                }
                System.out.println();
            }
            else{
    
                for(int j = i; j <= n + 1 - i/2; j++){
    
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
