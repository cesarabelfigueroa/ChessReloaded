
import java.awt.Color;

public class Piece{
	Position position;
	String name, image;
	Color color;

	Piece(String name,  String image, Position position,int color){
		this.position = position;
		this.name = name;
		this.image = image;
		this.color = new Color(color);
	}

	public boolean isValidMove(Position origin, Position destination){
		return true;
	}
}