class Node {
    int data;
    Node next;
}

class Linkedlist {
    Node startingnode =null;
    
    
    public void print()
	{
	    Node currentNode=startingnode;
	while(currentNode!=null){
	    System.out.println(currentNode.data);
	    currentNode=currentNode.next;
	}
	}
	
	
	public void insert(int newData)
	{
	    if(startingnode == null)
	    {
	        startingnode = newData;
	        return;
	    }
	    
	    Node curentNode=startingnode;
	    
	while(curentNode.next!=null)
	{
     curentNode=curentNode.next;
	    
	}
	Node y=new Node();
	y.data = newData;
	
	curentNode.next=y;
	    
	    
	}
    
    
} 
    




public class Main
{
	public static void main(String[] args) {
	
   Linkedlist l=new Linkedlist();	
	

	
	
	
	Node abc = new Node();
	
	abc.data=10;
	
	l.startingnode=abc;
	
	
	Node x=new Node();
	x.data=12;
	
	l.startingnode.next=x;
	
	
	Node n =new Node();
	n.data=16;
	l.startingnode.next.next=n;
	
	Node z= new Node();
	z.data=45;
	l.startingnode.next.next.next=z;
	
	System.out.println(l.startingnode.data);
	System.out.println(l.startingnode.next.data);
	System.out.println(l.startingnode.next.next.data);
	System.out.println(l.startingnode.next.next.next.data);
	
	l.insert(30);
	
	System.out.println(l.startingnode.next.next.next.next.data);

    
	l.print();

    l.insert(3430);
    
    l.print();

	
	}
	
	
	
	
}