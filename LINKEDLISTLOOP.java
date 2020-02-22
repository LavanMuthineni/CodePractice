class Node{
    int data;
    Node next;
}


class linkedlist{
    
    Node head=null;
    Node tail=null;
    
    
    public void insert(int b){
        
        Node a=new Node();
        a.data=b;
    if (head == null && tail == null)
         {
         	head = a;
        	tail = a;
            }
             else{
              tail.next=a;
              tail=tail.next;
            
                 }
        
      }
    
    
    public void loopFinding(Node head1){
     
            Node i=head;
            Node j=head;
            
            
            while(i!=j){
                i=i.next;
                i=i.next;
                
                j=j.next;
            }
            
            
                 Node i ;
            
    }


    public void detect(Node i, Node head )

   {
          Node q=head;
          while(i!=q){
              i=i.next;
              q=q.next;
          }
          Node q;
          
   }

   public void remove(Node q,Node j){
       
       while(j!=q){
           j=j.next;
       } 
       
       j.next=null;
       
   }






    
    
}

public class Main
{
	public static void main(String[] args) {
	    
	  linkedlist l = new linkedlist();
	    
	   
  Node head1 = new Node();
  head1.data = 12;
  
  Node a = new Node();
  head1.next = a;
  a.data = 111;
  
  Node b = new Node();
  a.next = b;
  b.data = 211;
  
  Node c = new Node();
  b.next = c;
  c.data = 21;
	  
  Node d = new Node();
  d.next = b;
  d.data = 21;	  
	  
	    
	    
	    
	}
}
