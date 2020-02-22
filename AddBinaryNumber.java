
public class Main
{
	public static void main(String[] args) {
		int binary1=1010;
		int binary2=11011;
		int carry=0;
		int sum=0;
		
		String a="";
		
		while(binary1!=0||binary2!=0){
		System.out.println(binary1  +"  "+ binary2+"    "+ carry);
	int	 b=(binary1%10+binary2%10+carry);
		System.out.println(b);
		if(b==1||b==3){
		    sum=1;
		}
		else{
		   sum=0; 
		   
		}
		System.out.println("jjj "+sum);
		if(b==2||b==3){
		    carry=1;
		}
		else{
		    carry=0;
		}
		System.out.println("carry "+ carry);
		
		a=sum+a;
		
	binary1=binary1/10;
	binary2=binary2/10;
		
		
		
		}
		if(carry==1){
		    a=carry+a;
		}
		
		System.out.println(a);
	}
}