package microsim.statistics.regression;

import java.util.LinkedList;
import java.util.List;

class AgentCollection {

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

	public class OurAgent {
	
		public long id = ++agentId;
		public int age = 1;	
		
		public long getId() {
			return id;
		}
	
		public int getAge() {
			return age;
		}
	}
	
	
}
