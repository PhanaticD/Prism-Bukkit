package me.botsko.prism.actions;

import java.util.EnumMap;
import java.util.Locale;

import org.bukkit.Material;

public class UseAction extends GenericAction {

	private static final EnumMap<Material, String> names = new EnumMap<>(Material.class);
	
	static {
		names.put(Material.FLINT_AND_STEEL, "tnt");
	}
	/**
	 * 
	 * @return
	 */
	@Override
	public String getNiceName() {
		Material material = getMaterial();
		String customName = names.get(material);
		
		if(customName == null) {
			return material.name().toLowerCase(Locale.ENGLISH);
		}
		
		return customName;
	}

	@Override
	public boolean hasExtraData() {
		return false;
	}

	@Override
	public String serialize() {
		return null;
	}
	
	@Override
	public void deserialize(String data) {
	}
}