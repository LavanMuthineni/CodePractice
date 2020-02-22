public class BubbleSort
{
	public static void main(String[] args) {
		
		
		int[] a={5,8,9,4,6,1,9,23};
		
		for(int i=0;i<a.length;i++){
		    
		    for(int j=0;j<a.length-1;j++){
		        
		        if(a[j+1]<a[j]){
		            
		            int swap =a[j+1];
		            
		            a[j+1]=a[j];
		            a[j]=swap;
		            
		        }
		       
		        
		        
		        
		        
		    }
		    
		    
		    
		    
		}
		for(int k=0;k<a.length;k++){
		    System.out.println(a[k]);
		}
		
		
		
		
		
	}
}
