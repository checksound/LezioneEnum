package esempio;

enum Stagione {
	
	AUTUNNO(10), INVERNO(5), PRIMAVERA(18), ESTATE(25);
	
	private int temperaturaMedia;
	
	Stagione(int temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public int getTemperaturaMedia() {
		return temperaturaMedia;
	}
	
	
}
public class TestStagioni {
	
	static void print(Stagione stagione) {
		
		switch(stagione) {
			case AUTUNNO: 
				System.out.println("Sono in " + stagione.name() + ", temperatura media, " 
						+ stagione.getTemperaturaMedia() + ", cadono le foglie");
				break;
			case ESTATE:
				System.out.println("Sono in " + stagione.name() + ", temperatura media, " 
						+ stagione.getTemperaturaMedia() + ", si va in vacanza al mare");
				break;
			case INVERNO:
				System.out.println("Sono in " + stagione.name() + ", temperatura media, " 
						+ stagione.getTemperaturaMedia() + ", cade la neve");
				break;
			case PRIMAVERA:
				System.out.println("Sono in " + stagione.name() + ", temperatura media, " 
						+ stagione.getTemperaturaMedia() + ", la natura si risveglia");
				break;
		}
	}
	
	public static void main(String[] args) {
		
		Stagione stagione = Stagione.INVERNO;
		
		print(stagione);

	}

}
