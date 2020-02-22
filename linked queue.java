class Node{
    int data;
    Node next;
}


class LinkedList{
    Node  head = null;
    Node   tail=null;  
    
    public void insert(int b){
        Node a=new Node();
        a.data=b;
        
        if(head==null|| tail==null){
        head=a;
        tail=a;
        }
        else {
            tail.next=a;
            tail=a;
        }

    }
    
    public int delete(){
 
    if(head==null){
        return -1;
    }
    
    
    int z=head.data;
    
    head=head.next;
    
    return z;
    
    
        
    }
    
    public int count(){
        int count=0;
         Node i=head;
        while(i!=null){
            count++;
            i=i.next;
        }
        return count;
    }
    
    
  public void print(){
     Node x=head;
     while(x!=null){
         System.out.print(x.data+    " ");
         x=x.next;
     }
     System.out.println();
  }
    
    
    
    
    
}


public class Main
{
    

	public static void main(String[] args) {
	
	 LinkedList y= new LinkedList();
	
	y.insert(20);
y.insert(56);
y.insert(45);
y.print();
y.delete();
	y.print();
y.delete();
y.print();
y.delete();
y.print();
y.delete();
y.print();
y.insert(3);
y.print();
	
	
	System.out.println(y.count());
	
	
	
	}
}
