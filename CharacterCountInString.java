    import java.util.HashMap;
    public class CharacterCountInString  {
    public static void main(String args[]){
     
     String s1 ="computersystem";
     
     HashMap<Character, Integer> count = new HashMap <Character, Integer>();
     
     for(int i=0;i<s1.length();i++){
         
        if(count.containsKey(s1.charAt(i))){
            
            count.put(s1.charAt(i) , count.get(s1.charAt(i))+1);
            
        }
        
        else {
            
            count.put(s1.charAt(i),1);
        }
        
         }
       
       for(Character j : count.keySet()){
           System.out.println(j +"  "+ count.get(j));
       }
    
        
    }
}