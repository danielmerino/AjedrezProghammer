package dmerino.ajedrez.logic;

public interface IPlayerHandler {

	public Move getMove();

	public void moveSuccessfullyExecuted(Move move);

}
