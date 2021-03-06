package com.rolandoislas.treespirit.data.spirit;

import com.rolandoislas.treespirit.data.Config;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Rolando on 2/28/2017.
 */
public class SpiritSapling extends SpiritCore {
	SpiritSapling(World worldIn, BlockPos pos, String playerUuid) {
		super(worldIn, pos, playerUuid);
	}

	SpiritSapling(World worldIn, BlockPos pos) {
		super(worldIn, pos);
	}

	@Override
	public boolean equals(Object obj) {
		return SpiritCore.equals(this, obj, false);
	}
}
