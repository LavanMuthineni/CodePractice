public class Factorial
{
	public static void main(String[] args) {
	int	count=0;
	int n=10;
	int sum=1;
	for(int i=n;i>1;i--){
	    sum=sum*i;
	}
	while(sum!=0){	
	int a=sum%10;
	if(a==0){
	    count=count+1;
	}
	else{
	    break;
	}
	
	sum=sum/10;
	}	
		
System.out.println(count);		
	}
}