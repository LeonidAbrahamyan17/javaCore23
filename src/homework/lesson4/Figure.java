package homework.lesson4;
    /*


Figure 1

*
* *
* * *
* * * *
* * * * *


Figure 2

         *
       * *
     * * *
   * * * *
 * * * * *


Figure 3

* * * * *
* * * *
* * *
* *
*

*/







/*
 * *
 * * *
 * * * *
 * * * * *
 */

public class Figure {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
