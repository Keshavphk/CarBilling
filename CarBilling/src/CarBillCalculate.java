import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarBillCalculate extends Util {
	Util util = new Util();
	List<Double> values = new ArrayList<>();
	private double grossFare, netFare, totalFare, extraKMFare, extraTimeFare, serviceTax;

	public void ecoTypeCal(double distance, double time) {
		Map<String, Double> valueMap = util.getEconomyValues();
		realCalc(distance, time, valueMap);
	}

	public void exeTypeCal(double distance, double time) {
		Map<String, Double> valueMap = util.getExecutiveValues();

		realCalc(distance, time, valueMap);
	}

	public void suvTypeCal(double distance, double time) {
		Map<String, Double> valueMap = util.getSUVValues();
		realCalc(distance, time, valueMap);
	}

	private void realCalc(double distance, double time, Map<String, Double> valueMap) {
		List<Double>calcValues = new ArrayList<>();
		
		if (distance > valueMap.get(KM_LIMIT)) {
			extraKMFare = (distance - valueMap.get(KM_LIMIT)) * valueMap.get(EXCESS_KM_RATE);
			System.out.println("Extra KM fare :: " + extraKMFare);
		}
		if (time > valueMap.get(TIME_LIMIT)) {
			extraTimeFare = (time - valueMap.get(TIME_LIMIT)) * valueMap.get(EXCESS_HOUR_RATE);
		}

		if (extraKMFare > extraTimeFare) {
			totalFare = valueMap.get(BASIC_RENTAL_FEE) + extraKMFare;
		} else
			totalFare = valueMap.get(BASIC_RENTAL_FEE) + extraTimeFare;
		
		serviceTax = totalFare*valueMap.get(SERVICE_TAX);
		grossFare = totalFare-valueMap.get(BASIC_DISCOUNT)-valueMap.get(CORPORATE_DISCOUNT) ;
		netFare = grossFare+serviceTax ;
		
		calcValues.add(valueMap.get(BASIC_RENTAL_FEE));
		calcValues.add(extraKMFare);
		calcValues.add(extraTimeFare) ;
		calcValues.add(valueMap.get(BASIC_DISCOUNT)) ;
		calcValues.add(valueMap.get(CORPORATE_DISCOUNT)) ;
		calcValues.add(serviceTax) ;
		calcValues.add(grossFare) ;
		calcValues.add(netFare);
		this.values = calcValues;
		
			}
	
	public List<Double> getAllValues() {
		return this.values ;
	}
	

	
}
