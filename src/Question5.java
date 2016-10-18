
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user 
        Scanner input = new Scanner(System.in);
        String name;

        // Ask for users name
        System.out.println("Please enter your name");
        name = input.nextLine();

        // Test #1 Average
        System.out.println("What was the first test out of?");
        double math = input.nextDouble();
        System.out.println("What mark did you get?");
        double one = input.nextDouble();
        double first = (double) (one / math * 100);

        // Test #2 Average
        System.out.println("What was the second test out of?");
        double biology = input.nextDouble();
        System.out.println("What mark did you get?");
        double two = input.nextDouble();
        double second = (double) (two / biology * 100);

        // Test #3 Average
        System.out.println("What was the third test out of?");
        double tech = input.nextDouble();
        System.out.println("What mark did you get?");
        double three = input.nextDouble();
        double third = (double) (three / tech * 100);

        // Test #4 Average 
        System.out.println("What was the fourth test out of?");
        double computerScience = input.nextDouble();
        System.out.println("What mark did you get?");
        double four = input.nextDouble();
        double fourth = (double) (four / computerScience * 100);

        // Test #5 Average
        System.out.println("What was the fifth test out of?");
        double chemistry = input.nextDouble();
        System.out.println("What mark did you get?");
        double five = input.nextDouble();
        double fifth = (double) (five / chemistry * 100);

        // output all test scores iin order
        System.out.println("Test score for " + name + "are the folliwing:");
        System.out.println("math:" + first + "%");
        System.out.println("biology" + second + "%");
        System.out.println("tech" + third + "%");
        System.out.println("computerScience" + fourth + "%");
        System.out.println("chemistry" + fifth + "%");

        // average of all test scores
        double average = (double) ((first + second + third + fourth + fifth) / 5);

        // final statement of the users average of all test
        System.out.println("Your average is " + average + "%.");

    }
}
