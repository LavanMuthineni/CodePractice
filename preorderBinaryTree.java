class Node {
    int data;
    Node rightChild;
    Node leftChild;
}

class binaryTree{
    
    Node root=null;
    
    
   
     public void preOrder(Node n) {

       System.out.println(n.data);
       
    if(n.leftChild!=null){
        
        preOrder(n.leftChild);
        
    }
     
     if(n.rightChild!=null){
        preOrder(n.rightChild);
     } 

   
        }

}

public class Main
{
	public static void main(String[] args) {

     binaryTree b =new binaryTree();	
     Node a=new Node();
     a.data=4;
      
     b.root=a; 
      
     Node c=new Node();
     c.data=5;
      
     a.leftChild=c;
     
     Node d=new Node();
     d.data=6;
      
       a.rightChild=d;
     
      
     Node e=new Node();
     e.data=7;
     c.leftChild=e;
     
     Node f=new Node();
     f.data=8;
     c.rightChild=f;
     
		
		
		 
     Node g=new Node();
     g.data=9;
     d.rightChild=g;
    b.preOrder(b.root);
	}
}
