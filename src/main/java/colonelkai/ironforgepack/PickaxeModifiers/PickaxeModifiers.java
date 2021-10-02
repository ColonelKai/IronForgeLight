package colonelkai.ironforgepack.PickaxeModifiers;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class PickaxeModifiers {
	
	public static List<PickaxeModifier> getModifiers() {
		return Arrays.asList(

		/* ------ STONEEEE PICKAXEEEE ------ */
			new PickaxeModifier(
				new ItemStack(Material.STONE_PICKAXE),
				// Can Break
				Arrays.asList(
					Material.EMERALD_ORE,
					Material.EMERALD_BLOCK
				),
				// Cannot Break
				Arrays.asList(
					Material.IRON_ORE,
					Material.RAW_IRON_BLOCK,
					Material.IRON_BLOCK,
					Material.LAPIS_ORE,
					Material.LAPIS_BLOCK
				)
			),


			/* ------ GOLD PICKAXEEEE ------ */
			new PickaxeModifier(
				new ItemStack(Material.GOLDEN_PICKAXE),
				// Can Break
				Arrays.asList(
					Material.EMERALD_ORE,
					Material.EMERALD_BLOCK,
					Material.COPPER_ORE,
					Material.RAW_COPPER_BLOCK,
					
					// COPPER BLOCKS PAIN PAIN PAION PAIN PAIN PAIN PAIA APFKAFJANGJAFGIASGJD
					Material.COPPER_BLOCK,
					Material.WAXED_COPPER_BLOCK,

					Material.CUT_COPPER,
					Material.CUT_COPPER_SLAB,
					Material.CUT_COPPER_STAIRS,

					Material.EXPOSED_COPPER,
					Material.EXPOSED_CUT_COPPER,
					Material.EXPOSED_CUT_COPPER_SLAB,
					Material.EXPOSED_CUT_COPPER_STAIRS,

					Material.WEATHERED_COPPER,
					Material.WEATHERED_CUT_COPPER,
					Material.WEATHERED_CUT_COPPER_SLAB,
					Material.WEATHERED_CUT_COPPER_STAIRS,

					Material.OXIDIZED_COPPER,
					Material.OXIDIZED_CUT_COPPER,
					Material.OXIDIZED_CUT_COPPER_SLAB,
					Material.OXIDIZED_CUT_COPPER_STAIRS,

					Material.WAXED_CUT_COPPER,
					Material.WAXED_CUT_COPPER_SLAB,
					Material.WAXED_CUT_COPPER_STAIRS,

					Material.WAXED_EXPOSED_COPPER,
					Material.WAXED_EXPOSED_CUT_COPPER,
					Material.WAXED_EXPOSED_CUT_COPPER_SLAB,
					Material.WAXED_EXPOSED_CUT_COPPER_STAIRS,

					Material.WAXED_WEATHERED_COPPER,
					Material.WAXED_WEATHERED_CUT_COPPER,
					Material.WAXED_WEATHERED_CUT_COPPER_SLAB,
					Material.WAXED_WEATHERED_CUT_COPPER_STAIRS,

					Material.WAXED_OXIDIZED_COPPER,
					Material.WAXED_OXIDIZED_CUT_COPPER,
					Material.WAXED_OXIDIZED_CUT_COPPER_SLAB,
					Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS,

					Material.IRON_ORE,
					Material.RAW_IRON_BLOCK,
					Material.IRON_BLOCK,
					Material.LIGHTNING_ROD,
					Material.DEEPSLATE_IRON_ORE,
					Material.DEEPSLATE_COPPER_ORE,
					Material.DEEPSLATE_EMERALD_ORE

				),
				// Cannot Break
				Arrays.asList(

				)
			)
		);
	}
}
