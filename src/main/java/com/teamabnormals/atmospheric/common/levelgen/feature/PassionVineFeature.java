package com.teamabnormals.atmospheric.common.levelgen.feature;

import com.mojang.serialization.Codec;
import com.teamabnormals.atmospheric.common.block.PassionVineBlock;
import com.teamabnormals.atmospheric.core.other.tags.AtmosphericBlockTags;
import com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public class PassionVineFeature extends Feature<NoneFeatureConfiguration> {
	public PassionVineFeature(Codec<NoneFeatureConfiguration> p_i49876_1_) {
		super(p_i49876_1_);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		WorldGenLevel worldIn = context.level();
		Random rand = context.random();
		BlockPos pos = context.origin();
		int i = 0;
		for (int j = 0; j < 400; ++j) {
			Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(rand);
			BlockState blockstate = AtmosphericBlocks.PASSION_VINE.get().defaultBlockState().setValue(PassionVineBlock.FACING, direction);
			BlockPos blockpos = pos.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			int lengthA = 3 + rand.nextInt(2) + rand.nextInt(2) + rand.nextInt(2) - rand.nextInt(3);

			if (worldIn.isEmptyBlock(blockpos) && blockpos.getY() > 50 && blockpos.getY() < 255 && blockstate.canSurvive(worldIn, blockpos)) {
				worldIn.setBlock(blockpos, getVineState(worldIn, blockstate, blockpos, rand), 6);
				for (int length = 0; length < lengthA; ++length) {
					blockpos = blockpos.below();
					if (worldIn.isEmptyBlock(blockpos) && blockpos.getY() < 255 && blockstate.canSurvive(worldIn, blockpos)) {
						worldIn.setBlock(blockpos, getVineState(worldIn, blockstate, blockpos, rand), 6);
					} else {
						break;
					}
				}
				++i;
			}
		}
		return i > 0;
	}

	private static BlockState getVineState(WorldGenLevel world, BlockState state, BlockPos pos, Random rand) {
		if (world.getBlockState(pos.relative(state.getValue(PassionVineBlock.FACING).getOpposite())).is(AtmosphericBlockTags.PASSION_VINE_GROWABLE_ON)) {
			return state.setValue(PassionVineBlock.AGE, 4);
		} else {
			return state.setValue(PassionVineBlock.AGE, 1);
		}
	}
}
