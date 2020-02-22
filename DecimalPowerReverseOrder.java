public class Main{

     public static void main(String []args){
       
       int number=758; 
     
     int[] x=new int[10];
     int top =0;
     
       int fact=1;
       
       
       while(number!=0){
           int sum=number%10;
           int mul=sum*fact;
          x[top]=mul;
          top=top+1;
           fact=fact*10;
           number=number/10;
       }
       for(int i=top-1;i>=0;i--){
           System.out.println(x[i]);
       }
       