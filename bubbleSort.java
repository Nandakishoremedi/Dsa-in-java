
public class bubbleSort {
    public static void main(String args[])
    {
       
        int[] a={1,4,2,6,5};
        int n=a.length;
        System.out.println("before Sort: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++)  
        {  
            for (int j = i + 1; j < n; j++)  
            {  
                if (a[j] < a[i])  
                {  
                    int temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        } 
        System.out.println("After Sorted: ");
         for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}

/* Bubble sort is a bubbling a last element */
