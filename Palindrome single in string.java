public class Palindrome single in string
{
	public static void main(String[] args) {
		
		String  s1="jlaxbobxalj";
		boolean z=false;
	
	    for(int i=0;i<s1.length()/2;i++){
		    if(s1.charAt(i)==s1.charAt(s1.length()-i-1)){
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

