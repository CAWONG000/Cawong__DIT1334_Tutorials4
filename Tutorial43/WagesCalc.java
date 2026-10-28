package Tutorial43;

import java.util.Scanner;

public class WagesCalc {
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		System.out.print("Worker Name :\t");
		String Work;
		Work = x.nextLine();
	
		//String Work; Work = "cawong";
		
		System.out.print("Enter total working hours per month: \t");
		int hour;
		hour = x.nextInt();
		
		System.out.print("Enter hourly pay rate (RM): \t");
		double rate;
		rate = x.nextDouble();
		
		x.close();
		
		System.out.print("- - - \t Wages Details \t - - - \n Employee Name\t" + Work + "\n");
		
		double pay;
		pay = hour*rate;
		
		int OT;double Paid;double Wages;
		OT=0;Paid=0;Wages=0;
		
		if (hour >= 160)
		{
			OT=hour-160;
			Paid=OT*7.5;
			Wages=(hour*rate+Paid);
			
			//System.out.print(OT +"\t RM"+ Paid + "\t Final = RM" + Wages);
		}
		else if (hour <= 128)
		{
			Wages=((hour*rate)*(1-0.05));
			//System.out.print(Wages);
		}
		else
		{
			Wages=(hour*rate);
			//System.out.print(Wages);
		}
		
		System.out.println("Total Monthly Pay: RM " + Wages);
	}
}
