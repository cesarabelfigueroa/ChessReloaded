import java.awt.Color;

public class Rook extends Piece{
	private static final  String name = "Rook";

	Rook(String image, Position position, Color color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		if(origin.x == destination.x){
			return true;
		}else if(origin.y == destination.y){
			return true;
		}else{
			return false;
		}
	}
}