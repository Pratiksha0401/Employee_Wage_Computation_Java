import java.util.*;

public class employee_wage_computation1 implements EmpComputeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private Map<String,Company> map=new HashMap<>();

	@Override
	public int getWagesByCompanyName(String name){
		int totalWage = 0;
		for(int i = 0; i< map.size(); i++){
			Company  company = map.get(i);
			if(name.equals(company.getName())){
				totalWage = company.getTotalEmpWage();
				break;
			}
		}

		return totalWage;
	}
	@Override
	public void addCompany(final Company company, String name){
		map.put(name,company);
	}

	@Override
	public void print(){
		for(Company  company : map.values()){
		System.out.println(company);
		}
	}
	@Override
	public int calculateWage(String company){
		return map.get(company).totalEmpWage;
	}

	private void calculate(final Company company) {
		int totalEmpHours = 0;
		int empHours = 0;
		int totalWorkingDays = 0;

		while (totalEmpHours <= company.getMaxHrsInMonth() 
			&& totalWorkingDays <= company.getNoOfWorkingDays()) {

			totalWorkingDays++;

			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
				case IS_FULL_TIME:
					empHours = 8;
					//System.out.println("Employee is present full-time on day " + totalWorkingDays);
				break;
				case IS_PART_TIME:
					empHours = 4;
					//System.out.println("Employee is present part-time on day " + totalWorkingDays);
				break;
				default:
					empHours = 0;
					//System.out.println("Employee is abscent on day " + totalWorkingDays);
			}
			totalEmpHours += empHours;
			//System.out.println("Day# : "+totalWorkingDays+ " Emp hrs : " +  empHours);
			
		}
		int totalEmpWage = totalEmpHours * company.getEmpRatePerHrs();
		company.setTotalEmpWage(totalEmpWage);
	}

	public static void main(String[] args) {
		// Directly calling function without creating obj 'cause its a static one.
		employee_wage_computation1 ebi = new employee_wage_computation1();
		Company company1 = new Company("Dmart", 20, 10, 100);
		ebi.addCompany(company1,"Dmart");
		
		ebi.calculateWages("Dmart");
		ebi.print();
		int totalWages = ebi.getWagesByCompanyName("Dmart");
		System.out.println("Wage : " +totalWages );
	}
}

interface EmpComputeWage {
	void addCompany(Company company,String name);
	int calculateWage(String name);
	void print();
	int getWagesByCompanyName(String name);

}

class Company {

	private String name;
	private int empRatePerHrs;
	private int noOfWorkingDays;
	private int maxHrsInMonth;
	protected int totalEmpWage;

	public Company(final String name, final int empRatePerHrs, final int noOfWorkingDays, 
		final int maxHrsInMonth){
		this.name = name;
		this.empRatePerHrs = empRatePerHrs;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public String getName(){
		return name;
	}

	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}

	public int getNoOfWorkingDays(){
		return noOfWorkingDays;
	}

	public int getEmpRatePerHrs(){
		return empRatePerHrs;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage(){
		return this.totalEmpWage;
	}

	@Override
	public String toString(){
		return "Total Employee wages for comapny "+this.name+ " is : "+this.totalEmpWage;
	}
}