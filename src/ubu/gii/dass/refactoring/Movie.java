package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5.
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	static final int CHILDRENS = 2;
	static final int REGULAR = 0;
	static final int NEW_RELEASE = 1;

	private String _title;
	MoviePrice moviePrice;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return moviePrice.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		
		case Movie.REGULAR:
			moviePrice = new RegularPrice();
			break;
			
		case Movie.NEW_RELEASE:
			moviePrice = new NewReleasePrice();
			break;
			
		case Movie.CHILDRENS:
			moviePrice = new ChildrenPrice();
			break;
			
		default:
	        throw new IllegalArgumentException("Código de precio no válido");
		}
	}

	public String getTitle() {
		return _title;
	}
}
