
public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Vermelho");
		Car c = new Car("Verde", 2);
		
		v.sound();
		c.sound();
		
		Car c2 = new Car("Azul", 5);
		Car v2 = c2;
		
		v2.sound();
		
		System.out.println(c2.getNumberOfPassengers());
	}
}
