// Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.
public class AdjacentPairNumber
{
	public static void main(String[] args) {
	    
	    int[] a={10,20,56,20,15,20,56,20,45};
	    
	    int z=20;
	    boolean x=true;
	    for(int i=0;i<a.length-1;i++){
	           if(a[i]==z|| a[i+1]==z){
	              x=true;
	           }
	           else{
	                x=false;
	                    break;
	                             }
	    }
	   
	    System.out.println(x);
	    
	    	}
                 }
