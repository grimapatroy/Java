package masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe;


import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils.Console;

enum Color {

	X,
	O,
	NULL;

	static Color get(int ordinal){
		assert ordinal >= 0 && ordinal < Color.NULL.ordinal();

		return Color.values()[ordinal];
	}

	void write() {
		String string = this.name();
		if (this.isNull()) {
			string = " ";
		}
		Console.getInstance().write(string);
	}

	boolean isNull() {
		return this == Color.NULL;
	}
}
