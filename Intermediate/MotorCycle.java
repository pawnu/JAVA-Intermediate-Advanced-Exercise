package Intermediate;

public class MotorCycle extends Vehicle{
	/**
	 * 
	 * @param ID id
	 * @param type type of vehicle
	 * @param owner owner of vehicle = me or other
	 */
	public MotorCycle(String ID, String type, String owner){
		this.ID=ID;
		this.type=type;
		this.pricetofix=1000;
		this.ownerofvehicle=owner;

	}

	@Override
	public void calculateBill() {
		if(ownerofvehicle.equals("me")){
			pricetofix= pricetofix/2;
		}
		double total = this.pricetofix + 50;
		System.out.println("Bill for " + "ID: " +ID + " Type:"+ type+" is " + total);
	}
	

}
