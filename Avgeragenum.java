import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner  i =new Scanner(System.in);
		int a=i.nextInt();
		 double sum=0,count=0;
		while(a!=0){
		    
		    sum=sum+a;
		    count++;
		    a=i.nextInt();
		}
		double avg =sum/count;
		System.out.println(avg);
		
	}
}
