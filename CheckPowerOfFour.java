// Write a Java program to check whether an given integer is a power of 4 or not.
public class CheckPowerOfFour
{
	public static void main(String[] args) {
		
		int n=257;
		
	    boolean z = false;
	
	    while(n >= 4)
	    {
	        if(n%4!=0){
	            break;    
	        }
	        else{
	            n=n/4;
	            
	            if(n == 1){
	                z = true;
	            }
	            
	        }
	    }
	    
	    System.out.println(z);
	
	
	
	 
	}
}
