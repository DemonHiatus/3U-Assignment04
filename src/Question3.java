
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user 
        Scanner input = new Scanner(System.in);
        String num;

        // ask user for their numbers, and store it
        System.out.println("Please enter 4 numbers on seperate lines.");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();

        // output the numbers in order the user had inputted them
        System.out.println("Your numbers were " + first + ", " + second + ", " + third + ", " + fourth + ".");

    }
}
