package at.ac.tuwien.ec.model.infrastructure.planning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.ac.tuwien.ec.model.infrastructure.MobileCloudInfrastructure;
import at.ac.tuwien.ec.model.infrastructure.planning.edge.EdgeAllCellPlanner;
import at.ac.tuwien.ec.sleipnir.SimulationSetup;

class EdgeAllCellPlannerTest {

	@Test
	void testSetupEdgeNodesAllFine() {
		MobileCloudInfrastructure inf = new MobileCloudInfrastructure();
		EdgeAllCellPlanner planner = new EdgeAllCellPlanner();
		Assert.assertNotNull(inf);
		Assert.assertNotNull(planner);
		planner.setupEdgeNodes(inf);
		Assert.assertFalse(inf.getEdgeNodes().isEmpty());
		Assert.assertTrue(inf.getEdgeNodes().size() == SimulationSetup.MAP_M * SimulationSetup.MAP_N);
	}

}
