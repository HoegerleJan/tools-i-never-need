package net.doulrion.toolsineverneed;

import net.doulrion.toolsineverneed.item.ToolsINeverNeedItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsINeverNeed implements ModInitializer {

	public static final String MOD_ID = "toolsineverneed";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ToolsINeverNeedItems.registerModItems();

	}
}
