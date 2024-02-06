public class selectionSort {
    public static void selection(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min] > a[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }

        System.out.println("After selection sorted: ");
         for(int i=0;i<n;i++)
         {
            
                System.out.print(a[i]+" ");
         }

    }

    public static void main(String [] args){
        int a[]={7,4,10,8,3,1};
        int n=a.length;
        System.out.println("before Sort: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
         selection(a);
    }

    
}