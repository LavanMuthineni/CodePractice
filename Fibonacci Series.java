public class Main{
    public static void main(String [] args){
        int n=100;
        int a=0;
        int b=1;
        int sum =0;
       System.out.println(a);
        for(int i=0;i<n;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}