package Yahtzee;

public class CheatException extends Exception {
	public CheatException(){ 
		super("Somebody tried to cheat!!"); 
	}
}