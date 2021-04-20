class employee_wage_computation 
{
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	
	public static int computeEmpWage(){
		int empHrs=0;
		int totalHrs=0;
		int totalWorkingDays=0;
		
		while (totalHrs <= MAX_HRS_IN_MONTH
			&& totalWorkingDays <NUM_OF_WORKING_DAYS) 
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
		int totalEmpWage = (totalHrs * EMP_RATE_PER_HR);
		System.out.println("Total Employee wage : "+totalEmpWage);
		return totalEmpWage;
		}
	public static void main(String[] args) 
	{
		computeEmpWage();
}
}