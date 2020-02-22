public class Arithmetic operators{
    public static void main(String [] args){
        int x=1980;
        int y=1100;
        int carry=0;
       int  sum=0;
       int i=1;
        while(x!=0 || y!=0){
        int a=(x%10+y%10+carry);
        
        if(a>9){
            carry=1;
            a=a%10;
        }
        else {
            carry=0;
        }
        
      
       
        sum=sum+i*a;
        i=i*10;
     
        x=x/10;
      	y=y/10;
		
        }
      System.out.println(sum);  
    }
}