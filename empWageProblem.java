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

	}
}
