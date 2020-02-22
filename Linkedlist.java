
 class Linkedlist
 {
     Node startingNode =null;
     
     public void update(int index, int newId){
         
         if(index >= getLength())
         {
             return;
         }
         
           int count =0;
           
           Node current=startingNode;
           while(count<index){
               count++;
               current=current.next;
               
           }
        
           
           current.id =newId;
           
     }
     
     public int getLength()
     {
         int count=0;
        Node currentNode=startingNode;
        while(currentNode!=null){
            currentNode=currentNode.next;
            count++;
            
        }
        System.out.println(count);
        return count;
     }
     
     
     
     
     public void print()
	
	{
	    Node cNode =startingNode;
	    while(cNode!=null){
	        System.out.println(cNode.id+""+cNode.name);
	        
	        cNode=cNode.next;
	        
	    }
	    
	    
	    
	}
	
	
	
	public void insert(Node a)
	{
	    if(startingNode==null)
	    {
	        startingNode=a;
	        return;
	    }
	    
	    Node currentNode=startingNode;
	    while(currentNode.next!=null){
	        currentNode=currentNode.next;
	        
	    }
	    
	    currentNode.next=a;
	    
	    
	}
	
	
	
	
	public void insertupdate(int index , int id     , String name)
	{
	    if(index > getLength())
	    {
	        return;    
	    }
	    
	    Node n=new Node();
	  
	    n.id=id;
	    n.name=name;
	  
	    if(index <= 1)
	    {
	        
	  
	        n.next=startingNode;
	        startingNode = n;
	        return;
	    }
	    
	    
	   Node currentNode =startingNode;
	   int count=0;
	   
	   for(count=0;count<index-2;count++){
	       
	       currentNode=currentNode.next;
	       
	       
	   }
	  
	  n.next=currentNode.next;
	  
	  currentNode.next=n;
	  
	}
	
	
	
	public void delete(int index)
	{
	    if(index>getLength() || index < 1){
	        return;
	    }
	    
	    if(index==1)
	    {
	startingNode=startingNode.next;
	return;
	    }
	    
	    
	   
	   Node currentNode =startingNode;
	   
	   for(int count=0;count<index-2;count++)
	   {
	       
	       currentNode=currentNode.next;
	       
	       
	  
	   }
	    
	  currentNode.next=currentNode.next.next;  
	    
	}
	
	
	
	
	
	
	
	
	public static void print1(Linkedlist l)
	
	{
	    Node cNode =l.startingNode;
	    while(cNode!=null){
	        System.out.println(cNode.id );
	        
	        cNode=cNode.next;
	        
	    }
	    
	    
	    
	}
	
     
     
 }


class Node {
     int id; //
     String name;
     Node next;
    
}



public class Main
{
	public static void main(String[] args) {
	    Linkedlist l =new Linkedlist();
	    
	    Node a =new Node();
	    
	    a.id=123;
	    a.name="laxman";
	    
	    
	    l.startingNode=a;
	    
	    Node b=new Node();
	    
	    b.id=456;
	    b.name="lavan";
	    
	    
	    l.startingNode.next=b;
	    
	    Node c =new Node();
	    c.id =789;
	    c.name="sathish";
	    
	    l.startingNode.next.next=c;
	    
	    
	    
	    
	    Node d =new Node();
	    
	    d.id=741;
	    d.name="sai";
	    
	    Node currentNode=l.startingNode;
	    while(currentNode.next!=null){
	        currentNode=currentNode.next;
	    }
	    
	    currentNode.next=d;
	    
	    
	    Node cNode=l.startingNode;
	    while(cNode!=null){
	        System.out.println(cNode.id);
	        cNode=cNode.next;
	    }
	    
	    
	    
	    //Linkedlist.print(l);
	    
	    //Main.print(l);
	    
	    l.print();
	    
	    int  s=l.getLength();
	    
	    
	    
	    
	    Node f= new Node();
	    f.id=4;
	    f.name="dfdf";
	    l.insert(f);
	    l.print();
	    l.getLength();
	    
	    l.update(3, 31);
	    l.print();
	    
	    l.insertupdate(3, 80, "newinsertUpdate");
	    l.print();
	    
	    l.insertupdate(1, 100, "newinsertUpdate2");
	    l.print();
	    
	     l.insertupdate(5, 1010, "newinsertUpdate3");
	    l.print();
	    
	    
	    
	    l.delete(3);
	    l.print();
	    
	    
	    l.delete(4);
	    l.print();
	    
	    
	    
	    
	}
	
	
	public static void print(Linkedlist l)
	
	{
	    Node cNode =l.startingNode;
	    while(cNode!=null){
	        System.out.println(cNode.id);
	        
	        cNode=cNode.next;
	        
	    }
	    
	    
	    
	}
	
	

	
	
}
