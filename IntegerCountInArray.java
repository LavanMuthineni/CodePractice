    import java.util.HashMap;
    public class IntegerCountInArray{
    public static void main(String args[]){
    
    
        int[] a = {5,6,4,7,8,9,8,7,4,1,2};
    
        HashMap<Integer ,Integer > counts=new HashMap<Integer, Integer>();
        
        
        for(int i=0;i<a.length;i++){
          
          if(counts.containsKey(a[i]))
         
         {
             counts.put(a[i], counts.get(a[i])+1);
         }
         else {
             counts.put(a[i],1);
         }
            
        }
        
        for(int j : counts.keySet()){
            System.out.println(j + "  "+ counts.get(j));
        }
        
        
        
        
        
    }
}