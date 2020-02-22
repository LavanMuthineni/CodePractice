// Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array before the last element value 10

public class SubArrayBeforeTen
{
  public static void main(String[] args) {
	
	 int[] a={20,56,12,10,14,10,54,10,69,56,10,56,23,56};
	
	  int count=0;
	
	       for(int i=a.length-1;i>0;i--)
		      {
		         if(a[i]==10){
		            count=count+1;
		              break;
		                }
		             
		             else {
		                count=count+1;
		                   }
		             
		      }    
		      


    int[] b=new int[a.length-count];
		 
    int k=0;
		
		for(int j=0;j<b.length;j++){
		  
		      b[k]=a[j];
		        k=k+1;
		          
		    
		}
		                     
		                   
		                   
	 for(int z=0;z<b.length;z++){
		  System.out.println(b[z]);
		    
		                    }
	
	}
}
