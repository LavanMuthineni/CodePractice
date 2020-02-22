//98. Write a Java program to check if the value 20 appears three times and no 20's are next to each other in an given array of integers.

public class NumberCountWithNoSequence
{
	public static void main(String[] args) {
	
	int[] a = {10, 20,20, 10, 20, 40, 13,10,20};
	 boolean b=true;
	 int count=0;
	 for(int i=0;i<a.length-1;i++){
	     if(a[i]==20 && a[i+1]==20){
	        
	         b=false;
	         
	     }
	    
	     if(a[i]==20){
	         count=count+1;
	     }
	     
	 }
	 if(count<3){
	         System.out.println("true");
	     }
	     else {
	         System.out.println("false");
	     }
	
	
	}
}
