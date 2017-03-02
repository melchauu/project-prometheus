package prometheus;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UtilBreakdownTest {

	@Test
	public void testConstructorWithUsageAndRatePer() {
		UtilBreakdown util = new UtilBreakdown(UtilType.HYDRO, 1000.20, 0.10, "KWH");
		assertEquals( Double.valueOf(1000.20 * 0.10) ,util.getAmountDuePerType());
	}
	
	@Test 
	public void testSetUsageUpdateAmount(){
		UtilBreakdown util = new UtilBreakdown(UtilType.HYDRO, 1000.20, 0.10, "KWH");
		assertEquals( Double.valueOf(1000.20 * 0.10) ,util.getAmountDuePerType());
		util.setUsage(100.30);
		assertEquals( Double.valueOf(100.30 * 0.10) ,util.getAmountDuePerType());
	}
	
	@Test
	public void testSetRateUpdateAmount(){
		UtilBreakdown util = new UtilBreakdown(UtilType.HYDRO, 1000.20, 0.10, "KWH");
		assertEquals( Double.valueOf(1000.20 * 0.10) ,util.getAmountDuePerType());
		util.setRatePer(.3);
		assertEquals( Double.valueOf(1000.20 * 0.3) ,util.getAmountDuePerType());
	}

}
