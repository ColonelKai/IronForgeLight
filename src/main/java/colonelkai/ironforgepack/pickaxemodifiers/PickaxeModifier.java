package colonelkai.ironforgepack.pickaxemodifiers;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PickaxeModifier {
	ItemStack pickaxe;
	
	List<Material> additionalCanBreak;
	List<Material> additionalCannotBreak;

	public PickaxeModifier(ItemStack i, List<Material> can, List<Material> cannot) {
		this.pickaxe = i;
		this.additionalCanBreak = can;
		this.additionalCannotBreak = cannot;
	}

	public boolean canBreak(Material i) {
		if(additionalCanBreak.contains(i)) {
			return true;
		}
		return false;
	}
	
	public boolean cannotBreak(Material i) {
		if(additionalCannotBreak.contains(i)) {
			return true;
		}
		return false;
	}

	public ItemStack getPickaxe() {
		return this.pickaxe;
	}
}
