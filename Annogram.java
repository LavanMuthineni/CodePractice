import java.util.HashMap;

public class Annogram{
    public static void main(String args[]){
        
        String s1="sabcaccd";
        String s2="dacccbas";
        
        HashMap<Character , Integer > count = new HashMap<Character , Integer >();
        
        for(int i=0;i<s1.length();i++){
            if(count.containsKey(s1.charAt(i))){
                count.put(s1.charAt(i) , count.get(s1.charAt(i))+1);
            }
            else {
                count.put(s1.charAt(i), 1);
            }
        }
        boolean z=true;
        for(int i =0;i<s2.length();i++){
            if(count.containsKey(s2.charAt(i))){
              count.put(s2.charAt(i), count.get(s2.charAt(i))-1);       
        }
        else{ 
            z=false;
            break;
        }
        
        }
        
        for(int j : count.values()){
            if(j!=0){
           z=false;
           break;
            }
        }
       if(z){
           System.out.println("annogram");
       } 
       else {
           System.out.println("not annogram");
       }
    }
}