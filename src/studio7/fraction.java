package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	
	public fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public double value() {
		return (double)numerator / denominator;
	}
	
	public double addition(fraction newFraction) {
		return newFraction.value()+ value();
	}
	
	public double multiplication(fraction newFraction) {
		return newFraction.value()* value();
	}
	
	public double reciprocal(){
		return 1/value();
	}
	
	public String simpification(){
		int HCF=1;
		for (int i=1; i<=numerator; i++) {
			if (denominator % i == 0 && numerator % i == 0) {
				HCF = i;
			}
		}
		return (numerator / HCF) + "/" + (denominator / HCF) ;
	}
	
	
	
	
	
	
	
		
			
		}

