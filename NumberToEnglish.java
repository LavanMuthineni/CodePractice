
//87. Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English.



public class NumberToEnglish
{
	public static void main(String[] args) {
		int num=3098899;
		String[] s1 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		int sum=0;
		while(num!=0){
		  int   c=num%10;
		    sum=sum+c;
		    num=num/10;
		    
		}
		//System.out.println(sum);
		
	 String s = "";
	    int   x = sum;
	    while(x != 0) {
	        int   y = x % 10;
	        s = s1[y]+" " + s;
	        x=x/10;
	    }	  
	
		System.out.println(s);
		
	}
}
