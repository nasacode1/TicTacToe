
public class Board {
	int rowsCount;
	int columnsCount;
	char[][] Board;
	int move;
	char symbol;
	
	public Board(int size) {
		this.rowsCount = size;
		this.columnsCount = size;
		this.Board = new char[rowsCount][columnsCount];
		
	}
	
	public void placePiece(int move, char symbol) {
		int row = (move - 1)/this.columnsCount;
		int col = (move - 1)%this.columnsCount;
		Board[row][col] = symbol;
		
	}
	
	public char getPiece(int move) {
		int row = (move - 1)/this.columnsCount;
		int col = (move - 1)%this.columnsCount;
		return Board[row][col];
	}

	public char isGameOver() {
		//check every column to see if there are any XXX or OOO
		String line = " ";
		for (int j=0; j<this.columnsCount; j++) {
		for(int i=0; i< this.rowsCount ; i++){
			if (this.Board[i][j] == ' ') {
				return 'e';
			}
			line = line + this.Board[i][j];
		}
		if(line.equals("ooo") || line.equals("xxx") ) {
			return line.charAt(0);
		}
	}
		//check every row to see if there are any XXX or OOO
		
		line = " ";
		for (int j=0; j<this.rowsCount; j++) {
			for(int i=0; i< this.columnsCount ; i++){
				line = line + this.Board[j][i];
			}
			if(line.equals("ooo") || line.equals("xxx") ) {
				return line.charAt(0);
			}
		}
		
		line = " ";
		for (int i=0; i<this.rowsCount; i++) {
			for(int j=0; j< this.columnsCount ; j++){
				if(i == j) {
					line = line + this.Board[i][j];
				}
				
			}
			if(line.equals("ooo") || line.equals("xxx") ) {
				return line.charAt(0);
			}
		}
		
		line = " ";
		for (int i=this.rowsCount - 1; i>= 0; i--) {
			for(int j=this.columnsCount; j>= 0 ; j--){
				if(i == j) {
					line = line + this.Board[i][j];
				}
			}
			if(line.equals("ooo") || line.equals("xxx") ) {
				return line.charAt(0);
			}
		}
		return 'd';
	}

}
