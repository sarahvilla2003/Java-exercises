/**
 * Created by SarahVillareal on 5/12/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = 6.5;

        System.out.println(number1 + number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);

        int number3= 10;
        int number4 = 4;

        System.out.println(number3 % number4);
        System.out.println(number3 / number4);

        number3++;
        number3++;

        System.out.println(number3);

        number4--;
        number4--;
        System.out.println(number4);

        number4 = number4 + 5;
        number4 +=5;
        System.out.println(number4);

        int anIntegerNumber =23;
        double aDouble = anIntegerNumber;
        System.out.println(aDouble);

        double anotherNumber = 3.45;
        int aSmallerNumber = (int) anotherNumber;
        System.out.println(aSmallerNumber);

    }

}
