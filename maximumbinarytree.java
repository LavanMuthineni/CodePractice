class Node{
    int data;
    Node rigthChild;
    Node leftChild;
}

class binaryTree{
    
    Node root=null;
    
    
    public int maximumElement(Node n){
    int max=n.data;
    System.out.println("in " + n.data + " max " + max);
        
    if(n.leftChild != null)
    {
        System.out.println("in left " + n.data + " max " + max);
        int c = maximumElement(n.leftChild);
        System.out.println("in left " + n.data + " c " + c);
        
        if(c > max)
        {
            max = c;
        }
        System.out.println("in left " + n.data + " max " + max);
        
    }
    
    if(n.rigthChild != null)
    {
        System.out.println("in right " + n.data + " max " + max);
        
        int c = maximumElement(n.rigthChild);
        System.out.println("in right " + n.data + " c " + c);
        if(c > max)
        {
            max = c;
        }
        System.out.println("in right " + n.data + " max " + max);
    }
    
    return max;
       
    }
    

}






public class Main
{
	public static void main(String[] args) {
	 binaryTree b =new binaryTree();	
     Node a=new Node();
     a.data=45;
      
     b.root=a; 
      
     Node c=new Node();
     c.data=46;
      
     a.leftChild=c;
     
     Node d=new Node();
     d.data=47;
      
       a.rigthChild=d;
     
      
     Node e=new Node();
     e.data=85;
     c.leftChild=e;
     
     Node f=new Node();
     f.data=87;
     c.rigthChild=f;
     
		
		
		 
     Node g=new Node();
     g.data=8;
     d.rigthChild=g;
     
	 System.out.println(b.maximumElement(b.root));
	
	}
}
