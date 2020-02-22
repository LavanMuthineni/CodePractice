
//82. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).

public class MaxAmongThreeInArray
{
	public static void main(String[] args) {
	
	  int[] a={100, 30, 40, 50, 67,96};
	  
	  int max=a[0];
	  
	String s="first";
	  if(max<a.length/2){
	      max=a.length/2;
	      s="secoond";
	  }
	if(max<a[a.length-1]){
	    max=a[a.length-1];
	    s="third";
	}
	
	System.out.println(max +"  "+ s);
	}
}
