package moze_intel.projecte.api.imc;

/**
 * This class declares the IMC methods accepted by ProjectE and their argument types
 */
public class IMCMethods {

	/**
	 * This method registers a World Transmutation with the Philosopher's Stone.
	 * <p>
	 * The Object sent must be an instance of {@link WorldTransmutationEntry}, or else the message is ignored.
	 */
	public static final String REGISTER_WORLD_TRANSMUTATION = "register_world_transmutation";

	/**
	 * Registers a custom EMC value.
	 * <p>
	 * The Object sent must be an instance of {@link CustomEMCRegistration}, or else the message is ignored.
	 */
	public static final String REGISTER_CUSTOM_EMC = "register_custom_emc";
}