package microsim.statistics.regression;

import org.testng.annotations.Test;

import microsim.data.MultiKeyCoefficientMap;
import microsim.data.excel.ExcelAssistant;
import microsim.engine.SimulationEngine;
import microsim.statistics.regression.AgentCollection.OurAgent;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LinearRegressionDeterminismTest {

	LinearRegression linReg;
	AgentCollection agents;
	int collectionLength = 10;
	
	  @Test
	  public void LinearRegressionTest() {
		  for(int i = 0; i < collectionLength; i++) {
			  OurAgent agent = agents.getAgentList().get(i);
			  System.out.println("Agent id " + agent.getId() + ", age " + agent.getAge() + ", score " + linReg.getScore(agent));
		  }
		  
	  }

	
	  @BeforeClass
	  public void beforeClass() {
		  
		  MultiKeyCoefficientMap regCoeffs = ExcelAssistant.loadCoefficientMap("test/microsim/statistics/regression/regression.xls", "Sheet1", 1, 1);
		  linReg = new LinearRegression(regCoeffs);
		  agents = new AgentCollection(collectionLength);
	  }

	
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }
//
//
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
	
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }

}
