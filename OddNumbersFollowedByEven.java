//94. Write a Java program to rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers


public class OddNumbersFollowedByEven
{
	public static void main(String[] args) {
	 
	 int[] a={3,8,9,7,6,5,4};
	 int[] b=new int[a.length];
	 int[] c=new int[a.length];
	 
	 int j=0,k=0;
	 for(int i=0;i<a.length;i++){
	     if(a[i]%2==0){
	         b[j]=a[i];
	         //System.out.println(b[j]);
	         j=j+1;
	          
	     }
	     else {
	         c[k]=a[i];
	          //System.out.println(c[k]);
	         k=k+1;
	        
	     }
	 }
	 
	 for(int i=k;i<c.length;i++){
	     c[i]=b[i-k];
	 }
	 
	 for(int i=0;i<c.length;i++){
	     System.out.println(c[i]);
	 }
	
	
	
	}
}
