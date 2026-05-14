package ubu.gii.dass.refactoring;

public class RegularPrice extends MoviePrice {
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	
	public double getCharge(Movie movie, int daysRented) {
		
		double thisAmount = 0;
		
		thisAmount += 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
			
		return thisAmount;
	}
}
