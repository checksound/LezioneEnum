package esempio;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		
		int mounthNumber = rightNow.get(Calendar.MONTH);
		
		System.out.println("Mounth number: " + mounthNumber);
		
		// the same as Calendar.MONTH
		mounthNumber = rightNow.get(2);
		
		System.out.println("Mounth number: " + mounthNumber);
		
		// compile time no problem ma eccezione java.lang.ArrayIndexOutOfBoundsException 
		// in esecuzione
		int value = rightNow.get(20);
		
		
	}

}
