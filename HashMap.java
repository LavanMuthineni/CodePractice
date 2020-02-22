import java.util.*;
public class Main
   {
     public static void main (String[]args)
      {
        HashMap < Integer, Integer > a = new HashMap < Integer, Integer > ();

          int[] b = { 1, 2, 5, 6, 4, 1 ,5};

        for (int i = 0; i < b.length; i++)
         {

	       if (a.containsKey(b[i]) )
	         {
                 System.out.println("Duplicates   "   +   b[i]  );
	             }   
             	else
	               {
	                 a.put (b[i], 1);
	                     }

      }
 
      
          }
		      }
