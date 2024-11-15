// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);
        int nameLength = word.length();
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < nameLength; i++) {
                char letter = word.charAt(i);
                System.out.println("Give me "+ (anLetters.indexOf(letter)>0 ? "an " : "a  ") +letter+": "+ letter+"!");
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
                System.out.println(word+"!!!");
        }

        }
}
