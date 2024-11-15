// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int times = Integer.parseInt(args[0]);

		double pi = Math.PI;
		double calculatedPi = 0;

		int denominator = 1;
		boolean isPlus = true;

		for (int i = 0; i < times; i++) {
			double num = 1.0 /denominator;
			if (isPlus) {calculatedPi += num;}
			else {calculatedPi -= num;}

			isPlus = !isPlus;
			denominator += 2;
		}

		System.out.println("pi according to Java: "+ pi);
		System.out.println("pi, approximated: " + calculatedPi*4);


	}
}
