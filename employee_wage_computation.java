class employee_wage_computation 
{
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	
	public static int computeEmpWage( String name, int empRatePerHrs, int numOfWorkingDays, 
		int maxHrsInMonth){
		int empHrs=0;
		int totalHrs=0;
		int totalWorkingDays=0;
		
		while (totalHrs <= maxHrsInMonth
			&& totalWorkingDays < numOfWorkingDays) 
			{
			totalWorkingDays++;
			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
					break;
			}
			totalHrs += empHrs;
			System.out.println("Day# : "+totalWorkingDays+ " Emp hrs : " +  empHrs);
			
		}
		int totalEmpWage = (totalHrs * empRatePerHrs);
		System.out.println("Total Employee wage for company : " + name+ " is "+ totalEmpWage);
		return totalEmpWage;
		}
	public static void main(String[] args) 
	{
		computeEmpWage("Dmart", 20, 10, 100);
		computeEmpWage("Big Bazar", 20, 5, 100);
}
}