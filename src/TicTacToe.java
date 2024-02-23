public class TicTacToe {
	Player p1 = new Player();
	Board b1 = new Board(3);
	int current_player;
	
	void markCell() {
		int cellNumber = p1.makeMove();
		b1.placePiece(cellNumber, findPlayer());
		
	}
	
	char findPlayer() {
		char[] symbols = {'x', 'o'};
		char player_symbol;
		player_symbol = symbols[current_player];
		current_player = (current_player+1)%2;
		return player_symbol;
		
		
	}

}
