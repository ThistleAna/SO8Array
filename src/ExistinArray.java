//1.  import scanner class
import java.util.Scanner;
public class ExistinArray {
    public static void main(String[] args) {
        // 2. create scanner object
        Scanner object = new Scanner(System.in);
        // 3. create an array of integers, put 5 int numbers
        int[] Num = {10,20,30,40,50};
        // 4. ask user to guess our number
        System.out.println("Guess the number: ");
         // 5. take user input as int
        int answer = object.nextInt();

        // 6. create a boolean variable, set as false
        boolean isFound = false;
        // 7. a.loop through array using for loop
        for (int i = 0; i < Num.length; i++) {
            //System.out.println(Num[i]);
            // 7. b.inside this loop, if value entered == to the value on the index i, change boolean variable to true
            if (answer == Num[i] ) {
                isFound= true; // update to true if we find a match
            }
        }// end of for loop


        //8. If boolean is true, output “Value X found in array” otherwise, output “Value was not found in array”.
        if(isFound) {
            System.out.println("Value " + answer + " found in array");
        }
        else {
            System.out.println("Value was not found in array");
        }



    }
}
