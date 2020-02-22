// Write a Java program to count the two elements differ by 1 or less of two given arrays of integers with same length
public class TwoArrayDifference
{
	public static void main(String[] args) {
		
		int[] a={5,8,1,2,3,4,5};
		int[] b={6,4,8,9,2,1,6};
		
		int diff=0;
		int count=0;
		for(int i=0;i<a.length;i++){
		       diff=a[i]-b[i];
      
                 if(diff==1|| diff==-1){
                    count=count+1;
                        } 
      
      		       }
		
		System.out.println(count);
		
	}
}
