package com.company.UPLOAD;

public class PATTERN {

     /*
    static void pattern3(int n)
    {
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
*/
     
      /*
    static void pattern4(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
*/
     
     
     /*
    static void pattern5(int n)
    {
        for (int row = 0; row <=2*n ; row++) {
           if(row>n)
           {
               for (int col = 0; col <=2*n-row-1 ; col++) {
                   System.out.print("* ");
               }
               System.out.println();
           }
           else
           {
               for (int col = 0; col <=row ; col++) {
                   System.out.print("* ");
               }
               System.out.println();
           }

        }
    }
 */

     /*
    static void pattern6(int n)
    {
        for (int row = 1; row <=n ; row++) {
            //For Spaces
            for (int col = 1; col <=n-row ; col++) {
                System.out.print(" ");
            }
            // For Stars
            for (int i = 1; i <=row ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
     
     
       /*
    static void pattern7(int n)
    {
        for (int row = 0; row <n ; row++) {
            //For Spaces
            for (int col = 0; col <=row ; col++) {
                System.out.print(" ");
            }
            // For Stars
            for (int i = 1; i <=n-row ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */
     
     /*
    static void pattern8(int n)
    {
        for (int row = 0; row <n ; row++) {
            //For Spaces
            for (int col = 0; col <n-(row-1) ; col++) {
                System.out.print(" ");
            }
            // For Stars
            for (int i = 0; i <=(2*row) ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
     
       /*
    static void pattern9(int n)
    {
        for (int rows=0;rows<n;rows++)
        {
            //For Spaces
            for(int j=0;j<=rows;j++)
            {
                System.out.print(" ");
            }
            //For Stars
            for(int col=(2*n)-1; col>2*rows;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */
  
       /*
    static void pattern10(int n)
    {
        for (int row = 0; row <n ; row++) {
            //For Spaces
            for (int col = 0; col <n-(row-1) ; col++) {
                System.out.print(" ");
            }
            // For Stars
            for (int i = 0; i <=row ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */
  
       /*
    static void pattern11(int n)
    {
        for (int rows=0;rows<n;rows++)
        {
            //For Spaces
            for(int j=0;j<=rows;j++)
            {
                System.out.print(" ");
            }
            //For Stars
            for(int col=n-1; col>=rows;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */
  
       /*
    static void pattern12(int n)
    {
        for (int rows=0;rows<2*n;rows++)
        {if(rows<n) {
                //For Spaces
                for(int j=0;j<=rows;j++)
                {
                    System.out.print(" ");
                }
                //For Stars
                for(int col=n-1; col>=rows;col--){
                    System.out.print("* ");
                }
                System.out.println();}
            else {
                //For Spaces
                for(int j=0;j<=2*n-(rows+1);j++)
                {
                    System.out.print(" ");
                }
                for (int i = 0; i <rows-(n-1); i++) {
                    System.out.print("* ");
                }
                System.out.println();}}
    }
     */
    /*
    static void pattern13(int n)
    {
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=n-row ; col++) {
                System.out.print(" ");
            }
            if(row==1 || row==n){
                for(int j=1;j<=row*2-1;j++) {
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=row*2-1;j++){
                    if(j==1 || j==row*2-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
*/
     
     
     
}
