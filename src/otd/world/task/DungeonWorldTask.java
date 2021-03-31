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
package otd.world.task;

/**
 *
 * @author shadow
 */
public abstract class DungeonWorldTask {
    
    public int[] chunkPos;
    
    public DungeonWorldTask(int x, int z) {
        chunkPos = new int[] {x, z};
    }
    public int getDelay() {
        return 1;
    }
    public int[] getChunkPos() {
        return chunkPos;
    }
}
