package otd.nms.v1_20_R1;

import forge_sandbox.greymerk.roguelike.worldgen.spawners.SpawnPotential;
import otd.config.WorldConfig;
import otd.nms.GetRoguelike;

public class GetRoguelike120R1 implements GetRoguelike {
	public Object get(int level, String type, Object otag, SpawnPotential sp) {
		Object obj = null;
		obj = getInner(level, type, otag, sp);

		return obj;
	}

	private Object getInner(int level, String type, Object otag, SpawnPotential sp) {
		net.minecraft.nbt.NBTTagCompound tag = (net.minecraft.nbt.NBTTagCompound) otag;
		tag.a("id", type);

		if (!(WorldConfig.wc.rogueSpawners && sp.equip))
			return tag;
		net.minecraft.nbt.NBTTagList activeEffects = new net.minecraft.nbt.NBTTagList();
		tag.a("ActiveEffects", activeEffects);

		net.minecraft.nbt.NBTTagCompound buff = new net.minecraft.nbt.NBTTagCompound();
		activeEffects.add(buff);

		buff.a("Id", (byte) 4);
		buff.a("Amplifier", (byte) level);
		buff.a("Duration", 10);
		buff.a("Ambient", (byte) 0);

		return tag;
	}
}
