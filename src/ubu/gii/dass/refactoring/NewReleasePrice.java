package ubu.gii.dass.refactoring;

public class NewReleasePrice extends MoviePrice {
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	public double getCharge(Movie movie, int daysRented) {
		
		double thisAmount = 0;
		
		return thisAmount += daysRented * 3;
	}
}
