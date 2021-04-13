
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
		int salary;
		int empCheck=(int)Math.floor(Math.random()*10)%3;

		switch(empCheck)
			{
			case 2:
				System.out.println("Employee is Present for Full Time ");
<<<<<<< HEAD
				salary=(fullTimeHr*empWage_perHr*dayPerMonth);
				break;
			case 1:
				System.out.println("Employee is Present for Part Time");
				salary=(partTimeHr*empWage_perHr*dayPerMonth);
=======
				salary=(fullTimeHr*empWage_perHr);
				break;
			case 1:
				System.out.println("Employee is Present for Part Time");
				salary=(partTimeHr*empWage_perHr);
>>>>>>> 5369d397cfee47ebbc8331f7f299eec7b53b4f0d
				break;
			default:
				System.out.println("Employee is Absent ");
				salary=0;
				break;
		}
		System.out.println(" Salary : " + salary);
	}
}
