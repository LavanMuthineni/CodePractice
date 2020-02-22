class Node
{
  int data;
  Node next;
}

class LinkedList
{
  Node head = null;
  Node tail = null;

  public void insert (int b)
  {

    Node a = new Node ();
      a.data = b;

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




  public void nthEndNode (int n)
  {


    Node i = head;
    Node j = head;
    int count = 0;
    while (i != null)
      {

	i = i.next;
	count++;

	if (count > n)
	  {
	    j = j.next;
	  }

      }

    if (n <= count)
      {
	System.out.println (j.data);
      }
  }
  
  
  
  public void MiddleElement(){
      
       Node i = head;
       Node j = head;
      
      while(i!=null){
          i=i.next;
       if(i!=null){
           i=i.next;
            j=j.next;
       }
          
          
         
      }
      
      System.out.println(j.data);
      
      
  }
  
  
  
  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

public class Main
{
  public static void main (String[]args)
  {

    LinkedList l = new LinkedList ();


      l.insert (10);
      l.insert (18);
      l.insert (109);
    //  l.insert (12);
      l.insert (1);
      l.insert (16);
      l.insert (19);
      l.insert (1744);
      l.insert (106666);
       l.insert (106);
      l.nthEndNode (9);
      l.MiddleElement();
  }
}
