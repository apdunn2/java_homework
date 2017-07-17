
public class AutoInsurancePolicy extends InsurancePolicy{
	private String name;
	private String make;
	private String model;
	private double liability;
	private double collision;
	private double commission;
	
	public AutoInsurancePolicy(String name, String make, String model, double liability, double collision){
		this.name = name;
		this.make = make;
		this.model = model;
		this.collision = collision;
		this.liability = liability;
		this.commission = ((liability + collision)*.3);
	}
	
	public double getCommission(){
		return commission;
	}
	
	public void printSales(){
		System.out.println(name + "'s insurance policy covers a " + make + " " + model + " for:");
		System.out.println("$" + liability + " liability");
		System.out.println("$" + collision + " collision");
		System.out.println("for a total commission of $" + commission);
	}
	
	
	
}
