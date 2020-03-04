public class Median
{
	public static void main(String[] args) {
   
        int[] a = {4,6,5,8,9,7,2};
         int n=3;     
        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i;j<a.length;j++){
                if(a[index]>a[j]){
                
                    int temp=a[index];
                    a[index]=a[j];
                    a[j]=temp;
                
                
                }
                
            }
        }
   
   for(int k=a.length-1;k>n;k--){
       System.out.println("  "+a[k]);
   }
   
   int count=0;
   
   for(int i=0;i<a.length;i++){
       count++;
   }
   
 // count= count+1;
   System.out.print("middle element "+ a[count/2]);
   
   
   
   
		
	}
}