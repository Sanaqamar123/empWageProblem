import java.util.*;

class empWage {

	public static final int PartTime=1;
	public static final int FullTime=2;

}

class empWage1 extends empWage{

	Scanner sc = new Scanner(System.in);

	public int computeEmpWage(int wagePerHour,int workingDays,int maxHoursInMonth) {

		int WorkHours=0, totalHours=0, days=0;

		while(totalHours <= maxHoursInMonth && days < workingDays) {

			days++;
			int choice = (int)Math.floor(Math.random()*10)%3;

			switch(choice) {
			case 1 :
				WorkHours=8;
				break;

			case 2 :
				WorkHours=8;
				break;
			default :
				WorkHours=0;
			}

			totalHours+=WorkHours;
		}

		int totalWage=totalHours*wagePerHour;
		System.out.println("\nEnter company name");
		String name = sc.nextLine();
		System.out.println("\nCompany Name : "+name+"\nTotal employee Wage : "+totalWage+"\n");
		return totalWage;
	}
}

public class empWageProblem extends empWage1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Company's wages you want to calculate  : ");
        int n = sc.nextInt();
        empWageProblem Company[] = new empWageProblem[n];

        for (int i = 0; i < n; i++) {

        	System.out.println("\nEnter wage per day : ");
        	int wage_per_day = sc.nextInt();

        	System.out.println("\nTotal working days : ");
        	int working_days = sc.nextInt();

        	System.out.println("\nMaximum hours in a month");
        	int max_hours_in_month = sc.nextInt();
	        Company[i] = new empWageProblem();
        	Company[i].computeEmpWage(wage_per_day,working_days,max_hours_in_month);

        }
        sc.close();
	}
}
