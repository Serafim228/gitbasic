package practice.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameFormatter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
       
      }
      String regex = "[А-я-]+\\s[А-я-]+\\s[А-я]+";
      
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);
      
      if (matcher.matches()) {
    	  String [] fio = input.split("\\s");
    	  System.out.println("Фамилия: " + fio[0] + "\n" + "Имя: " + fio[1] + "\n" 
    			  + "Отчество: " + fio[2]);
      } else 
    	  System.out.println("Введенная строка не является ФИО.");
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }

}