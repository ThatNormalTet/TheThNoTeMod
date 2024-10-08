package net.thnote.thnotemod.screens;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.screens.crystalizer.CrystalizerScreenHandler;
import net.thnote.thnotemod.screens.oremizer.OremizerScreenHandler;

public class ModScreenHandler {
    //Registra las Screens
    public static final ScreenHandlerType<CrystalizerScreenHandler> CRYSTALIZER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Thnote.MOD_ID, "crystalizer"),
                    new ExtendedScreenHandlerType<>(CrystalizerScreenHandler::new));
    public static final ScreenHandlerType<OremizerScreenHandler> OREMIZER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Thnote.MOD_ID, "oremizer"),
                    new ExtendedScreenHandlerType<>(OremizerScreenHandler::new));

    public static void registerScreenHandlers(){
        Thnote.LOGGER.info("Registering Screen Handlers for " + Thnote.MOD_ID);
    }
}
