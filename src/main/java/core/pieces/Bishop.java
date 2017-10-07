
public class Bishop extends Piece{
	private static final  String name = "Bishop";

	Bishop(Position position, String image, int color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		return true;
	}
}