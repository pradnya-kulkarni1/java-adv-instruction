package util;

public class Dice {
	
	Die di1;
	Die di2;
	
	public Dice() {
		
		
		di1 = new Die();
		di2 = new Die();
	}
	public int getDie1Value() {
		

		return di1.getValue();
	}
	
	public int getDie2Value() {
		

		return di2.getValue();
	}

	public int getSum() {
		
		return di1.getValue()+ di2.getValue();
	}
	public void roll() {
		di1.roll();
		di2.roll();
	}
	public void printRoll() {
		System.out.println("Die1 = "+di1.getValue());
		System.out.println("Die2 = "+di2.getValue());
		System.out.println("Sum = "+getSum());
		if(getSum()== 2) System.out.println("Snake eyes!");
		else if (getSum()== 7)System.out.println("Craps!");
	}
	

}
