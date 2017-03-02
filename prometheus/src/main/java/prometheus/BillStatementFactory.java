package prometheus;

public class BillStatementFactory {

	public static BillStatement createBillStatement(String type){
		if (type.equals("rent"))
			return new RentBill();
		else if (type.equals("telecom"))
			return new TeleComBill();
		else if (type.equals("hydro"))
			return new HydroBill();
		else if (type.equals("insurance"))
			return new InsuranceBill();
		
		return null;
	}
	
}

