
public class Rook extends Piece{
	private static final  String name = "Rook";

	Rook(Position position, String image, int color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		return true;
	}
}