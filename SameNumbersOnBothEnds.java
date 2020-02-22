// Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.

public class SameNumbersOnBothEnds
{
	public static void main(String[] args) {
		
		int[] a={5,2,6,1,1,3,2,5};
		boolean z=false;
		int count=0;
		int n=3;
	
		for(int i=0;i<a.length/2;i++){
		    if(a[i]==a[a.length-i-1]){
		        z=true;
		        count=count+1;
		    }
		    else{
		        break;
		    }
		 
		    
		}	

	    System.out.println(count==n);

	
	
	}
}
