package Encapsulation;


class House{
	private String Address;
	private String NoOfRooms;
	private double area;
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNoOfRooms() {
		return NoOfRooms;
	}
	public void setNoOfRooms(String noOfRooms) {
		NoOfRooms = noOfRooms;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


int calculatePrice(double area){
	double cost_of_1sq_feet = 3333.333; 
	
	int totalCost = (int) (area*cost_of_1sq_feet);
	return totalCost;
}
}

public class HouseExample {
	public static void main(String[] args) {
		House duplexVilla = new House();
		
		duplexVilla.setAddress("No.1, Indira Street, Avadi Ch - 600071");
		duplexVilla.setArea(1237.85);
		duplexVilla.setNoOfRooms("3BHK");
		int finalPrice = duplexVilla.calculatePrice(duplexVilla.getArea());
		
		  System.out.println(duplexVilla.getNoOfRooms() + " Villa located at \"" + duplexVilla.getAddress() + "\" with a total Area of " + duplexVilla.getArea() + " sq.feet costs Rs." + finalPrice);
	}
	

}
