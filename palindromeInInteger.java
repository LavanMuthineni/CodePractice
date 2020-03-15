    public class palindromeInInteger
    {
    public static void main(String[] args){
 
    int  a=1238118321;
    
    int count=0;
    int b=a;
    while(b>0){
      
       count=count+1;
      b=b/10;
    }
    System.out.println(count);
    int c=1;
 for(int i=0;i<count-1;i++){
      c=c*10;
 }    
 System.out.println(c);
boolean d=true;
     while(a>=10)
     {
      int   z=a%10;
         
         int x=a/c;
       System.out.println(z + "  " + x);
        if(z!=x){
            d=false;
            break;
        }
        
      a=a%c;
      a=a/10;
      c=c/100;
    }
 
   if(d){
       System.out.println("palindrome");
   }
   else{
       System.out.println(" no  palindrome");
   }
    
        }

    }   