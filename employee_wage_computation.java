
class employee_wage_computation 
{
	public static void main(String[] args) 
	{
		int is_Full_Time=2;
		int is_Part_Time=1;
		int fullTimeHr=8;
		int partTimeHr=4;
		int empWage_perHr=20;
		int salary;
		int empCheck=(int)Math.floor(Math.random()*10)%3;

		if(empCheck==is_Full_Time)
		{
			System.out.println("Employee is Present for Full Time ");
			salary=(fullTimeHr*empWage_perHr);
		}
		else if(empCheck==is_Part_Time)
		{
			System.out.println("Employee is Present for Part Time");
			salary=(partTimeHr*empWage_perHr);
		}
		else
		{
			System.out.println("Employee is Absent ");
			salary=0;
		}
		System.out.println(" Salary : " + salary);
	}
}
