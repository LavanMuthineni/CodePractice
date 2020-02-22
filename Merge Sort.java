public class Merge Sort
{
	
   public static int[] sort(int[] a){
       
       if(a.length==1){
           return a;
       }
	    
	 int[] b=new int[a.length/2];
	 int[] c=new int[(a.length+1)/2];
	 int k=0;
	 for(int i=0;i<a.length/2;i++){
	     b[i]=a[i];
	    
	 }
	       
	 for(int j=a.length/2;j<a.length;j++){
	     c[k]=a[j];
	     k++;
	 }

	//print(c);
	//print(b);
	
	  c=sort(c);
	  b=sort(b);
	  
	  return merge(c, b);
	    
	}
	
	
	public static int[] merge(int[] c,int[] b){
	    int [] d= new int[c.length+b.length];
	    int i=0;
	    int j=0;
	    int z=0;
	    
	    //print(c);
	    //print(b);
	    while(c.length!=i && b.length!=j){
	        
	    //    System.out.println(i+" "+j);
	    if(c[i]<b[j]){
	    //    System.out.println("in 1");
	        d[z]=c[i];
	        z++;
	        i++;
	        
	    }
	    else{
	        d[z]=b[j];
	        z++;
	        j++;
	        
	    }
	    }
	    
	    //print(d);
	    
	    if(c.length==i){
	        while(j<b.length)
	        {
	           d[z]=b[j];
	           z++;
	           j++;
	           
	        }
	    }
	        else {
	         while(i<c.length){
	             d[z]=c[i];
	             z++;
	             i++;
	         }   
	        }
	    
	    // print(d);
	     
	    return d;
	
	}
	
	
	public static void print(int[] b){
	    for(int k=0;k<b.length;k++){
	        System.out.print(b[k]+"   ");
	    }
	    
	    System.out.println();
	}
	
	
public static void main(String[] args) {
	
	 int[] a={5,2,11,4,8,6,3,5,8,78,45};
	 
	 
	 
	 
	 
	 print(sort(a));
	
}
	
	
		
	
	
}	
	

