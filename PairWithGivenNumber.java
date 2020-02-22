public class PairWithGivenNumber
{
	public static void main(String[] args) {
	
		
		
	int[] a = {10, 20, 10, 20, 40,20, 50,20,50,60};
	boolean z=false;
	int x = 20;
	for(int i = 0; i < a.length - 1; i++) {
        if(a[i] == x || a[i + 1] == x)
		{
               z=true;	
		}   
		else {
		    z=false;
		    break;
		}
    }                                   
    if (z==true)
 	  {
     	 System.out.println("true");	         
	  }
 else
	   	  {
     	 System.out.println("false");	         
	  }		
    }
}
