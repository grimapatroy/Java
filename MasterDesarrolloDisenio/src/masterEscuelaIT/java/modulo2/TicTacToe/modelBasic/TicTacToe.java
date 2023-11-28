package masterEscuelaIT.java.modulo2.TicTacToe.modelBasic;

import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe.Board;
import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe.Message;
import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe.Turn;
import masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils.YesNoDialog;

class TicTacToe {

	private Board board;
	private Turn turn;

	TicTacToe(){
		this.board = new Board();
		this.turn = new Turn(this.board);
	}

	private void play() {
		do {
			this.playGame();
		} while (this.isResumedGame());
	}

	private void playGame() {
		Message.TITLE.writeln();
		this.board.write();
		do {
			this.turn.play();
			this.board.write();
		} while (!this.isTicTacToe());
		this.turn.writeWinner();
	}

	private boolean isTicTacToe() {
		return this.board.isTicTacToe(this.turn.getActiveColor());
	}

	private boolean isResumedGame() {
		YesNoDialog yesNoDialog = new YesNoDialog();
		yesNoDialog.read(Message.RESUME.toString());
		if (yesNoDialog.isAffirmative()) {
			this.board.reset();
			this.turn.reset();
		}
		return yesNoDialog.isAffirmative();
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}

}
