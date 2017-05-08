package Intermediate;

import java.util.ArrayList;

public class Garage {
	Car myCar = new Car("111", "car", "me");
	MotorCycle mc = new MotorCycle("112", "bike", "other");
	Truck tr = new Truck("113","truck", "other");
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public Garage(){
		vehicles.add(myCar);
		vehicles.add(mc);
		vehicles.add(tr);
	}
	public void add(Vehicle v){
		vehicles.add(v);
	}
	
	public void remove(String id, String typeofvehicle){
		Vehicle vehicletoremove=null;
		for(Vehicle v: vehicles){
			if(v.ID.equals(id) && (v.type.equals(typeofvehicle))){
				vehicletoremove=v;
			}
		}
		this.vehicles.remove(vehicletoremove);
	}
	public void fix(Vehicle v){
		v.calculateBill();
	}
	public void empty(){
		vehicles = new ArrayList<Vehicle>();
		
	}
	public void createBill(){
		for(Vehicle v: vehicles){
			v.calculateBill();
		}
	}
}
