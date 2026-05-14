package ubu.gii.dass.refactoring;

public abstract class MoviePrice {
	public abstract int getPriceCode();

	public abstract double getCharge(Movie movie, int daysRented);
}
