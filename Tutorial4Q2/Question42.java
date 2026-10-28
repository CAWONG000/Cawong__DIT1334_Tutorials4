package Tutorial4Q2;

import java.util.Scanner;

public class Question42 {
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		
		System.out.print("**** WELCOME TO MIKALAZYA STORE ****\r\n"
				+ "-------------------------------------\r\n"
				+ "*************************************\r\n"
				+ "CODE TYPE\r\n"
				+ "1 Baju Kurung Tradisional\r\n"
				+ "2 Baju Kurung Moden\r\n"
				+ "3 Kebaya\r\n"
				+ "4 Jubah\r\n"
				+ "*************************************");
		
		System.out.print("\nPlease enter the code - ");
		int code;
		code = x.nextInt();
		
		
		double Shirt;
		String Baju;
		
		Baju = "";
		Shirt = 4.04;
				
		switch (code) 
		{
			case 1:
				Shirt = 210.90;
				Baju = "Baju Kurung Tradisional";
				break;
			case 2:
				Shirt = 249.90;
				Baju = "Baju Kurung Moden";
				break;
			case 3:
				Shirt = 310.90;
				Baju = "Kebaya";
				break;
			case 4:
				Shirt = 250.90;
				Baju = "Jubah";
			default:
		}
		
		System.out.println("Product = " + Baju);
		
		System.out.print("Please enter the amount of " + Baju + " - ");
		
		int qty;
		qty = x.nextInt();
		
		x.close();
		
		double amount;
		amount = ( Shirt *qty);
		System.out.print("Total Price :\t RM " + amount + "\n");
		
		double Discount;
		if (amount >= 500) 
		{
			Discount = ( amount * 10 / 100);
		}
		else
		{
			Discount = 0;
		}
		System.out.print("Discount :\t RM " + Discount + "\n");
		
		double Disamount;
		Disamount = (amount - Discount);
		System.out.printf("Price After Discount :\t RM %.2f%n", Disamount);
		
		System.out.println("Thank you and please come again.\r\n"
				+ "*************************************\r\n"
				+ "Prepared by: School of Information Technology");
		
	}
}
