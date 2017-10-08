import java.awt.Color;

public class Pawn extends Piece{
	private static final  String name = "Pawn";

	Pawn(String image,Position position, Color color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		if(this.color == Color.white){
			return origin.x == destination.x && origin.y + 1 == destination.y;
		}else{
			return origin.x == destination.x && origin.y - 1 == destination.y;
		}
	}
}