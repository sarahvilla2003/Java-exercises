package Java1;

import java.util.Scanner;
/**
 * Created by SarahVillareal on 5/17/17.
 */
public class Input {
    public Scanner scan;
    public Input(){
        this.scan=new Scanner(System.in);
    }
    public String getString(){
        return scan.nextLine();
    }

    public boolean yesNo(){
        String answer = this.getString();

        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }

        return false;
    }
}
