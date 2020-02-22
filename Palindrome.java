public class Palindrome
{
	public static void main(String[] args) {
		
		int[] a={5,2,1,0,1,2,5};
		boolean z=false;
	
	    for(int i=0;i<a.length/2;i++){
		    if(a[i]==a[a.length-i-1]){
		        z=true;
		        
		    }
		    else {
		        z=false;
		        break;
		    }
		
		}	

	    System.out.println(z);
	
	}
}