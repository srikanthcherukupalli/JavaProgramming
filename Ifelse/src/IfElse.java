import java.util.Scanner;
import java.lang.*;
public class IfElse {
    public static void main(String[] args) {
        System.out.println("Please type your age:");
    Scanner user_age = new Scanner(System.in);
        int age = user_age.nextInt();
        if (age < 0) {
            System.out.println("**********************");
            System.out.println("Sorry, Incorrect age!!");
            System.out.println("**********************");
            System.exit(0);
        }

        System.out.println("Please type your name:");
        Scanner user_name = new Scanner(System.in);
        String name = user_name.nextLine();
        if (name=="") {
            System.out.println("**********************");
            System.out.println("Sorry, Incorrect Name!!");
            System.out.println("**********************");
            System.exit(0);
        }
   // System.out.println(user_age);
        System.out.println("**********************");
    if (age >= 0 && age<18) {
        System.out.println(name + ",you are a minor");
        System.out.println("**********************");
    }
    if (age>=18) {
        System.out.println(name + ",you are a major");
        System.out.println("**********************");
    }
}
}
