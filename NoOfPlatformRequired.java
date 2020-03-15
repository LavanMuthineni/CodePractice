import java.util.*;
import java.util.HashMap;
public class NoOfPlatformRequired
{
    
    public int[] sort(int[] dep){
    
    for(int i=0;i<dep.length;i++){
        for(int j=i+1;j<dep.length;j++){
            
            if(dep[j]<dep[i]){
                
                int temp=dep[j];
                dep[j]=dep[i];
                dep[i]=temp;
                
                
            }
            
            
            
        }
    }
    
    return dep;
    }
    
    
  /*  public void  print(int[] dep){
    for(int i=0;i<dep.length;i++){
         
         System.out.println(dep[i]);
             
         }
    
    }*/
    

public static void main(String args[]){
    
int[] arr ={7 ,2,3,4,5,6,1};

int[] dep= {2,5,6,8,9,10,11};

Main b =new Main();
    b.sort(arr);
  // b.print(dep);
    b.sort(dep);
  //  b.print(arr);
  
  int platform=0;
  int noOfPlatform=0;
  int j=0;
  int i=0;
  while(i<arr.length&&j<dep.length){
      
      if(arr[i]<dep[j]){
           platform= platform+1;
         i++;
         
         if(noOfPlatform<platform){
             noOfPlatform=platform;
         }
         
         
         
      }
      
       else {
           platform=platform-1;
           j=j+1;
       }
  
  }
  
  
  
        
     System.out.println(noOfPlatform);
    
    
}
    
}
