public class Question1 {
    public static void main(String[] args) {
        String[ ] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // length = 4, last index = 3
        System.out.println(cars[0]); // call the element on index 0
        // your turn, display Ford
        System.out.println(cars[2]);
        // display length of array cars
        System.out.println(cars.length);

        System.out.println("Display all elements:");
        for (int i=0; i< cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("Display in reverse : ");
        for (int i=cars.length-1 ; i>=0; i--) {
            System.out.println(cars[i]);
        }
    }
}
