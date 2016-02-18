package microsim.statistics.regression;

import java.util.LinkedList;
import java.util.List;

import microsim.event.EventListener;
import microsim.statistics.IDoubleSource;

public class AgentCollection {

	private static long agentId = 0;
	List<OurAgent> agentList = new LinkedList<OurAgent>();

	public AgentCollection(int collectionLength) {
		for(int i = 0; i < collectionLength; i++) {
			OurAgent newAgent = new OurAgent();
			agentList.add(newAgent);
		}
		
	}
	
	public List<OurAgent> getAgentList() {
		return agentList;
	}
	
	public enum Regressors {
		age,
		id,
		field1,
		field2,
		field3,
		field4,
		field5,
		field6,
		field7,
		field8,
		field9,
		field10,
	}

	public class OurAgent implements IDoubleSource, EventListener {
	
		public long id = ++agentId;
		public int age = 1;	
		public double field1 = 0.5;
		public double getField1() {
			return field1;
		}

		public void setField1(double field1) {
			this.field1 = field1;
		}

		public double getField2() {
			return field2;
		}

		public void setField2(double field2) {
			this.field2 = field2;
		}

		public double getField3() {
			return field3;
		}

		public void setField3(double field3) {
			this.field3 = field3;
		}

		public double getField4() {
			return field4;
		}

		public void setField4(double field4) {
			this.field4 = field4;
		}

		public double getField5() {
			return field5;
		}

		public void setField5(double field5) {
			this.field5 = field5;
		}

		public double getField6() {
			return field6;
		}

		public void setField6(double field6) {
			this.field6 = field6;
		}

		public double getField7() {
			return field7;
		}

		public void setField7(double field7) {
			this.field7 = field7;
		}

		public double getField8() {
			return field8;
		}

		public void setField8(double field8) {
			this.field8 = field8;
		}

		public double getField9() {
			return field9;
		}

		public void setField9(double field9) {
			this.field9 = field9;
		}

		public double getField10() {
			return field10;
		}

		public void setField10(double field10) {
			this.field10 = field10;
		}

		public double field2 = 0.5;
		public double field3 = 0.5;
		public double field4 = 0.5;
		public double field5 = 0.5;
		public double field6 = 0.5;
		public double field7 = 0.5;
		public double field8 = 0.5;
		public double field9 = 0.5;
		public double field10 = 0.5;
		
		public long getId() {
			return id;
		}
	
		public int getAge() {
			return age;
		}

		@Override
		public double getDoubleValue(Enum<?> variableID) {

			switch ((Regressors) variableID) {
				case age:
					return age;
				case id:
					return id;
				case field1:
					return field1;
				case field2:
					return field2;
				case field3:
					return field3;
				case field4:
					return field4;
				case field5:
					return field5;
				case field6:
					return field6;
				case field7:
					return field7;
				case field8:
					return field8;
				case field9:
					return field9;
				case field10:
					return field10;
				default:
					throw new IllegalArgumentException("Unsupported regressor " + variableID.name() + " in OurAgent#getDoubleValue");

			}
			
		}

		@Override
		public void onEvent(Enum<?> type) {
			// TODO Auto-generated method stub
			
		}
	}
	
}	

