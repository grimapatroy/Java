package masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils;

public enum Direction {

	VERTICAL,
	HORIZONTAL,
	MAIN_DIAGONAL,
	INVERSE_DIAGONAL,
	NULL;

	public boolean isNull() {
		return this == Direction.NULL;
	}	

}
