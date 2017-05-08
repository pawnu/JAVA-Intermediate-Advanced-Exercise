package Intermediate;

public class RunGarage {

	public static void main(String[] args) {
		Car newCar = new Car("122", "car", "me");
		Truck tr = new Truck("122", "truck", "other");
		Truck tr2 = new Truck("123", "truck", "other");
		Truck tr3 = new Truck("124", "truck", "other");
		Garage g = new Garage();
		g.add(newCar);
		g.add(tr);
		g.add(tr2);
		g.add(tr3);		
		g.remove("122", "truck");
		g.remove("122", "car");
		g.fix(newCar);
		g.createBill();
		g.empty();
		g.createBill();
		
	}

}
