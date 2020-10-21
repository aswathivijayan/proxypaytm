package CGIJenkinsBatch.CalculatorApi;


import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestCalulatorAPI {
	CalculatorAPI C;
	int res;
	@BeforeClass
	public void StartTest() {
		C=new CalculatorAPI();
	}
	@BeforeTest
	public void Intres() {
		res=0;
	}
	
	@Test(priority=1)
	public void TestAdditionWithPositiveValues() {
		res=C.Addition(20,30);
		Assert.assertEquals(res,50,"Addition function not working with positive numbers");
		
	}
	@Test(priority=2)
	public void TestAdditionWithZeroValues() {
		res=C.Addition(100, 0);
		Assert.assertEquals(res,100,"Addition function not working if one of the argument is 0");
		
	}

}
