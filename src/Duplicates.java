// ACCESS: https://bit.ly/duplicatesSO8
// 1. import random class
import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        // 2. create object random
        Random random = new Random();
        // 3. initialise empty array1 with size 10
        System.out.println("Generating array 1");
        int[] array1 =new int[10];
        for( int i=0; i< array1.length; i++){
            array1[i] = random.nextInt(20)+1;
            System.out.print(array1[i] + " ");
        }
        // 4. fill with random numbers between 1-20

        // 5. initialise empty array2 with size 10
        System.out.println();
        System.out.println("Generating array 2");
        int[] array2 = new int[10];
        for (int i = 0; i<10; i++){
            array2[i] = random.nextInt(20) +1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("\nThe duplicates are ");
        // 6. fill with random numbers between 1-20
        // 7-a use nested for loop to access index array1 and index array2
        // 7-b inside the nested for loop, use if statement to find the duplicated element and print
        for (int i=0; i < array1.length; i++){ // to access array1 index
            for (int j=0; j < array2.length; j++){ // to access array2 index
                // if statement
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }

    }
}
