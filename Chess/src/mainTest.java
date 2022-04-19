import java.util.Scanner;

public class mainTest {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ChessBoard chess = new ChessBoard();
		char[][] gridContents = new char[8][8]; // Grid Contents array
		int rowMove;
		int columnMove;
		int rowTo;
		int columnTo;
		chess.initializeGrid();
		chess.displayGrid();
		
		System.out.print("Enter the row and column of the piece to move respectively(Ex: 1 2): ");
		rowMove = scnr.nextInt();
		columnMove = scnr.nextInt();

		System.out.print("Enter the row and column of the piece destination respectively.(Ex: 1 2): ");
		rowTo = scnr.nextInt();
		columnTo = scnr.nextInt();

		gridContents[rowTo][columnTo] = gridContents[rowMove][columnMove];
		gridContents[rowMove][columnMove] = 'E';

		System.out.println();

		chess.updateGrid();
	}

}
