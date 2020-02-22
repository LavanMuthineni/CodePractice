public class SkipFirstChar
{
	public static void main(String[] args) {
	
	String s1="microsoft";
	String s2="tcs";
	
	String s3="";
	for(int i=1;i<s1.length();i++){
	s3=s3+s1.charAt(i);
	    
	}
	for(int j=1;j<s2.length();j++){
	    s3=s3+s2.charAt(j);
	}
	System.out.println(s3);
	}
}
