package esempio;

import java.time.LocalDate;
import java.time.Month;

public class TestLocalDate {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
		LocalDate firstBirthday = dateOfBirth.plusYears(1);
		
		System.out.println("FirstBithday: " + firstBirthday);
	}

}
