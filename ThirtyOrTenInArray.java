//Write a Java program to check if a specified array of integers contains 10's or 30's
public class ThirtyOrTenInArray
{
	public static void main(String[] args) {
		
		int[] a={105,56,24,20,103,61,10};
		
		int x=10;
		int y=30;
		boolean z=false;
		for(int i=0;i<a.length;i++){
		    if(a[i]==x || a[i]==y){
		        z=true;
		        break;
		    }
		}
		
		System.out.println(z);
		
	}
}
