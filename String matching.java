public class String matching 
{
	public static void main(String[] args) {
	
	String s1="microsoft";
	
	String s2="so";

	int j=0;
    int i=0;
    int k=0;
while(j!=s2.length() && i !=s1.length()){
if(s1.charAt(i)==s2.charAt(j))
{
i++;
j++;
	}
	    
else{
    k++;
    i= k ;
    j=0;
}	    
}


if(j==s2.length()){
    System.out.println(k);
}

}
}

