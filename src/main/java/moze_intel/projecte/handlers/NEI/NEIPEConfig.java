package moze_intel.projecte.handlers.NEI;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import moze_intel.projecte.PECore;

public class NEIPEConfig implements IConfigureNEI {

	@Override
	public String getName() {
		return "ProjectE-NEI";
	}

	@Override
	public String getVersion() {
		return PECore.VERSION;
	}

	@Override
	public void loadConfig() {
		API.registerRecipeHandler(new NEIWorldTransmuteHandler());
		API.registerUsageHandler(new NEIWorldTransmuteHandler());
		API.registerRecipeHandler(new NEIPhiloSmeltingHandler());
		API.registerUsageHandler(new NEIPhiloSmeltingHandler());
		API.registerRecipeHandler(new NEIKleinStarHandler());
		API.registerUsageHandler(new NEIKleinStarHandler());
		API.registerRecipeHandler(new NEIAlchBagHandler());
		API.registerUsageHandler(new NEIAlchBagHandler());
	}
	
	
}
