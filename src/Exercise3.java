import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many numbers will there be: ");
		int amount = reader.nextInt();
		
		int count = 0;
		float input;
		float sum = 0;
		float sumSquare = 0;
		
		while (count < amount) {
			System.out.println("Enter a number: ");
			input = reader.nextFloat();
			sum += input;
			sumSquare += input * input;
			count += 1;
		}
		
		float avg = sum / amount;
		float avg2 = avg * avg;
		
		float avgSquare = sumSquare / amount;
		double SD = Math.sqrt(avgSquare - avg2);
		
		System.out.println("The standard deviation is  " + SD);
	}

}
