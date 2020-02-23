public class RemoveSpecialCharacters2
{
	public static void main(String[] args) {
	
	String s1="dhsdshdg636fds53e5$@#%#%";
	String s2="";
	
	String s3="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	boolean z=false;
	for(int i=0;i<s1.length();i++){
	    z=false;
	    
	    for(int j=0;j<s3.length();j++){
	     
	       if(s1.charAt(i)==s3.charAt(j)){
	        z=true;
	        break;
	      }
	    }
	        if(z==true){
	            s2=s2+s1.charAt(i);
	
        
        	
	    }
	}
	

	    System.out.print(s2);

	
	    }
}
