import java.util.Scanner;

/**
 * Created by SarahVillareal on 5/8/17.
 */
public class ConsoleExercise {
    public static void main(String[] args) {
//        Scanner input;
//        input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in); //new object of the class scanner
        String career;

        System.out.println("How old are you?: ");
        int age= scan.nextInt();
        System.out.println("My age is: " + age);

//        Question 2
        System.out.println("What are your three favorite foods?:");
        String firstFood= scan.next();
        String secondFood= scan.next();
        String thridFood= scan.next();



        System.out.println("Write a sentence about what you want to be when you grow up?:");
        career = scan.next();



//        Queston: 3
        int width= scan.nextInt();
        int length= scan.nextInt();
        System.out.println("The width of the class is: " + width);
        System.out.println("The length of the class is: " + length);

        int area= width*length;
        int perimeter= (2*length + 2*width);
        System.out.println("The area is: " + area + "and the perimeter is: " + perimeter);



    }
}
