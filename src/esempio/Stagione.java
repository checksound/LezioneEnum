package esempio;

/**
 * Definizione del tipo enumerativo Stagione 
 * 
 * @author cam
 *
 */

enum Stagione {
	
	AUTUNNO(10), INVERNO(5), PRIMAVERA(18), ESTATE(25);
	
	private int temperaturaMedia;
	
	Stagione(int temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public int getTemperaturaMedia() {
		return temperaturaMedia;
	}
	
	@Override
	public String toString() {
		return name() + ", TEMPERATURA MEDIA: " + getTemperaturaMedia();
	}
	
}