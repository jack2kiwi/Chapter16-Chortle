import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many integers will be added: ");
		int amount = reader.nextInt();
		
		int count = 0;
		int total = 0;
		
		while (count < amount) {
			System.out.println("Enter an integer: ");
			total += reader.nextInt();
			count += 1;
		}
		
		System.out.println("The sum is  " + total);
	}

}
