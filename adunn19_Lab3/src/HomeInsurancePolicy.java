
public class HomeInsurancePolicy extends InsurancePolicy{
	private String name;
	private int sqFootage;
	private double dwelling;
	private double contents;
	private double liability;
	private double commission;
	
	public HomeInsurancePolicy(String name, int sqFootage, double dwelling, double contents, double liability){
		this.name = name;
		this.sqFootage = sqFootage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
		this.commission = ((liability*.3)+((dwelling+contents)*.2));
	}
	
	@Override
	public double getCommission() {
		return this.commission;
	}
	
	@Override 
	public void printSales(){
		System.out.println(name + "'s insurance policy covers a " + sqFootage + " sq. ft. home for:");
		System.out.println("$" + dwelling + " dwelling coverage");
		System.out.println("$" + contents + " contents coverage");
		System.out.println("$" + liability + " liability coverage");
		System.out.println("for a total commission of $" + commission);
	}
}
