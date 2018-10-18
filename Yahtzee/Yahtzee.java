package Yahtzee;
import Dice.*;

public class Yahtzee {
	private Dice d1;
	private Dice d2;
	
	public Yahtzee(){
		d1 = new Dice();
		d2 = new Dice();
	}
	
	public String toss(){
		int dice1 = d1.roll();
		int dice2 = d2.roll();
		
		if(dice1 == 6 && dice2 == 6){
			return "YAHTZEE";
		} else {
			String one = String.valueOf(dice1);
			String two = String.valueOf(dice2);
			return one + " " + two;
		}
	}
	
	public String tossCheat() throws CheatException {
		int dice1 = d1.roll();
		int dice2 = d2.roll();
		
		if(dice1 == 6 && dice2 == 6){
			return "YAHTZEE";
		} else {
			throw (new CheatException());
		}
	}
}