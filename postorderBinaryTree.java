class Node {
    int data;
    Node rightChild;
    Node leftChild;
}

class BinaryTree{
 Node root =null;

public void postOrder(Node n){
    
    
    if(n==null){
        return;
    }
    
    
    
    if(n.leftChild!=null){
        postOrder(n.leftChild);
    }
      
    if(n.rightChild!=null){
     postOrder(n.rightChild); 
      
    }
  System.out.println(n.data);
    
    
}

}
public class Main
{
	public static void main(String[] args) {
			 BinaryTree b =new BinaryTree();	
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
    b.postOrder(b.root);
	
	
	
		
		
	}
}
