//86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1. 




public class EvenOddCondition
{
	public static void main(String[] args) {
		
		int n=65;
		
		int count=0;
		while(n!=1){
		    
		    if(n%2==0){
		      n=n/2;  
		    }
		    else {
		        n=n*3+1;
		    }
		    
		    
		}
		System.out.println(n);
		
		
		
		
	}
}
