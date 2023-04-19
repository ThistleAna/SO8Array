// 1. Import scanner class
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("== REVERSE NAME GENERATOR ==");
        // 2. create scanner object
        Scanner reader = new Scanner(System.in);
        // 3. ask user to enter a name
        System.out.println("This program will reverse any name. Enter a name : ");
        // 4. read user input as char array, you need to typecasting from string to char
        char[] letters = reader.nextLine().toCharArray();
        // 5 . display the name using for loop
        for (int i=0; i < letters.length; i++){
            System.out.print(letters[i] + " ");
        }
        System.out.println("\nDisplay in reverse order: ");
        // 6. now display in reverse, play around with for loop counter
        for (int j=letters.length-1 ; j>=0; j--) {
            System.out.print(letters[j] + " ");
        }
    }
}
