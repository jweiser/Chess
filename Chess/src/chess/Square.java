package chess;

import java.awt.Point;


public class Square {
	private Point coordinates;
	private Color color;
	private boolean isEmpty;	
	
	public Square(Point coordinates) {
		this.coordinates = coordinates;
		this.color = determineColor();
		setEmpty(true);
	}

	public Point getCoordinates() {
		return coordinates;
	}

	public Color getColor() {
		return color;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	private Color determineColor() {
		return coordinateSum() % 2 == 0 ? Color.BLACK : Color.WHITE;
	}
	
	private int coordinateSum() {
		return (int) (getCoordinates().getX() + getCoordinates().getY());
	}
}
