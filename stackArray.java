
public class Main
{
    int[] x =new int[4] ;
    
  int top =0;
  
  

 
public void insert (int a){
    boolean r=isFull();
    if(!r){
    x[top]=a;
    top=top+1;
    }
    else{
        System.out.println("stack is full");
    }
    
}

 public boolean isFull(){
     if(top>=x.length){
         return true;
     }
     return false;
 } 
 
 
 
 
 
 
 public int pop (){
     boolean z = isEmpty();
     if(!z){
     top =top-1;
     return x[top];
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
      for(int i=0;i<top;i++){
      System.out.println(x[i]);
      }
      
  }
  
  public int length (){
      return top;
  }
  
  
 	public static void main(String[] args) {
   
   Main stack=new Main();
   
   stack.pop();
   stack.insert(10);
  // stack.print();
	    
	    stack.insert(56);
	    
	    stack.insert(89);
	    stack.pop();
	    stack.insert(78);
	   stack.insert(45);
	stack.print();
	
	}
}
