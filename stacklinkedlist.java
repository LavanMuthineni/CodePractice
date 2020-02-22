
class Node
{
int data;
Node next;
}


class linkedList
{
    Node startingNode=null;
    
    
    	public void insert(int b){
	    Node a=new Node();
	    a.data=b;
	    a.next=startingNode;
	    
	    startingNode=a;
	    
	}
	
	
	public int pop(){
	     if(isEmpty()){
	         System.out.println("pop is isEmpty");
	       return 0; 
	    }
	    int a=startingNode.data;
	    startingNode=startingNode.next;
	   return a;
	}
	
    public boolean isEmpty(){
       if(startingNode==null){
           return true;
           
       } 
       return false;
    }
   
    public int length(){
    Node i=startingNode;
    int count=0;
    while(i!=null){
        count++;
        i=i.next;
    }
    
    return count;
    }
    
    
    public void print(){
        Node s = startingNode;
        while(s!=null){
            System.out.println(s.data);
            s=s.next;
        }
    }
    
    
    
    
}




















public class Main{





	public static void main(String[] args) {
		linkedList l = new linkedList();
 System.out.println(l.length());
	l.pop();
	  l.insert(10);
	  l.insert(45);
	  l.insert(890);
	  l.insert(789);
	  l.pop();
	 System.out.println(l.length());
	  l.print();
	   
	    
	
	}	

	
	

}
