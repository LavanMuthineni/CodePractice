public class RemovingCharaterMatching
{
	public static void main(String[] args) {
		
		String s1="greekforgreeklalala";
		String s2="geerka";
		String s3="";
		for(int i=0;i<s1.length();i++){
		    
		    
		    boolean z=true;
		    for(int j=0;j<s2.length();j++){
		        
		        
		        if(s1.charAt(i)==s2.charAt(j)){
		             z=false;
		            break;
		            
		        }
		        
		        
		    }
		    
		    
		    
		    if(z){
		        System.out.println(s1.charAt(i));
		    }
		    
		}
		
		
		
		
		
		
		
		
		
	}
}
