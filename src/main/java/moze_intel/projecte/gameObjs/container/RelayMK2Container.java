package moze_intel.projecte.gameObjs.container;

import moze_intel.projecte.gameObjs.block_entities.RelayMK2BlockEntity;
import moze_intel.projecte.gameObjs.container.slots.SlotPredicates;
import moze_intel.projecte.gameObjs.container.slots.ValidatedSlot;
import moze_intel.projecte.gameObjs.registries.PEContainerTypes;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.neoforge.items.IItemHandler;

public class RelayMK2Container extends RelayMK1Container {

	public RelayMK2Container(int windowId, Inventory playerInv, RelayMK2BlockEntity relay) {
		super(PEContainerTypes.RELAY_MK2_CONTAINER, windowId, playerInv, relay);
	}

	@Override
	void initSlots() {
		IItemHandler input = relay.getInput();
		IItemHandler output = relay.getOutput();
		//Klein star slot
		this.addSlot(new ValidatedSlot(output, 0, 144, 44, SlotPredicates.EMC_HOLDER));
		//Burn slot
		this.addSlot(new ValidatedSlot(input, 0, 84, 44, SlotPredicates.RELAY_INV));
		int counter = 1;
		//Inventory buffer
		for (int i = 2; i >= 0; i--) {
			for (int j = 3; j >= 0; j--) {
				this.addSlot(new ValidatedSlot(input, counter++, 26 + i * 18, 18 + j * 18, SlotPredicates.RELAY_INV));
			}
		}
		addPlayerInventory(16, 101);
	}
}