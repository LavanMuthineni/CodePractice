// Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers. 

public class CountTensAndTwentys
{
	public static void main(String[] args) {
		
		int[] a={10,56,24,20,10,61,60,20,10,10,10,20,20,20};
		int x=10;
		int y=20;
		int count=0;
		int count1=0;
		
		for(int i=0;i<a.length;i++){
		    
		       if(a[i]==x){
		           count=count+1;
		              }
		              
		       if(a[i]==y) {
		           count1=count1+1;
		            }
		    }
		    
		    System.out.println(count>count1);
		
	/* if(count>count1){
		   System.out.println("true");
	        	}
        else{
	        System.out.println("false");
	            }	*/
	
	}
}
