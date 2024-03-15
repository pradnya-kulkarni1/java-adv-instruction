package util;

public class Die {
 int dieValue;
 
 public Die() {
	 			dieValue =0;
	
 			}
 
 public void roll()
 	{
	 
	 dieValue = (int) (Math.random() * 6) + 1; 
	 
 	}
 
 public int getValue() {
	 return dieValue;
 }
 
 
}
