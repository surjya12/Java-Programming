package StringPrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Write a program to Convert String to Date using predefined formatters
public class DateToString {
	public static void main(String[] args) {
		String string="2000-06-25";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
	}

}
