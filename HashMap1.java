import java.util.HashMap;
public class HashMap
{
   
    public static void main(String[] args) {
	     HashMap <Character, Integer> lavan=new HashMap<Character , Integer>();
	 
	 lavan.put('a',2);
	 lavan.put('b',1);
	 lavan.put('a',4);
	 
	  System.out.println(lavan);
	  
	 int a = lavan.get('a');
	  System.out.println(a);
	  System.out.println(lavan.get('c'));
	   System.out.println(lavan.size());
	
	
	for(Character i : lavan.keySet()){
	    System.out.println(i);
	}
	
	for(Integer i : lavan.values())
{
    System.out.println(i);
}	
	
	
	
	
	}
}
