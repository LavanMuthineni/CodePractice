//97. Write a Java program to check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element.

public class AlternateOrSequentialOccuringNumber
{
	public static void main(String[] args) {
	
	
	int[] a = {10, 20, 50, 20, 13, 50};
	
	int x=10;
	int z=0;
	
	for(int i = 0; i <a.length - 1; i++) {
	    if(a[i] == x && a[i+1] == x){
	        System.out.println("true");
	        z=1;
	        break;
	    }
    
	    if(i <= a.length-1&&  a[i] == x && a[i+2] == x){
	        System.out.println("true");
	        z=1;
	        break;
	    }
	    
	
    }
    
    if(z==0){
	    System.out.println("false");
	}


}
}