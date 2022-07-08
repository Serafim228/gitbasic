package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        int containers = boxes % 27 == 0 ? boxes / 27 : boxes / 27 + 1;
        int trucks = containers % 12 == 0 ? containers / 12 : containers / 12 + 1;
        
        for (int i = 1, c = 1, b =1 ; i <= trucks; i++) {
        	System.out.println("Trucks: " + i);
        	 for ( ; c <= containers; c++) {
        		 System.out.println("\tContainer: " + c);
        		 if (c % 12 == 0) {c++; break;}
        		 for ( ; b <= boxes  ; b++) {
        			 System.out.println("\t\tBoxes: " + b);
        			 if (b % 27 == 0) {b++; break;}
        		 }
        	 }
        }
        
        System.out.println("Must :\nTrucks - " + trucks + "\nContainers - " + containers  );
        scanner.close();
        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
