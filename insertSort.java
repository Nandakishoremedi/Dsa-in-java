public class insertSort {
    public static void insert(int[] a)
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println("After insertion sorted: ");
         for(int i=0;i<n;i++)
         {
            
                System.out.print(a[i]+" ");
         }
    }

    public static void main(String [] args){
        int a[]={5,4,10,1,6,2};
        int n=a.length;
        System.out.println("before Sort: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
         insert(a);
    }
    
}

/*1. Insertion sort is doe by two parts.They are
 *    -sorted sublist
 *    -unsorted sublist
 */
