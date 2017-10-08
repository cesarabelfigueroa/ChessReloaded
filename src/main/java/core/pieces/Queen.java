import java.awt.Color;

public class Queen extends Piece{
	private static final  String name = "Queen";

	Queen(String image, Position position, Color color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		if(origin.x + origin.y == destination.x + destination.y){
			return true;
		}else if(origin.x - origin.y == destination.x - destination.y){
			return true;
		}else if(origin.x == destination.x){
			return true;
		}else if(origin.y == destination.y){
			return true;
		}else{
			return false;
		}
	}
}