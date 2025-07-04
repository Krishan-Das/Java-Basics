import java.util.Scanner;    // This file is essential for taking user Input


public class Java_Basics {
    public static void main(String[] args) {

        // Object creation...
        Scanner sc = new Scanner(System.in);   // Object of Scanner class  --> sc holo Scanner class er akta instace/object.

        System.out.print("Enter a number: ");
        // for taking integer as a Input
        int number = sc.nextInt();  // sc --> instance. ***  sc.nextInt();
        System.out.println(number);

    }
}
