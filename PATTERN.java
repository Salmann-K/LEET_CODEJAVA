package com.company.UPLOAD;

public class PATTERN {

     /*
    static void patter3(int n)
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
     
     
       /*
    static void pattern14(int n)
    {
        for (int row = n; row >0 ; row--) {
            for (int i =1; i <n-row ; i++) {
                System.out.print(" ");
            }
            if(row==1 || row==n) {
                for (int i = 1; i <=(2*row)-1 ; i++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j=1;j<=(row*2)-1;j++){
                    if(j==1 || j==(row*2)-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     */
  
       /*
    static void pattern15(int n) {
        for (int i=1; i<= n ; i++)
        {
            for (int j = n; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if( i==1)
            {
                System.out.println("");
            }
            else
            {
                System.out.println("*");
            }
        }
        for (int i=n-1; i>= 1 ; i--)
        {
            for (int j = n; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if(i==1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }
    */
     
       /*
    static void pattern16(int n)
    {
        for (int row = 0; row <n ; row++) {
            int number=1;
            //For Spaces
            for (int col = n; col >row ; col--) {
                System.out.print(" ");
            }
            // For Stars
            for (int i = 0; i <=row ; i++) {

                    System.out.print(number+" ");
                    number=number* (row - i) /(i+1);
            }
            System.out.println(); }}
     */

    /*
    static void pattern17(int n) {
        for (int i=1; i<= n-1 ; i++) {
            //For Outer Spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-2; i>= 1 ; i--)
        {
            //For Outer Spaces
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */
  
     
}
