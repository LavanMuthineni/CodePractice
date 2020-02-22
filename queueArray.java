

public class Main
{
    
    int[] a=new int[6];
    
      int top =0;
      int starting=0;
    public void push(int b){
          boolean r=isFull();
    if(!r)
    {
    a[top]=b;
    top=top+1;
    }
    else{
        System.out.println("stack is full");
    }
    
}

 public boolean isFull()
 {
     if(top>=a.length)
     {
         return true;
     }
     return false;
 } 
 
 

   public int pop()
   {
           boolean f = isEmpty();
     if(!f)
     {
 
       int z=a[starting];
      starting++;
      return z;
   }
      else {
         System.out.println("stack is empty");
         return 0;
     }
   }
       
  public boolean isEmpty(){
      if(top==0){
          return true;
          
      }
      else {
          
          return false;
          
          
      }
  }
     
     
     
     
     
     
     
     
     
     
     
     
     
     public void print(){
      for(int i=starting;i<top;i++){
      System.out.println(a[i]);
      }
      
  }
    
    
	public static void main(String[] args) {
	Main g=new Main();
	
	 g.push(3);
	  g.push(5);
	  g.push(10);
	  g.push(12);
	g.pop();
	g.pop();
	
	g.print();
	}
}
