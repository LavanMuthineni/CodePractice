import java.util.HashMap;

public class ArrayMissingNumaber
    {
	public static void main(String[] args) 
	    {
		int[] a={1,2,3,4,5,7,8,9,9};
		HashMap<Integer, Integer> count=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++){
		    
		    if(count.containsKey(a[i])){
		        
		        count.put(a[i], count.get(a[i])+1);
		        
		    }
		    else {
		        count.put(a[i],1);
		    }
		    
		  }
		
		
		
		for(int i=1;i<=10;i++){
		    
		    if(count.containsKey(i))
		    {
		      if(count.get(i)>1){
		          System.out.println(i + "duplicate");
		      }
		       
		       
		       
		        
		    }
		    else {
		        System.out.println(i+  " is missing");
		    }
		    
		}
		
		
		
		
		
	    }
    }