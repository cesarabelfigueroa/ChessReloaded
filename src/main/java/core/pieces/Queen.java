
public class Queen extends Piece{
	private static final  String name = "Queen";

	Queen(Position position, String image, int color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		return true;
	}
}