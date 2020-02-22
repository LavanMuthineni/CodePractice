
//95. Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.


public class ArrayWithStringNumbers
{
	public static void main(String[] args) {
		int n=10;
		String s1="";
		String[] a=new String[n];
		for(int i=0;i<n;i++){
		    a[i]=""+ i;
		    System.out.println(a[i]);
		}
		
		
		
	}
}
