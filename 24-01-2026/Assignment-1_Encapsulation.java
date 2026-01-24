class VehicleRental{
	private String customerName;
	private String vehicleType;
	private String rentalDate;
	private String returnDate;
	private double rentalCost;
	
	//Setter Methods
	public void setCustomerName(String name){
		this.customerName=name;
	}
	public void setVehicleType(String type){
		this.vehicleType=type;
	}
	public void setRentalDate(String RentDate){
		this.rentalDate=RentDate;
	}
	public void setReturnDate(String RetDate){
		this.returnDate=RetDate;
	}
	public void setRentalCost(double cost){
		if(cost<0){
			System.out.println("Error");
			return ;
		}
		this.rentalCost=cost;
	}

	//Getter Methods
	public String getCustomerName(){
		return this.customerName;
	}
	public String getVehicleType(){
		return this.vehicleType;
	}
	public String getRentalDate(){
		return this.rentalDate;
	}
	public String getReturnDate(){
		return this.returnDate;
	}
	public double getRentalCost(){
		return this.rentalCost;
	}

	//display method
	public void RentalInfo(){
		System.out.println("Customer Name: "+customerName);
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Rental Date: "+rentalDate);
		System.out.println("Return Date: "+returnDate);
		System.out.println("Rental Cost: "+rentalCost);
	}

}
class VehicleRentalTest{
	public static void main(String[] args){
		
		VehicleRental v1=new VehicleRental();
		v1.setCustomerName("Eshwar");
		v1.setVehicleType("Bike");
		v1.setRentalDate("January 10");
		v1.setReturnDate("February 10");
		v1.setRentalCost(2000.00);
		v1.RentalInfo();
		System.out.println("\n");

		VehicleRental v2=new VehicleRental();
		v2.setCustomerName("Lalith");
		v2.setVehicleType("Car");
		v2.setRentalDate("March 10");
		v2.setReturnDate("November 10");
		v2.setRentalCost(6090.00);
		v2.RentalInfo();
		System.out.println("\n");

		VehicleRental v3=new VehicleRental();
		v3.setCustomerName("Vishnu");
		v3.setVehicleType("Truck");
		v3.setRentalDate("February 10");
		v3.setReturnDate("September 10");
		v3.setRentalCost(3100.00);
		v3.RentalInfo();
		System.out.println("\n");
	}
}
