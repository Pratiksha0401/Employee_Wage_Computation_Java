
class employee_wage_computation 
{
	public static void main(String[] args) 
	{
		int is_Full_Time=2;
		int is_Part_Time=1;
		int fullTimeHr=8;
		int partTimeHr=4;
		int empWage_perHr=20;
		int dayPerMonth=20;
		int salary,empHr=0;
		int workDays=0;
		
		for(int i=1;i<=30;i++)
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck)
				{
				case 2:
					empHr=empHr+fullTimeHr;
					workDays++;
					break;
				case 1:
					empHr=empHr+partTimeHr;
					workDays++;
					break;
				default:
					salary=0;
					break;
				}
		}

<<<<<<< HEAD
		if(empHr>=100 || workDays>=20)
		{
			System.out.println(" Total working hours : " + empHr);
			salary=empWage_perHr*empHr;
			System.out.println(" Salary : " + salary);
		}
		else
		{
			salary=0;
			System.out.println(" Salary : " + salary);
=======
		switch(empCheck)
			{
			case 2:
				System.out.println("Employee is Present for Full Time ");
				salary=(fullTimeHr*empWage_perHr*dayPerMonth);
				break;
			case 1:
				System.out.println("Employee is Present for Part Time");
				salary=(partTimeHr*empWage_perHr*dayPerMonth);
				break;
			default:
				System.out.println("Employee is Absent ");
				salary=0;
				break;
>>>>>>> e3fdc8dcda1a471b4a2e4b01885cbca4b7476411
		}
	}
}
