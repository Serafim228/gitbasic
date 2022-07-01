public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car lada = new Car (new Engine(EngineType.DIESEL, 22 ,22), 
				CarType.CABRIOLET, 323);
		System.out.println("Тип автомобиля: " + lada.getCarType() +
				"\n" + "Масса авто: " +lada.getWeight() + 
				"\n" + "Тип двигателя: " + lada.getEngineType() +
				"\n" + "Объем двигателя: " + Engine.getVoluem() + 
				"\n" + "Мощность двигателя" + Engine.getPower());
	}
	
		
}
