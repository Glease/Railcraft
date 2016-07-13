/*******************************************************************************
 * Copyright (c) CovertJaguar, 2011-2016
 * http://railcraft.info
 *
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 ******************************************************************************/
package mods.railcraft.common.blocks.aesthetics.materials.wall;

import java.util.List;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class WallProxyApha implements WallProxy {

    @Override
    public List<? extends WallInfo> getCreativeList() {
        return EnumWallAlpha.getCreativeList();
    }

    @Override
    public WallInfo fromMeta(int meta) {
        return EnumWallAlpha.fromMeta(meta);
    }
}