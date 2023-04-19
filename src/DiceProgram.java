import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        // generate random instance from Random class
        Random random = new Random();
        // generate a random number, save inside variable x
        int x = random.nextInt(12)+1; // within the parentheses, put the bound

        System.out.println(x);
    }
}
