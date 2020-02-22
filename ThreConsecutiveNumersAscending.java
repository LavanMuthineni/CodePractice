// Write a Java program to check if an array of integers contains three increasing adjacent numbers


public class ThreConsecutiveNumersAscending
{
	public static void main(String[] args) {
		
		int[] a={11, 15, 13, 10, 45,46,47,50, 49,20};
		boolean z=false;
		for(int i=0;i<a.length-2;i++){
		       if(a[i]<a[i+1]&&a[i+1]<a[i+2]){
		          z=true;
		              }
		}
		
		System.out.println(z);

		
	}
}
