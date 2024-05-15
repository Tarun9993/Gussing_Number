import java.util.Random;
import java.util.Scanner;

public class Random_Num {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int RandomNumber = random.nextInt(100) + 1;

		int count = 0;

		while (true) {
			System.out.println("Enter Your Guess (1 to 100) : ");
			int PlayerNumber = scan.nextInt();
			count++;

			// System.out.println("Player Number " + PlayerNumber);

			if (PlayerNumber < 1 || PlayerNumber > 100) {
				System.out.println("Please enter a number between 1 and 100.");
				continue;
			}

			if (PlayerNumber == RandomNumber) {
				System.out.println("Correct! You Won The Game......!");
				System.out.println("It Tooks You " + count + " tries..");
				break;
			} else if (PlayerNumber < RandomNumber) {
				System.out.println("Nope! The Number is To Higher. Guess Again......!");
			} else {
				System.out.println("Nope! The Number is To Lower. Guess Again.....!");
			}

		}
		System.out.println("Yes The Random number is : " + RandomNumber);
		scan.close();
	}
}