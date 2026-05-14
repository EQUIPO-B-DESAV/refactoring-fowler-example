package ubu.gii.dass.refactoring;

public class NewReleasePrice extends MoviePrice {
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	public double getCharge(int daysRented) {
		
		double thisAmount = 0;
		
		return thisAmount += daysRented * 3;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		
		int points=0;
		points++;
		// add bonus for a two day new release rental
		if (daysRented > 1)
			points++;
		return points;
	}
}
