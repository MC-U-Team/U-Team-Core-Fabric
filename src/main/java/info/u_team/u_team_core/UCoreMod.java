package info.u_team.u_team_core;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.tinyremapper.extension.mixin.common.data.AnnotationElement;
import org.apache.commons.lang3.AnnotationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.util.Annotations;

public class UCoreMod implements ModInitializer {

	public static final String MODID = "uteamcore";
	public static final Logger LOGGER = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
