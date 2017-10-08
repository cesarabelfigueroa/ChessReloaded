import java.awt.Color;

public class King extends Piece{
	private static final  String name = "King";

	King(String image,Position position, Color color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		return (destination.y == origin.y + 1 || destination.y == origin.y || destination.y == origin.y - 1) && (destination.x == origin.x - 1 || destination.x == origin.x || destination.x == origin.x + 1);
	}
}