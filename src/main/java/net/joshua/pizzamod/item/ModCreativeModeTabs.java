package net.joshua.pizzamod.item;

import net.joshua.pizzamod.PizzaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PizzaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PIZZA_TAB = CREATIVE_MODE_TABS.register("pizza_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIZZA.get()))
                    .title(Component.translatable("creativetab.pizza_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PIZZA.get());
                        pOutput.accept(ModItems.RAW_DOUGH.get());
                        pOutput.accept(ModItems.WHEAT_FLOUR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
