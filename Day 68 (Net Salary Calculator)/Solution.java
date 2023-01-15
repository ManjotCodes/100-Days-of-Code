import java.util.Scanner;

import javax.xml.crypto.Data;

class salary{
	double  basic,TA ,DA,HRA;
	salary(double basic,double  TA,double DA,double HRA ) {
		this.TA =TA;
		this.DA =DA;
		this.HRA =HRA;
	}
	void getSalary()
	{
		System.out.println("Enter the Salary \nBasic \nTA \nDA \nHRA");
		Scanner scanner=new Scanner(System.in);
		basic=scanner.nextDouble();
		TA=scanner.nextDouble();
		DA=scanner.nextDouble();
		HRA=scanner.nextDouble();
	}
	void calSalary(){
		DA=basic*0.8;
		HRA=basic*1.5;
		float gross=(float) (basic+TA+DA+HRA);
		System.out.println("Gross Salray = " +gross );
	}
}
public class Solution{
	public static void main(String[] args) {
		salary emp =new salary(0,0, 0, 0);
		emp.getSalary();
		emp.calSalary();
	}
}
