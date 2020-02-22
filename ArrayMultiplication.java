

//83. Write a Java program to multiply corresponding elements of two arrays of integers. 

public class ArrayMultiplication
{
	public static void main(String[] args) {
		
		int[] a= {5,96,12,45,24};
		int[] b={6,54,23,45,54};
		int[] c=new int[a.length];
		
	
		
		for(int i=0;i<c.length;i++){
		    c[i]=a[i]*b[i];
	
		   
		}
		for(int i=0;i<c.length;i++){
		    System.out.println(c[i]);
		}
		
		
	
		
		
		
	}
}
