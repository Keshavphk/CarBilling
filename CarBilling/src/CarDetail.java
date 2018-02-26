import java.util.Scanner;

public class CarDetail {
	int a;
	private double distance, time;
	private String type;
	Scanner in = new Scanner(System.in);

	CarBillCalculate carBillCal = new CarBillCalculate();

	public void carValueDetail() {
		System.out.println("enter distance travelled");
		distance = in.nextDouble();
		System.out.println("enter the total duration in HOURS");
		time = in.nextDouble();
	}

	public void carChoose(int typeNum) {
		if (typeNum == 1) {
			type = "ECO";
			System.out.println("Car Type : " + type);
			carBillCal.ecoTypeCal(distance, time);
		}

		else if (typeNum == 2) {
			type = "EXE";
			System.out.println("Car Type : " + type);
			carBillCal.exeTypeCal(distance, time);
		} else if (typeNum == 3) {
			type = "SUV";
			System.out.println("Car Type : " + type);
			carBillCal.suvTypeCal(distance, time);
		} else {
			System.out.println("Entered Value is incorect, Please reenter correct Value");
		    this.carChoose(in.nextInt());
		}
	}
	
	public String getType() {
		return type;
	}
	
	
}
