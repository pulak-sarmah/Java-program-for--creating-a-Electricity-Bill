





import java.util.Scanner;

class ConnectionData 
{
	int ConsumerNo;
	String ConsumerName;
	double PrevMonthReading;
	double CurrMonthReading;
	String ConnTyp;
	double Bill;

	void readData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Consumer Number: ");
		ConsumerNo = sc.nextInt();
		System.out.println("\n Enter Consumer Name: ");
		ConsumerName = sc.next();
		System.out.println("\n Enter Previous Month Readings: ");
		PrevMonthReading = sc.nextInt();
		System.out.println("Enter Current Month Readings:");
		CurrMonthReading = sc.nextInt();
		System.out.println("Enter the types of Connection(domestic or commercial)");
		ConnTyp = sc.next();
	}

	double calcBill() 
	{
		int choice;
		if (ConnTyp == "domestic")
			choice = 1;
		else
			choice = 2;
		switch (choice) 
		{
		case 1:
			if (CurrMonthReading >= 0 && CurrMonthReading <= 100)
				Bill = CurrMonthReading * 1;
			else if (CurrMonthReading > 100 && CurrMonthReading <= 200)
				Bill = (100 * 1) + ((CurrMonthReading - 100) * 2.50);
			else if (CurrMonthReading > 200 && CurrMonthReading <= 500)
				Bill = (100 * 1) + (100 * 2.50) + ((CurrMonthReading - 200) * 4);
			else
				Bill = (100 * 1) + (100 * 2.50) + (300 * 4) + ((CurrMonthReading - 500) * 6);
			break;

		case 2:
			if (CurrMonthReading >= 0 && CurrMonthReading <= 100)
				Bill = CurrMonthReading * 2;
			else if (CurrMonthReading > 100 && CurrMonthReading <= 200)
				Bill = (100 * 1) + ((CurrMonthReading - 100) * 4.50);
			else if (CurrMonthReading > 200 && CurrMonthReading <= 500)
				Bill = (100 * 1) + (100 * 2.50) + ((CurrMonthReading - 200) * 6);
			else
				Bill = (100 * 1) + (100 * 2.50) + (300 * 4) + ((CurrMonthReading - 500) * 7);
			break;
		}
		return Bill;
	}

	void display() 
	{
		System.out.println("**********************************");
		System.out.println("ELECTRICITY BILL");
		System.out.println("**********************************");
		System.out.println("Consumer Number: " + ConsumerNo);
		System.out.println("Consumer Name: " + ConsumerName);
		System.out.println("Consumer Previous month Units: " + PrevMonthReading);
		System.out.println("Consumer Current month Units: " + CurrMonthReading);
		System.out.println("Type of Connection: " + ConnTyp);
		System.out.println("**********************************");
		System.out.println("Total Amount(Rs.): " + Bill);
	}
}
public class CalcEBill
	{
		public static void main(String[] args)
			{
				ConnectionData b=new ConnectionData();
				b.readData();
				b.calcBill();
				b.display();
			}
	}