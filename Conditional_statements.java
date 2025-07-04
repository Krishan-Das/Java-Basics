import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;    // Essential for taking user input.
public class Conditional_statements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Note:-   " import java.util.Scanner "   outside the class ☝️.



//         *****************    Conditional Statements    *********************

//        ##  If   ---------------------------------------------------------

        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();        // Make sure that object/instancr sc is created ☝️
        
        //if
        if (age>=18){
            System.out.println("You are eligable for vote");
        }




//        Q1) Write a programe in java to check weather a number is positive or not  * * * * * * * * * *
        // Solution -->
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Condition  checking
        if (number > 0){
            System.out.print(number + " is positive");
        }




    }
}
