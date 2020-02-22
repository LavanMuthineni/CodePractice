//92. Write a Java program to count the number of even and odd elements in a given array of integers.


public class OddCountAndEvenCount
{
	public static void main(String[] args) {
 
     int[] a={2,6,89,45,5,6,7,55};
     int evencount=0;
     int oddcount=0;
     for(int i=0;i<a.length;i++){
     
     if(a[i]%2==0){
         evencount=evencount+1;
     }
     else{
        oddcount =oddcount+1;
     }



}
System.out.println(oddcount);
System.out.println(evencount);
	}
    
}
