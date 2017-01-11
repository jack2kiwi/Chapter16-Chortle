import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = reader.nextInt();
		
		int count = 0;
		double sum = 0;
		
		while (count < n) {
			count += 1;
			sum += 1.0 / count;
		}
		
		System.out.println("Sum is:  " + sum);
	}

}
