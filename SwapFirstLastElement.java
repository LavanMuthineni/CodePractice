//81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. 


public class SwapFirstLastElement
{
	public static void main(String[] args) {
		int[] abc={25,45,64,98};
		
		int a=abc[0];
		
		abc[0]=abc[abc.length-1];
		
		abc[abc.length-1]=a;
		
		for(int i=0;i<abc.length;i++){
		    System.out.println(abc[i]);
		}
		
	}
}
