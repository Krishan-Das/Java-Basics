import java.util.Scanner;    // This file is essential for taking user Input


public class Java_Basics {
    public static void main(String[] args) {

        
//       # ****************************** Taking Input from the user *****************************

        // Object creation...
        Scanner sc = new Scanner(System.in);   // Object of Scanner class  --> sc holo Scanner class er akta instace/object.

        // for taking integer as a Input
        System.out.print("Enter a number: ");
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


//       # ****************************** Output *****************************

        System.out.println("Hello World!");   // first print --> then go to next line  /   println == print("...\n");
        System.out.print("Hello World");      //  Just print. if next line is needed then just use '\n';
        System.out.printf("\nHello World! %d\n", 1);    // It is usefull for c programmers.  coz printf supports %d, %f, %s, %c to helps in concatinations
        System.out.format("Hello World! %d\n", 2);    // It is same as printf.


//        # concatinations
        String name = "Krishan Das";
        int age = 19;

        // Methode 1....
        System.out.print("My name is "+name+" and age "+age);

        // Methode 2....
        System.out.printf("\n My Name is %s and age is %d", name, age);  // same like c programming language
        System.out.format("\n My name is %s and age %d", name,age); // same no difference


        

    }
}
