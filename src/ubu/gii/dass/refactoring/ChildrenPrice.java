package ubu.gii.dass.refactoring;

public class ChildrenPrice extends MoviePrice {
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	public double getCharge(Movie movie, int daysRented) {
		
		double thisAmount = 0;
		
		thisAmount += 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		
		return thisAmount;
	}
}
