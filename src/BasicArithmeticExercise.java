import java.util.Scanner;

/**
 * Created by SarahVillareal on 5/12/17.
 */
public class BasicArithmeticExercise {
    public static void main(String[] args) {
        long number;
        long factorial;
        Scanner input = new Scanner(System.in);

        String wantsToContinue;
        do {

            System.out.println("Enter an integer number");
            number = input.nextLong();

            factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println(number + "!=" + factorial);
            System.out.println("Do you want to continue? (y/n)");
            input.nextLine();
            wantsToContinue =input.nextLine();
        } while ("y".equalsIgnoreCase(wantsToContinue));
    }
}