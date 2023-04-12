// Array : collection of data
public class Example1 {
    public static void main(String[] args) {
        String [] names = new String [3]; // creating array and  allocate memory to the array

        // initialise array
        names[0] = "Harry";
        names[1] = "Hermione";
        names[2] = "Ron";
        

        // OR String [] names = { item1, item2, item3};
        System.out.println(names[0]);
        // your turn: create an array of your favourite foods/movie/place, print all the items
        // length of array, use .length
        System.out.println(names.length);
    }
}
