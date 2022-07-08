public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        	
        System.out.println((int)'ё' + "   , " + (int)'я');
        for(int ch =  'Ё' ; ch <= (int)'ё' ; ch++ ) {
        	System.out.println((char) ch + " - " + ch);
        }
    }
}
