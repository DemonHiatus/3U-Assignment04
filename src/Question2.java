
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you want to convert");

        // inches to cm
        double inch = input.nextDouble();
        double cm = (double) (inch * 2.54);

        // output the converstion
        System.out.println(inch + " inches is the same measurement as " + cm + " cm.");
        System.out.println("You did it!");

    }
}
