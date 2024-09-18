package Encapsulation;
class car{
	private String company_name;
	private String model_name;
	private int year;
	private double mileage;
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public String getModel_name() {
		return model_name;
	}
	
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public double getmileage() {
	    return mileage;
	  }
}

public class CarEncapsulation {

	public static void main(String[] args) {
		
		car car1 = new car();
		car1.setCompany_name("Mahindra Scorpio");
		car1.setModel_name("Scorpio-N");
		car1.setYear(2024);
		
		String Company_name = car1.getCompany_name();
		double mileage = car1.getmileage();
		String Model_name = car1.getModel_name();
		int year =  car1.getYear();
		
		System.out.println("Company Name: " + Company_name);
        System.out.println("Model Name: " + Model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
	}

}
