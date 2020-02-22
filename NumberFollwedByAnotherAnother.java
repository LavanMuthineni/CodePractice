//96. Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.


public class NumberFollwedByAnotherAnother
{
	public static void main(String[] args) {
	
	    int[] a = {10, 70, 80, 50, 20, 13, 50};
	    int x=10;
	    boolean z= false;
	    boolean y = false;
	    for(int i=0;i<a.length;i++){
	        
	        if(a[i]==x){
	            z=true;
	      
	        }
	
	        for(int j=i+1;j<a.length;j++){
	            if(z && a[j]==20){
	                System.out.println("true");
	                y=true;
	                break;
	            }
	        }
	        
	        if(z==true){
	            break;
	        }
	    } 
	    
	    
	    if(y==false){
	        System.out.println("false");
	    }
	    
	}
	    
}
	    