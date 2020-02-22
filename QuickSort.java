
public class QuickSort {

    public static void main(String[] args) {
        
        
        int[] a ={6,5,7,4,3,1,8,9,1};
        quicksort(a, 0, a.length-1);
    
    }
        
    public static void quicksort(int[] a, int start, int end)
    {
        
      //  System.out.println(start +"  "+ end   );
        
        
        if(start>= end){
            return;
        }
        
        if(start+1 == end)
        {
            if(a[start] > a[end])
            {
                int swap=a[start];
                a[start]=a[end];
                a[end]=swap;
            }
        }
            
    int i=start+1;
    int j=end;
    int pivot=start;
    
    while(i<=j){
       //// System.out.println(i+"  "+ j);
        
        if(a[i]<=a[pivot]){
            i++;
        }
        else if(a[pivot]<a[j]) {
            j--;
        }
        else if(a[i]>a[pivot] && a[pivot]>=a[j] ){
    
            int swap=a[i];
            a[i]=a[j];
            a[j]=swap;
            i++;
            j--;
        }
    }
    
    
    int swap=a[pivot];
    a[pivot]=a[j];
    a[j]=swap;
  
  print(a);
  quicksort(a, start, j-1) ;
  quicksort(a,j+1, end);
        
        
        
    }

public static void print(int[] a){
    for(int  i=0;i<a.length;i++){
      System.out.print(a[i] + "  ");
    }
    
    System.out.println();
}

    
}
