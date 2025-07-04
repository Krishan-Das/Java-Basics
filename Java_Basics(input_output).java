import java.util.Scanner;    // This file is essential for taking user Input


public class Java_Basics {
    public static void main(String[] args) {

        // Object creation...
        Scanner sc = new Scanner(System.in);   // Object of Scanner class  --> sc holo Scanner class er akta instace/object.

        System.out.print("Enter a number: ");
        // for taking integer as a Input
        int number;      // create variable name: number
        number = sc.nextInt();  // sc --> instance. ***  sc.nextInt();
        System.out.println(number);

        // for taking float number as a input
        System.out.print("Enter float number: ");
        float fnum = sc.nextFloat();
        System.out.println(fnum);

        // Taking "String" input
        System.out.print("Enter your name: ");
        String name = sc.next();   // if user type "My name is Krishan Das" --> sc.next() takes only My. space er por kicchu thake ar input nebe na.
        System.out.println(name);


        // Full line Input
        System.out.print("Enter your fullName: ");
        String fullName = sc.nextLine();
        System.out.println(fullName);    // user joto gulai space dek jotoboroi line likhuk sc.nextLine()  somporno line a input ney;


        // Taking boolean value
        System.out.print("you are adult (true/false) : ");
        boolean is_adult = sc.nextBoolean();     // you are adult (true/false) = true
        System.out.println(is_adult);  // --> ture

    }
}
