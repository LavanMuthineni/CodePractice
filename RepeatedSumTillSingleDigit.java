//  Write a Java program to add all the digits of a given positive integer until the result has a single digit

public class RepeatedSumTillSingleDigit
{
	public static void main(String[] args) {
	
	int n=7777756;
	
    while(n>9){
        
        int z=0;
        while(n>0){
	        int a=n%10;
	        z =z+a;
	        n=n/10;
	    }
	    
	    n=z;
	    System.out.println(n);
	}
    
    

//System.out.println(z);



	}
}
