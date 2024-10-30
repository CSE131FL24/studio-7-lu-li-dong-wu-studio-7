package studio7;

public class die {

	private int side;


	public die(int side) {
		this.side = side;
	}
	
	public int randomN() {
		int randomNumber = (int)(Math.random()*side+1);
		return randomNumber;
	}
	


}
