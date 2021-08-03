package com.minecraftabnormals.atmospheric.common.world.gen.feature;

import com.minecraftabnormals.atmospheric.common.block.AloeVeraBlock;
import com.minecraftabnormals.atmospheric.common.block.AloeVeraTallBlock;
import com.minecraftabnormals.atmospheric.core.registry.AtmosphericBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;

import java.util.Random;

public class AloeVeraFeature extends DefaultFlowersFeature {
	public AloeVeraFeature(Codec<BlockClusterFeatureConfig> config) {
		super(config);
	}

	@Override
	public boolean place(ISeedReader worldIn, ChunkGenerator generator, Random rand, BlockPos pos, BlockClusterFeatureConfig config) {
		BlockState blockstate = AtmosphericBlocks.ALOE_VERA.get().defaultBlockState();
		BlockState tallBlockstate = AtmosphericBlocks.TALL_ALOE_VERA.get().defaultBlockState();
		int i = 0;

		for (int j = 0; j < this.getCount(config); ++j) {
			BlockPos blockpos = this.getPos(rand, pos, config);
			if (worldIn.isEmptyBlock(blockpos) && blockpos.getY() < worldIn.getMaxBuildHeight() - 1 && blockstate.canSurvive(worldIn, blockpos) && this.isValid(worldIn, blockpos, config)) {
				if (rand.nextBoolean() && worldIn.isEmptyBlock(blockpos.above())) {
					worldIn.setBlock(blockpos, tallBlockstate.setValue(AloeVeraTallBlock.AGE, 8), 2);
					worldIn.setBlock(blockpos.above(), tallBlockstate.setValue(AloeVeraTallBlock.HALF, DoubleBlockHalf.UPPER).setValue(AloeVeraTallBlock.AGE, 8), 2);
				} else {
					worldIn.setBlock(blockpos, blockstate.setValue(AloeVeraBlock.AGE, 5), 2);
				}
				++i;
			}
		}
		return i > 0;
	}
}
