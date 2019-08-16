package dmerino.ajedrez;
import dmerino.ajedrez.ai.SimpleAiPlayerHandler;
import dmerino.ajedrez.gui.ChessGui;
import dmerino.ajedrez.logic.ChessGame;
import dmerino.ajedrez.logic.Piece;


public class Main {

	public static void main(String[] args) {

		int cuatroPeones=0b00111100_00000000;
		int cuatroPeonesYCaballo=0b00111100_00000010;
		int pruebaEnroque=0b11111111_10001001;
		
		ChessGame chessGame;

		if (args.length > 1) {
			int blancasArg=0b11111111_11111111;
			int negrasArg=0b11111111_11111111;
			try {
				blancasArg = Integer.parseInt(args[0],2);
				negrasArg = Integer.parseInt(args[1],2);
			} catch (NumberFormatException e) {
				System.err.println("Los parametros " + args[0] + " y "+ args[1]+ " deben ser números binarios de 16 cifras.");
				System.exit(1);
			}
			chessGame = new ChessGame(blancasArg,negrasArg);
		}
		else {
			// first we create the game
			chessGame = new ChessGame();
		}
		
		
		//ChessGame chessGame = new ChessGame(cuatroPeones,cuatroPeones);

		// then we create the clients/players
		ChessGui chessGui = new ChessGui(chessGame);
		//ChessConsole chessConsole = new ChessConsole(chessGame);
		SimpleAiPlayerHandler ai1 = new SimpleAiPlayerHandler(chessGame);
		SimpleAiPlayerHandler ai2 = new SimpleAiPlayerHandler(chessGame);

		// set strength of AI
		ai1.maxDepth = 1;
		ai2.maxDepth = 2;

		// then we attach the clients/players to the game
		chessGame.setPlayer(Piece.COLOR_WHITE, chessGui);
		//chessGame.setPlayer(Piece.COLOR_WHITE, chessConsole);
		//chessGame.setPlayer(Piece.COLOR_WHITE, ai2);
		chessGame.setPlayer(Piece.COLOR_BLACK, ai1);
		//chessGame.setPlayer(Piece.COLOR_BLACK, chessGui);

		// in the end we start the game
		new Thread(chessGame).start();
	}
	
}