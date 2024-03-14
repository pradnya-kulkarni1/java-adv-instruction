package ui;

public class Grade {
	
	private int aNumber;

	public Grade() {
		
		this.aNumber = 0;
	}
	
	
	public Grade(int aNumber) {
		this.aNumber = aNumber;
	}
	
	
	public void setNumber(int number) {
		this.aNumber = number;
	}
	
	
	public int getNumber() {
	return aNumber;	
	}
	
	public String getLetter() {
		String Letter;
		if (aNumber >=88) {
		Letter = "A";}
		else if (aNumber >=80) {
			 Letter = "B";}
		else if (aNumber >=67) {
			Letter =  "C";}
		else if (aNumber >=60) {
			Letter= "D";}
		else if(aNumber >=0 ){Letter ="F";}
		else Letter = "Invalid Number";
		return Letter;
	}

}
