package masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe;

import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils.Console;
import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils.Direction;



public class Board {

	private Color[][] colors;

	public Board() {
		this.colors = new Color[Coordinate.DIMENSION][Coordinate.DIMENSION];
		this.reset();
	}

	public void reset() {
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				this.colors[i][j] = Color.NULL;
			}
		}
	}

	public void putToken(Coordinate coordinate, Color color) {
		assert !coordinate.isNull();

		this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
	}

	public void moveToken(Coordinate origin, Coordinate target) {
		assert !origin.isNull() && !this.isEmpty(origin);
		assert !target.isNull() && this.isEmpty(target);
		assert !origin.equals(target);

		Color color = this.getColor(origin);
		this.putToken(origin, Color.NULL);
		this.putToken(target, color);
	}

	private Color getColor(Coordinate coordinate) {
		assert !coordinate.isNull();

		return this.colors[coordinate.getRow()][coordinate.getColumn()];
	}

	public boolean isOccupied(Coordinate coordinate, Color color) {
		return this.getColor(coordinate) == color;
	}

	public boolean isEmpty(Coordinate coordinate) {
		return this.isOccupied(coordinate, Color.NULL);
	}

//	boolean isTicTacToe(Color color) {
//		assert !color.isNull();
//
//		List<Direction> directions = this.getDirections(color);
//		if (directions.size() < Coordinate.DIMENSION - 1) {
//			return false;
//		}
//		for (int i = 0; i < directions.size() - 1; i++) {
//			if (directions.get(i) != directions.get(i + 1)) {
//				return false;
//			}
//		}
//		return !directions.get(0).isNull();
//	}
	public boolean isTicTacToe(Color color) {
		assert !color.isNull();

		Direction[] directions = this.getDirections(color);
		if (directions.length < Coordinate.DIMENSION - 1) {
			return false;
		}
		for (int i = 0; i < directions.length - 1; i++) {
			if (directions[i] != directions[i + 1]) {
				return false;
			}
		}
		return !directions[0].isNull();
	}

//	private List<Direction> getDirections(Color color) {
//		assert !color.isNull();
//
//		List<Direction> directions = new ArrayList<>();
//		List<Coordinate> coordinates = this.getCoordinates(color);
//		if(!coordinates.isEmpty()){
//			for (int i = 0; i < coordinates.size() - 1; i++) {
//				directions.add(coordinates.get(i).getDirection(coordinates.get(i + 1)));
//			}
//		}
//		return directions;
//	}

	private Direction[] getDirections(Color color) {
		assert !color.isNull();

		Coordinate[] coordinates = this.getCoordinates(color);
		int pairs = 0;
		for (int i = 1; i < coordinates.length; i++) {
			if (coordinates[i] != null) {
				pairs++;
			}
		}
		Direction[] directions = new Direction[pairs];
		for (int i = 0; i < directions.length; i++) {
			directions[i] = coordinates[i].getDirection(coordinates[i + 1]);
		}
		return directions;
	}
//	List<Coordinate> getCoordinates(Color color) {
//		assert !color.isNull();
//
//		List<Coordinate> coordinates = new ArrayList<>();
//		for (int i = 0; i < Coordinate.DIMENSION; i++) {
//			for (int j = 0; j < Coordinate.DIMENSION; j++) {
//				if (this.getColor(new Coordinate(i,j)) == color) {
//					coordinates.add(new Coordinate(i, j));
//				}
//			}
//		}
//		return coordinates;
//	}
//private Coordinate[] getCoordinates(Color color) {
//	assert !color.isNull();
//
//	Coordinate[] coordinates = new Coordinate[Coordinate.DIMENSION];
//	int k = 0;
//	for (int i = 0; i < coordinates.getDimension(); i++) {
//		for (int j = 0; j < coordinates.getDimension(); j++) {
//			if (this.getColor(new Coordinate(i, j)) == color) {
//				coordinates[k] = new Coordinate(i, j);
//				k++;
//			}
//		}
//	}
//	return coordinates;
//}

	private Coordinate[] getCoordinates(Color color) {
		assert !color.isNull();

		Coordinate[] coordinates = new Coordinate[Coordinate.DIMENSION];
		int k = 0;
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				if (this.getColor(new Coordinate(i, j)) == color) {
					coordinates[k] = new Coordinate(i, j);
					k++;
				}
			}
		}
		return coordinates;
	}

	public void write() {
		Message.HORIZONTAL_LINE.writeln();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			Message.VERTICAL_LINE.write();
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				this.getColor(new Coordinate(i, j)).write();
				Message.VERTICAL_LINE.write();
			}
			Console.getInstance().writeln();
		}
		Message.HORIZONTAL_LINE.writeln();
	}

}
