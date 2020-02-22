//  Write a Java program to create a new array that is left shifted from a given array of integers

public class LeftShiftByOne
{
	public static void main(String[] args) 
	
	  {
	
	      int[]a = {11, 15, 13, 10, 45, 20};
          
          int[] b=new int[a.length];
 
          int x=a[0];
            
            int j=0;
            for(int i=1;i<a.length;i++){
                  b[j]=a[i];
                    j=j+1;
                        }
        b[b.length-1]=x;
      
      
      for(int i=0;i<b.length;i++){
      
         System.out.println(b[i]);
	
                     }

	}
}
