
class employee_wage_computation 
{
	public static void main(String[] args) 
	{
		int is_Full_Time=1;
		int empHr=8;
		int empWage_perHr=20;
		int salary;
		int empCheck=(int)Math.floor(Math.random()*10)%2;

		if(empCheck==is_Full_Time)
		{
			System.out.println("Employee is Present ");
			salary=(empHr*empWage_perHr);
		}
		else
		{
			System.out.println("Employee is Absent ");
			salary=0;
		}
		System.out.println(" Salary : " + salary);
	}
}
