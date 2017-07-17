
public class LifeInsurancePolicy extends InsurancePolicy{
	private String name;
	private int age;
	private double termLife;
	private double commission;
	
	public LifeInsurancePolicy(String name, int age, double termLife){
		this.name = name;
		this.age = age;
		this.termLife = termLife;
		this.commission = termLife*.2;
	}
	
	@Override
	public double getCommission() {
		return this.commission;
	}
	
	@Override
	public void printSales() {
		System.out.println(name + "'s life insurance policy covers a "+ age + " person for:");
		System.out.println("$" + termLife + " term life insurance");
		System.out.println("for a total commission of $" + commission);
	}
	
	
}
