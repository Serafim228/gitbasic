package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      } 
      
      // TODO:напишите ваш код тут, результат вывести в консоль.

	  input = input.replaceAll("[^0-9]", "");
	  if (input.length() == 11 && input.charAt(0) == '7'|| input.length() == 11 && input.charAt(0) == '8' ) {
		  System.out.println(input.charAt(0) == '7' ? input : input.replace("8", "7"));
	  }	else  if (input.length() == 10 ) {
		 
		  System.out.println("7" + input);
	  } else 
		  System.out.println("Неверный формат номера");
    }
  }

}
