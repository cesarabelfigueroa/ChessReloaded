import java.awt.Color;

public abstract class Piece{
	Position position;
	public String name, image;
	Color color;

	Piece(String name,  String image, Position position,Color color){
		this.position = position;
		this.name = name;
		this.image = image;
		this.color = color;
	}

	public boolean isValidMove(Position origin, Position destination){
		return false;
	}
}