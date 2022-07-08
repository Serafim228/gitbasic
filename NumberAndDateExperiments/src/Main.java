import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getPeriodFromJavaBirthday();
	}
	
	public static String getPeriodFromJavaBirthday() {
		LocalDate javaBirthday = LocalDate.of(1995, 5, 23);
		Period period = javaBirthday.until(LocalDate.now());
		System.out.println(period.getYears() + " years, " +
				   period.getMonths() + " months, " +
				   period.getDays() + " days");

		return "";
	}
}
