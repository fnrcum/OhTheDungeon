/* 
 * Copyright (C) 2021 shadow
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package shadow_lib;

import forge_sandbox.greymerk.roguelike.worldgen.IPositionInfo;
import org.bukkit.block.Biome;

/**
 *
 * @author
 */
public class ZonePositionInfo implements IPositionInfo {
    
        public Biome biome;
        public ZonePositionInfo(Biome b) {
            this.biome = b;
        }
	
	@Override
	public String getDimension() {
		return ZoneWorld.WORLD_NAME;
	}

	@Override
	public Biome getBiome() {
                return this.biome;
	}
}
