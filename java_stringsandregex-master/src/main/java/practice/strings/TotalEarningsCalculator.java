package practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalEarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    int sum =0;
    
    Pattern pattern = Pattern.compile("[0-9]+");
    Matcher matcher = pattern.matcher(text);
    
    while (matcher.find()) {
    	int start = matcher.start();
    	int end = matcher.end();
    	sum += Integer.parseInt(text.substring(start, end));
    }
    System.out.println(sum);
  }

}