package prometheus;

import static org.junit.Assert.*;

import org.junit.Test;


public class BillStatementFactoryTest {

	@Test
	public void testCreateBillStatement() {
		BillStatement hydroBill = BillStatementFactory.createBillStatement("hydro");
		assertTrue(hydroBill instanceof HydroBill);
		
		BillStatement rent = BillStatementFactory.createBillStatement("rent");
		assertTrue(rent instanceof RentBill);
		
		BillStatement insuranceBill = BillStatementFactory.createBillStatement("insurance");
		assertTrue(insuranceBill instanceof InsuranceBill);
		
		BillStatement teleComBill = BillStatementFactory.createBillStatement("telecom");
		assertTrue(teleComBill instanceof TeleComBill);
	}

}
