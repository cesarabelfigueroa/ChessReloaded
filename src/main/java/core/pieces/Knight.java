import java.awt.Color;

public class Knight extends Piece{
	private static final  String name = "Knight";

	Knight(String image, Position position, Color color){
		super(name, image, position, color);
	}

	@Override
	public boolean isValidMove(Position origin, Position destination){
		if((origin.x - 1 == destination.x  || origin.x  + 1 == destination.x) && (origin.y - 2 == destination.y || origin.y + 2 == destination.y)){    
			return true;
		}else if((origin.x - 2 == destination.x  || origin.x  + 2 == destination.x) && (origin.y - 1 == destination.y || origin.y + 1== destination.y)){
			return true;
		}else{
			return false;
		}
	}
}