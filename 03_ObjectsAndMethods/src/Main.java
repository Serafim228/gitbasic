public class Main {

    public static void main(String[] args) {
    	Basket b1 = new Basket ();
    	b1.add("kola", 100, 10);
    	
    	b1.add("pepsi", 100, 10);
    	b1.print(null);
    	
    	System.out.println(b1.getTotalPrice());
    	System.out.println(b1.getAveragePrice());
    	System.out.println(b1.getAverageBasketPrice());
    	System.out.println(Basket.allCount);
    	System.out.println(Basket.allPrice);
    	
    	Basket b11 = new Basket ();
    	b11.add("hui", 10, 10);
    	
    	b11.add("228", 10, 10);
    	b11.print(null);
    	
    	System.out.println(b11.getTotalPrice());
    	System.out.println(b11.getAveragePrice());
    	System.out.println(b11.getAverageBasketPrice());
    	System.out.println(Basket.allCount);
    	System.out.println(Basket.allPrice);
    }
}
