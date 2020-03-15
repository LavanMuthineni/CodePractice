public class Minimum Rooms Required Problem
{
	public static void main(String[] args) {
	
	  int[] starting ={8,9,10,11,12};
	  
	  int[] ending ={10,9,12,13,14};
	  int room=0;
	  int max=0;
	  for(int i=0;i<ending.length;i++)
	  {
	      int index=i;
	      
	  for(int j=i+1;j<ending.length;j++){
	  if(ending[index]>ending[j]){
	      int temp=ending[index];
	      ending[index]=ending[j];
	      ending[j]=temp;
	  }
	  }
	 
	   }
	   int j=0;
	   int i=0;
	     int maxroom=0;   
	  while(i<starting.length&&j<ending.length){
	      
	       
	       if(starting[i]<ending[j]){
	       
	       room= room+1;
	       i++;
	      
	     if(maxroom<room){
	         maxroom=room;
	     }
	       
	       }
	       
	   
	       else{
	           
	       j=j+1;
	   room =room-1;
	       }
	       
	   }
	   
	  
System.out.println(maxroom);
	
	}
}
