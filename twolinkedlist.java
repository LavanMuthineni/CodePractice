class Node {
    int data;
    Node next;
}


class LinkedList{
   Node head = null;
   Node tail = null;

  public void insert (Node a)
  {
     if (head == null && tail == null)
      {
     	head = a;
     	tail = a;
      }

    else
      {
	tail.next = a;
	tail = tail.next;
      }
    
  }
  
  
    public void twoLinkedList (Node head1, Node head2)
  {

    Node i = head1;
    Node j = head2;
    int icount = 0;
    int jcount=0;
    while (i != null)
      {

     	i = i.next;
        	icount++;
      }
      while(j!=null){
          j=j.next;
          jcount++;
      }
      
       int z=Math.abs(icount-jcount);
       int count=0;
       
      if(icount>jcount){
          while(count<z){
          
          head1=head1.next;
          count++;
      }
      }
      else{
          while(count<z){
         head2=head2.next;
          count++;
          }
          
      }
      
      
      while(head1!=null){
            if(head1==head2){
          System.out.println(head2.data);
          break;
            }
          
          head1=head1.next;
          
          head2=head2.next;
          
            }
     
        }
        
        
        public void circular(){
            Node i=head;
            Node j=head;
            
            
            while(i!=j){
                i=i.next;
                i=i.next;
                
                j=j.next;
            }
            
            i=i.next;
            int count=1;
            
             while(i!=j){
                 i=i.next;
                 count++;
             }
             
        System.out.println(count);    
            
        }
        
    
   }


public class Main
{
	public static void main(String[] args) {

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
  c.next = d;
  d.data = 1211;
  
  
  Node e = new Node();
  d.next = e;
  e.data = 11211;
  
  
  
  Node head2 = new Node();
  head2.data = 32;
  head2.next = d;
  
  LinkedList l = new LinkedList();
  l.twoLinkedList(head2, head1);
  

	}
}
