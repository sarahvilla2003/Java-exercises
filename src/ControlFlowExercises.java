import java.util.Scanner;

/**
 * Created by SarahVillareal on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//      -----  While Loop  ------------------------------------------------
//
//        int i = 5;
//        System.out.println(i);
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//      -----  Do While Loop ----------------------------------------------
        // Increments by 2
//        int i= 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i<=100);


        int i =100;
        do {
            System.out.println(i);
            i -=5;
        } while ( i>=-10);

//      ----- FizzBuzz Test ------------------------------------------------
//
//        int i = 1;
//        System.out.println(i);
//        while (i <= 100); {
//            System.out.println(i);
//            i++;
//        }
    }
}