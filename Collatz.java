// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int i = 1; i <= seed; i++) {

            int num = i;
            int times = 1;
            String conjecture = num + " ";

            do {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }
                times++;
                conjecture = conjecture + num + " ";
            } while (num != 1);

            conjecture = conjecture + "(" + times + ")";
            if (mode.equals("v")) {
                System.out.println(conjecture);
            }
        }

        System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");

    }
}
