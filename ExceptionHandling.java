public class ExceptionHandling
{
	public static void main(String[] args) {
		int a=5;
		try{
		    sum(a,a);
		}
		catch(ArithmeticException e){
		    System.out.println("lavan");
		}
		catch(Exception e){
		    System.out.println("lavan" + e.getMessage());
		}
		finally{
		    System.out.println("program completed");
		}
	}
	
	public static int sum(int a , int b) throws Exception {
	    int z= a+b;
	    z = divided(z);
	    System.out.println(z);
	    return z;
	}
	
	private static int divided(int a) throws Exception {
	   try { 
	       return a/9;
	   }
	   catch(Exception e){
	       System.out.println(e);
	       throw new ArithmeticException("kindha dhobindhi");
	   }
}
}