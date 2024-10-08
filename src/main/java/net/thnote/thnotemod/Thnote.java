package net.thnote.thnotemod;

import net.fabricmc.api.ModInitializer;

import net.thnote.thnotemod.block.ModBlocks;
import net.thnote.thnotemod.block.entity.ModBlockEntities;
import net.thnote.thnotemod.item.ModItemGroups;
import net.thnote.thnotemod.item.ModItems;
import net.thnote.thnotemod.recipe.ModRecipes;
import net.thnote.thnotemod.screens.ModScreenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thnote implements ModInitializer {
	public static final String MOD_ID = "thnote";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// Direccion hacia la que mira el jugador:
	// X= -sin((float) (user.getYaw()*rad))*abs(cos((float) (user.getPitch()*rad)))
	// Y= -sin((float) (user.getPitch()*rad))
	// Z= cos((float) (user.getYaw()*rad))*abs(cos((float) (user.getPitch()*rad)))

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandler.registerScreenHandlers();
		ModRecipes.registerRecipes();
	}
}