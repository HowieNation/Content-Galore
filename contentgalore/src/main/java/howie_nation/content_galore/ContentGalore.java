package howie_nation.content_galore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContentGalore implements ModInitializer {

	public static final String MOD_ID = "content_galore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");

	}
}