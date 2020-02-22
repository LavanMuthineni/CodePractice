// Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 10.

public class SubArrayAfterTen
{
	public static void main(String[] args) {
		
		int[] a={20,56,12,10,14,10,54,10,69,10,23,56};
		int count=0;
		
		for(int i=a.length-1;i>0;i--)
		   {
		      if(a[i]==10){
		          break;
		             }
		             
		         else {
		            count=count+1;
		           
		             }
		          
		      }
		
		//System.out.println(count);
	
		int[] b=new int[count];
		 int k=0;
		
		for(int j=a.length-1;j>0;j--){
		      if(a[j]==10){
		          break;
		             }
		          else {
		              b[k]=a[j];
		              //  System.out.println(b[k]);
		                  k=k+1;
		                     }
		                     
		                    }
		    
		        for(int z=0;z<b.length;z++){
		           System.out.println(b[z]);
		    
		                    }
		
      
	}
}
