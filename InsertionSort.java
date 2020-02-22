public class InsertionSort
{
	public static void main(String[] args) {
	
	
	  int[] a ={5,8,4,6,7,2,1,9};
	  
	  
	  for(int i=0;i<a.length;i++){
	      
	      
	     for(int j=i-1;j>=0;j--){
	         if(a[j+1]<a[j]){
	             
	             int swap=a[j+1];
	              a[j+1]=a[j];
	              a[j]=swap;
	             
	             
	         }
	         else{
	             break;
	         }
	     }
	      
	      
	      
	      
	  }
	  for(int b=0;b<a.length;b++){
	      System.out.println(a[b]);
	  }
	
	
	
	}
}
