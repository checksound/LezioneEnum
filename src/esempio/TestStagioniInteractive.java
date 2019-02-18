package esempio;

import java.util.Scanner;

public class TestStagioniInteractive {
	
	/**
	 * Medodo per stampare i dati sulla stagione.
	 * 
	 * @param stagione
	 */
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
		
		System.out.println("Scegli la stagione:");
		
		Scanner scanner = new Scanner(System.in);
		
		String nameStagione = scanner.next();
		
		nameStagione = nameStagione.toUpperCase();
		
		try {
			Stagione stagione = Enum.valueOf(Stagione.class, nameStagione);
			System.out.println("HAI SCELTO: " + stagione);
			print(stagione);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
