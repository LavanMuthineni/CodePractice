


class Node {
    int data;
    Node next;
}

class Linkedlist{
    Node startingNode=null;
}


public class Main
{
	public static void main(String[] args) {
	
	Linkedlist l= new Linkedlist();
	
	Node a =new Node();
	
	a.data =10;
	
	l.startingNode=a;
	
	
	Node x=new Node();
	x.data =20;
	
	l.startingNode.next=x;
	
	
	
	
	
	
	System.out.println(l.startingNode.data);
	
	
	
	
	
	
	}
}
