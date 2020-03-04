import java.io.*;
import java.util.HashMap;


public class CommanCharacterInString

{

public static void main(String args[]){

HashMap<Character , Integer> count = new HashMap<Character, Integer>();

String s1="lavanap";
String s2="laxmanoaa";
int[] a=new int[256];

for(int i=0;i<s1.length();i++){
    
    if(count.containsKey(s1.charAt(i))){
        count.put(s1.charAt(i) , count.get(s1.charAt(i))+1);
    }
    else{
        count.put(s1.charAt(i),1);
    }
    
}
    
   for(int j=0;j<s2.length();j++){
       if(count.containsKey(s2.charAt(j)) && count.get(s2.charAt(j))>0){
           count.put(s2.charAt(j) , count.get(s2.charAt(j))-1);
           a[s2.charAt(j)]=a[s2.charAt(j)]+1;
            //System.out.println(s2.charAt(j));
       }
    
   } 
   
   for(int j =0; j< a.length;j++)
   {
       for(int k =0; k< a[j];k++)
       {
           System.out.println((char)j);
       }
       
   }
   
   

}
}
