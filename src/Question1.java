
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create the input for the user 
        Scanner input = new Scanner(System.in);

        // ask the user for their name
        System.out.println("please enter your name");
        // get the name from the user 
        String name = input.nextLine();
        // say Hello
        System.out.println("Hello " + name + ". How are you today?");
    }
}
