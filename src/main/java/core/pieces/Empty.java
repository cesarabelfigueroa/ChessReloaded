import java.awt.Color;

public class Empty extends Piece{
	private static final  String name = "Empty";

	Empty(String image,Position position){
		super(name, image, position, null);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		return false;
	}
}