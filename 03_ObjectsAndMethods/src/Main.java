import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
    	String text = new Scanner(System.in).nextLine();
    	int sum = 0;
    	Pattern pattern = Pattern.compile("[0-9]+");
    	Matcher matcher = pattern.matcher(text);
    	while(matcher.find()) {
    	   String number = matcher.group();
    	   sum  += Integer.parseInt(number);
    	   System.out.println("Сумма чисел в тексте: " + sum);
    	}
    	
    	
    }
}
