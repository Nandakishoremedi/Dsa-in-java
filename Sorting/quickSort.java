public class quickSort {

    public static void main(String [] args){
        int a[]={7,6,10,5,9,2,15};
        int n=a.length;
        System.out.println("before Sort: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
         quick(a,0,n-1);
         System.out.println("After insertion sorted: ");
         for(int i=0;i<n;i++)
         {
            
                System.out.print(a[i]+" ");
         }
    }

    public static void quick(int a[],int start,int end){
        if(start<end)
        {
            int loc=partition(a,start,end);
            quick(a, start, loc-1);
            quick(a, loc+1, end);

        }
        
    }

    public static int partition(int a[],int lb,int ub){
        int pivot=a[lb];
        int start=lb;
        int end=ub;
        while(start<end)
        {
            while(a[start]<=pivot)
            start++;
            while(a[end]>pivot)
            end--;
            if(start<end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp=a[lb];
        a[lb]=a[end];
        a[end]=temp;
       return end;
    }

}


/*Need to understand again & again */