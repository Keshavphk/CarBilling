import java.util.HashMap;
import java.util.Map;

public class Util {
	
	
	protected String BASIC_RENTAL_FEE = "Basic Rental Fee" ;
	protected String BASIC_DISCOUNT ="Basic Discount"  ;
	protected String CORPORATE_DISCOUNT ="Corporate Discount"  ;
	protected String SERVICE_TAX = "Service Tax"  ;
	protected String EXCESS_KM_RATE ="Excess Km Limit"  ;
	protected String EXCESS_HOUR_RATE ="Excess Hour Rate"  ;
	protected String TIME_LIMIT ="Time Limit"  ;
	protected String KM_LIMIT ="Km Limit"  ;

	Map<String,Double> basicValueMap = new HashMap<>() ;
	
	public void setMapValue() {
		basicValueMap.put(BASIC_RENTAL_FEE, 750.0) ;
		basicValueMap.put(BASIC_DISCOUNT, 100.0);
		basicValueMap.put(CORPORATE_DISCOUNT, 0.0) ;
		basicValueMap.put(SERVICE_TAX, 0.06) ;
		basicValueMap.put(EXCESS_KM_RATE, 12.0) ;
		basicValueMap.put(EXCESS_HOUR_RATE, 125.0) ;
		basicValueMap.put(TIME_LIMIT, 8.0);
		basicValueMap.put(KM_LIMIT, 50.0) ;
		
	
		
	}
	
	public Map<String,Double> getEconomyValues() {
		setMapValue();
		return basicValueMap ;
	}

	public Map<String,Double>getExecutiveValues() {
		setMapValue() ;
		double exeRentalFare =  basicValueMap.get(BASIC_RENTAL_FEE) ;
		double exeBasicDiscount = basicValueMap.get(BASIC_DISCOUNT);
		double exeCorporateDiscount = basicValueMap.get(CORPORATE_DISCOUNT);
		double exeServiceTax = basicValueMap.get(SERVICE_TAX);
		double exeKMLimit = basicValueMap.get(KM_LIMIT);
		double exeExcessKMRate = basicValueMap.get(EXCESS_KM_RATE);
		double exeExcessHourRate = basicValueMap.get(EXCESS_HOUR_RATE);
		basicValueMap.replace(BASIC_RENTAL_FEE, exeRentalFare*1.5) ;
		basicValueMap.replace(BASIC_DISCOUNT, exeBasicDiscount*2) ;
		basicValueMap.replace(CORPORATE_DISCOUNT, exeCorporateDiscount+(exeRentalFare*1.5*0.1)) ;
		basicValueMap.replace(SERVICE_TAX, exeServiceTax) ;
		basicValueMap.replace(KM_LIMIT, exeKMLimit*2) ;
		basicValueMap.replace(EXCESS_KM_RATE, exeExcessKMRate+(exeExcessKMRate*0.5)) ;
		basicValueMap.replace(EXCESS_HOUR_RATE, exeExcessHourRate+(exeExcessHourRate*0.2)) ;
		return basicValueMap ;
		
	}
	
	public Map<String,Double>getSUVValues() {
		setMapValue();
		double suvRentalFare =  basicValueMap.get(BASIC_RENTAL_FEE) ;
		double suvBasicDiscount = basicValueMap.get(BASIC_DISCOUNT);
		double suvCorporateDiscount = basicValueMap.get(CORPORATE_DISCOUNT);
		double suvServiceTax = basicValueMap.get(SERVICE_TAX);
		double suvKMLimit = basicValueMap.get(KM_LIMIT);
		double suvExcessKMRate = basicValueMap.get(EXCESS_KM_RATE);
		double suvExcessHourRate = basicValueMap.get(EXCESS_HOUR_RATE);
		basicValueMap.replace(BASIC_RENTAL_FEE, suvRentalFare*2) ;
		basicValueMap.replace(BASIC_DISCOUNT, suvBasicDiscount*2) ;
		basicValueMap.replace(CORPORATE_DISCOUNT, suvCorporateDiscount+(suvRentalFare*2*0.15)) ;
		basicValueMap.replace(SERVICE_TAX, suvServiceTax) ;
		basicValueMap.replace(KM_LIMIT, suvKMLimit*3) ;
		basicValueMap.replace(EXCESS_KM_RATE, suvExcessKMRate+(suvExcessKMRate*0.75)) ;
		basicValueMap.replace(EXCESS_HOUR_RATE, suvExcessHourRate+(suvExcessHourRate*0.5)) ;
		return basicValueMap ;
		
	}
	


}
