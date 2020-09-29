public class empWageProblem {

	public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Calculation");

	//check employee is present or not
	double num1 = Math.floor(Math.random()*10)%2;

		if(num1 == 0) {
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");

	//Calculate full time daily wage of employee
	int WagePerHour=20;
	int FullDayHour=8;
	int WagePerDay=WagePerHour*FullDayHour;
	System.out.println("Wage Per day : "+WagePerDay);

	}
}
