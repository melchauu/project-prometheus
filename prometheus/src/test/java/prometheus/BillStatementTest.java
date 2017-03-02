package prometheus;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;

public class BillStatementTest {

	@Test
	public void testAddBillService() {

		BillStatement testStatement = Mockito.mock(BillStatement.class, Mockito.CALLS_REAL_METHODS);
		BillService testService = new BillService();
		Set<BillService> testSet = new HashSet<BillService>();
		testStatement.setServices(testSet);
		testStatement.addService(testService);
		testSet = testStatement.getServices();
		assertTrue(testSet.contains(testService));

	}

}
