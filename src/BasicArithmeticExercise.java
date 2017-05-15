/**
 * Created by SarahVillareal on 5/12/17.
 */
public class BasicArithmeticExercise {
    public static void main(String[] args) {
    long number =4;
    long factorial =1;
    for (int i =1; i<=number; i++){
        factorial = factorial * i;
    }
        System.out.println(number + "!=" + factorial);
    }
}
