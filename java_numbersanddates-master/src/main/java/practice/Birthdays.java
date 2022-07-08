package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
    	String birthday1 = day + "/"+ month + "/"+ year ;
    	LocalDate today = LocalDate.now();
    	DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
    	LocalDate birthday = LocalDate.parse(birthday1, form);
    	int years = 0;
    	String text = "";
    	for ( ; today.isAfter(birthday) || today.equals(birthday) ; ) {
    		
    		text = text + years + " - " + birthday + " - " + birthday.getDayOfWeek() +
    				System.lineSeparator();
    		years++;
    		birthday = birthday.plusYears(1);
    	}
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        
        return text;
    }
}
