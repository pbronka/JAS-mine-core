package microsim.alignment.outcome;

import org.testng.annotations.Test;

import microsim.data.MultiKeyCoefficientMap;
import microsim.data.excel.ExcelAssistant;
import microsim.engine.SimulationEngine;
import microsim.statistics.regression.AgentCollection;
import microsim.statistics.regression.AgentCollection.OurAgent;
import microsim.statistics.regression.LinearRegression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ResamplingAlignmentDeterminismTest {

	LinearRegression linReg;
	AgentCollection agents;
	int collectionLength = 10;
	
	  @Test
	  public void ResamplingTest() {
		  Predicate filter = null;
		  new ResamplingAlignment<OurAgent>().align(agents.getAgentList(), filter, new AlignmentOutcomeClosure<OurAgent>() {

				@Override
				public boolean getOutcome(OurAgent agent) {							
					if(linReg.getScore(agent) > 18) {
						return true;
					} 
					else 
						return false;
				}

				@Override
				public void resample(OurAgent agent) {
					++(agent.age);
				}
			}, 0.5, 100);
	  }

	
	  @BeforeClass
	  public void beforeClass() {
		  
		  MultiKeyCoefficientMap regCoeffs = ExcelAssistant.loadCoefficientMap("test/microsim/statistics/regression/regression.xls", "Sheet1", 1, 1);
		  linReg = new LinearRegression(regCoeffs);
		  agents = new AgentCollection(collectionLength);
	  }
}