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
     
}
