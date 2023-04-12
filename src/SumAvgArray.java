public class SumAvgArray {
    public static void main(String[] args) {
        // declare sum variable
        int sum =0;
        // declare array of integer values with size 10
        int [] numbers = {11, 15, 12, 15, 17, 19, 18, 11, 16, 17 };

        // display using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            sum = sum + numbers[i]; // sum += numbers[i];
        }

        System.out.println("Total = " + sum);

        // calculate the average and print the average
        double average = (double)sum / numbers.length; // type casting, int to double

        System.out.println("Average = " + average);
    }
}
