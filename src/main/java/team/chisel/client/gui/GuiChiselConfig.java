package team.chisel.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import team.chisel.Chisel;
import team.chisel.config.Configurations;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiChiselConfig extends GuiConfig {

    public GuiChiselConfig(GuiScreen parent) {
        super(
                parent,
                new ConfigElement<ConfigCategory>(Configurations.config.getCategory(Configuration.CATEGORY_GENERAL))
                        .getChildElements(),
                Chisel.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(Configurations.config.toString()));
    }
}
