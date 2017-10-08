import java.awt.Color;

public class Board{
	Piece[][] board = new Piece[8][8];
	private String[][] initital = {
		{"Rook-B", "Knight-B", "Bishop-B", "King-B", "Queen-B","Bishop-B", "Knight-B", "Rook-B"},
		{"Pawn-B", "Pawn-B", "Pawn-B", "Pawn-B", "Pawn-B","Pawn-B", "Pawn-B", "Pawn-B"},
		{"Empty-N", "Empty-N", "Empty-N", "Empty-N", "Empty-N","Empty-N", "Empty-N", "Empty-N"},
		{"Empty-N", "Empty-N", "Empty-N", "Empty-N", "Empty-N","Empty-N", "Empty-N", "Empty-N"},
		{"Empty-N", "Empty-N", "Empty-N", "Empty-N", "Empty-N","Empty-N", "Empty-N", "Empty-N"},
		{"Empty-N", "Empty-N", "Empty-N", "Empty-N", "Empty-N","Empty-N", "Empty-N", "Empty-N"},
		{"Pawn-W", "Pawn-W", "Pawn-W", "Pawn-W", "Pawn-W","Pawn-W", "Pawn-W", "Pawn-W"},
		{"Rook-W", "Knight-W", "Bishop-W", "King-W", "Queen-W","Bishop-W", "Knight-W", "Rook-W"}
	};


	Board(){

	}


	public void show(){
		for (int i = 0; i < initital.length; i++) {
			for (int j = 0; j < initital.length; j++) {
				System.out.print(board[i][j].name + " ");
			}
			System.out.println();
		}
	}

	

	public void reset(){
		for (int i = 0; i < initital.length; i++) {
			for (int j = 0; j < initital.length; j++) {
				Position origin = new Position(i,j);
				String piece = initital[i][j];
				String[] identity = piece.split("-");
				String name = identity[0];
				String colorName = identity[1];
				Color color = colorName.equals("B") ? Color.black : Color.white;
				if(name.equals("Rook")){
					board[i][j] = new Rook("", origin, color);
				}else if(name.equals("Knight")){
					board[i][j] = new Knight("", origin, color);
				}else if(name.equals("Bishop")){
					board[i][j] = new Bishop("", origin, color);
				}else if(name.equals("King")){
					board[i][j] = new King("", origin, color);
				}else if(name.equals("Queen")){
					board[i][j] = new Queen("", origin, color);
				}else if(name.equals("Pawn")){
					board[i][j] = new Pawn("", origin, color);
				}else if(name.equals("Empty")){
					board[i][j] = new Empty("", origin);
				}				
			}
		}
	}
}