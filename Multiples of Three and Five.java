public class Multiples of Three and Five
{
    public static void main(String[] args){
        
     int   n=100;
       
        
        for (int i = 1; i <= n; i++) {
            
           if (i % 3 == 0) {
                System.out.println( i+"   "+" multiples of 3 fizz");
                      }
        
            if (i % 5 == 0) {
                System.out.println(i+"   "+" multiples of  5 buzz");
                    }
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("  multiples of both 3 and 5 fizz buzz");
            } 
            
           
            }  
        
        
        
        
    }
}

