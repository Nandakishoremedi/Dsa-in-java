
class Patterns
{
public static void main(String [] args){
        int n=5;

        //for trianglle number
        System.out.println("right triangle of Numbers");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //for Stars*
        System.out.println("Right triangle of *'s");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Rra
        System.out.println("for Reverse right angle");
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Number changing half pyramid
        System.out.println("Number increasing half pyramid");
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }   

        //Increasing rows
        System.out.println("Nubers as pyramid");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");         
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //reverse triangle
        System.out.println("reverse triangle");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //nadhu
        System.out.println("Printing stars as pyramid");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");         
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //printing alternate values in increasing triangle
        System.out.println("Alternate values");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                System.out.print(2);

                else
                System.out.print(1);
            }
            System.out.println();
        }

        //nadhu
        System.out.println("Printing stars as up pyramid");
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //exam question
        System.out.println("REVERSE RIGHT ANGLE AND ANOTHER WAY");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //reverse right triangle left looking
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(i>=j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        //daimond
        System.out.println("reverse pyramid");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //daimond
        System.out.println("DAIMOND");
        for(int i=1;i<=n;i++)
        {
            //up
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");         
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=1;i<=n;i++)
        {
            //down
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
           }   //for(int )
        
    }   
    
    }


    