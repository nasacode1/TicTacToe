import java.util.Scanner;
public class Player {
	char symbol;
	
	char getSymbol() {
		return this.symbol;
	}
	
	int makeMove() {
		Scanner scanner = new Scanner(System.in);
		int userMove = scanner.nextInt();
		while (userMove < 1 ||  userMove > 9) {
			System.out.println("Invalid input. Kindly enter numbers between 1-9.");
			userMove = scanner.nextInt();
		}
		return userMove;
	}
	
}
