
import java.util.List;
import java.util.Scanner;


public class car {

	
	public static void main(String[] args) {
		CarBillCalculate carBillCalculate = new CarBillCalculate();
		Scanner in = new Scanner(System.in);
		System.out.println("Car Rental Billing System");
		System.out.print("Enter Customer Name:");
		String name= in.nextLine();
		System.out.println("");
		System.out.println("Enter the Car type:/n Press 1 to choose Economy Car /n Press 2 to choose Executive Car /n Press 3 to choose SUV Car");
		int type= in.nextInt();
		System.out.println("");
		CarDetail carDetail = new CarDetail() ;
		carDetail.carValueDetail();
		carDetail.carChoose(type);
		
		List<Double> calcValues = carBillCalculate.getAllValues();
		System.out.flush();
		System.out.println("Car Rental Bill");
		System.out.println("");
		System.out.println("Car Type is:"+ carDetail.getType());
		in.close();
		
		

	}

}
 
