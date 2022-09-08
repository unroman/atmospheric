package com.teamabnormals.atmospheric.core.data.server.tags;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.teamabnormals.atmospheric.core.other.tags.AtmosphericBlockTags.*;
import static com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks.*;

public class AtmosphericBlockTagsProvider extends BlockTagsProvider {

	public AtmosphericBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Atmospheric.MOD_ID, existingFileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BlockTags.MINEABLE_WITH_AXE).add(
				ROSEWOOD_BOARDS.get(), ROSEWOOD_BOOKSHELF.get(), ROSEWOOD_LADDER.get(), ROSEWOOD_BEEHIVE.get(), ROSEWOOD_CHESTS.getFirst().get(), ROSEWOOD_CHESTS.getSecond().get(), ROSEWOOD_HEDGE.get(), ROSEWOOD_POST.get(), STRIPPED_ROSEWOOD_POST.get(),
				MORADO_BOARDS.get(), MORADO_BOOKSHELF.get(), MORADO_LADDER.get(), MORADO_BEEHIVE.get(), MORADO_CHESTS.getFirst().get(), MORADO_CHESTS.getSecond().get(), MORADO_HEDGE.get(), FLOWERING_MORADO_HEDGE.get(), MORADO_POST.get(), STRIPPED_MORADO_POST.get(),
				YUCCA_BOARDS.get(), YUCCA_BOOKSHELF.get(), YUCCA_LADDER.get(), YUCCA_BEEHIVE.get(), YUCCA_CHESTS.getFirst().get(), YUCCA_CHESTS.getSecond().get(), YUCCA_HEDGE.get(), YUCCA_POST.get(), STRIPPED_YUCCA_POST.get(),
				KOUSA_BOARDS.get(), KOUSA_BOOKSHELF.get(), KOUSA_LADDER.get(), KOUSA_BEEHIVE.get(), KOUSA_CHESTS.getFirst().get(), KOUSA_CHESTS.getSecond().get(), KOUSA_HEDGE.get(), KOUSA_POST.get(), STRIPPED_KOUSA_POST.get(),
				ASPEN_BOARDS.get(), ASPEN_BOOKSHELF.get(), ASPEN_LADDER.get(), ASPEN_BEEHIVE.get(), ASPEN_CHESTS.getFirst().get(), ASPEN_CHESTS.getSecond().get(), ASPEN_HEDGE.get(), ASPEN_POST.get(), STRIPPED_ASPEN_POST.get(),
				GRIMWOOD_BOARDS.get(), GRIMWOOD_BOOKSHELF.get(), GRIMWOOD_LADDER.get(), GRIMWOOD_BEEHIVE.get(), GRIMWOOD_CHESTS.getFirst().get(), GRIMWOOD_CHESTS.getSecond().get(), GRIMWOOD_HEDGE.get(), GRIMWOOD_POST.get(), STRIPPED_GRIMWOOD_POST.get(),
				PASSIONFRUIT_CRATE.get(), SHIMMERING_PASSIONFRUIT_CRATE.get(), YUCCA_CASK.get(), ROASTED_YUCCA_CASK.get(), BARREL_CACTUS_BATCH.get(),
				ARID_SPROUTS.get(), YUCCA_BRANCH.get(), ALOE_VERA.get(), TALL_ALOE_VERA.get()
		);

		this.tag(BlockTags.MINEABLE_WITH_HOE).add(
				ROSEWOOD_LEAVES.get(), ROSEWOOD_LEAF_PILE.get(), ROSEWOOD_LEAF_CARPET.get(),
				MORADO_LEAVES.get(), MORADO_LEAF_PILE.get(), MORADO_LEAF_CARPET.get(),
				FLOWERING_MORADO_LEAVES.get(), FLOWERING_MORADO_LEAF_PILE.get(), FLOWERING_MORADO_LEAF_CARPET.get(),
				YUCCA_LEAVES.get(), YUCCA_LEAF_PILE.get(), YUCCA_LEAF_CARPET.get(),
				KOUSA_LEAVES.get(), KOUSA_LEAF_PILE.get(), KOUSA_LEAF_CARPET.get(),
				ASPEN_LEAVES.get(), ASPEN_LEAF_PILE.get(), ASPEN_LEAF_CARPET.get(),
				GRIMWOOD_LEAVES.get(), GRIMWOOD_LEAF_PILE.get(), GRIMWOOD_LEAF_CARPET.get(),
				PASSION_VINE.get(), PASSION_VINE_BUNDLE.get(), YUCCA_BUNDLE.get(), ROASTED_YUCCA_BUNDLE.get(), ALOE_BUNDLE.get()
		);

		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
				IVORY_TRAVERTINE.get(), CHISELED_IVORY_TRAVERTINE.get(), CUT_IVORY_TRAVERTINE.get(), IVORY_TRAVERTINE_SLAB.get(), IVORY_TRAVERTINE_STAIRS.get(), IVORY_TRAVERTINE_WALL.get(), IVORY_TRAVERTINE_VERTICAL_SLAB.get(),
				PEACH_TRAVERTINE.get(), CHISELED_PEACH_TRAVERTINE.get(), CUT_PEACH_TRAVERTINE.get(), PEACH_TRAVERTINE_SLAB.get(), PEACH_TRAVERTINE_STAIRS.get(), PEACH_TRAVERTINE_WALL.get(), PEACH_TRAVERTINE_VERTICAL_SLAB.get(),
				PERSIMMON_TRAVERTINE.get(), CHISELED_PERSIMMON_TRAVERTINE.get(), CUT_PERSIMMON_TRAVERTINE.get(), PERSIMMON_TRAVERTINE_SLAB.get(), PERSIMMON_TRAVERTINE_STAIRS.get(), PERSIMMON_TRAVERTINE_WALL.get(), PERSIMMON_TRAVERTINE_VERTICAL_SLAB.get(),
				SAFFRON_TRAVERTINE.get(), CHISELED_SAFFRON_TRAVERTINE.get(), CUT_SAFFRON_TRAVERTINE.get(), SAFFRON_TRAVERTINE_SLAB.get(), SAFFRON_TRAVERTINE_STAIRS.get(), SAFFRON_TRAVERTINE_WALL.get(), SAFFRON_TRAVERTINE_VERTICAL_SLAB.get(),
				ARID_SANDSTONE.get(), ARID_SANDSTONE_SLAB.get(), ARID_SANDSTONE_STAIRS.get(), ARID_SANDSTONE_WALL.get(), SMOOTH_ARID_SANDSTONE.get(), SMOOTH_ARID_SANDSTONE_SLAB.get(), SMOOTH_ARID_SANDSTONE_STAIRS.get(), SMOOTH_ARID_SANDSTONE_VERTICAL_SLAB.get(), CUT_ARID_SANDSTONE.get(), CUT_ARID_SANDSTONE_SLAB.get(), CUT_ARID_SANDSTONE_VERTICAL_SLAB.get(), CHISELED_ARID_SANDSTONE.get(), ARID_SANDSTONE_BRICKS.get(), ARID_SANDSTONE_BRICK_SLAB.get(), ARID_SANDSTONE_BRICK_STAIRS.get(), ARID_SANDSTONE_BRICK_WALL.get(), ARID_SANDSTONE_BRICK_VERTICAL_SLAB.get(),
				RED_ARID_SANDSTONE.get(), RED_ARID_SANDSTONE_SLAB.get(), RED_ARID_SANDSTONE_STAIRS.get(), RED_ARID_SANDSTONE_WALL.get(), SMOOTH_RED_ARID_SANDSTONE.get(), SMOOTH_RED_ARID_SANDSTONE_SLAB.get(), SMOOTH_RED_ARID_SANDSTONE_STAIRS.get(), SMOOTH_RED_ARID_SANDSTONE_VERTICAL_SLAB.get(), CUT_RED_ARID_SANDSTONE.get(), CUT_RED_ARID_SANDSTONE_SLAB.get(), CUT_RED_ARID_SANDSTONE_VERTICAL_SLAB.get(), CHISELED_RED_ARID_SANDSTONE.get(), RED_ARID_SANDSTONE_BRICKS.get(), RED_ARID_SANDSTONE_BRICK_SLAB.get(), RED_ARID_SANDSTONE_BRICK_STAIRS.get(), RED_ARID_SANDSTONE_BRICK_WALL.get(), RED_ARID_SANDSTONE_BRICK_VERTICAL_SLAB.get()
		);

		this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ARID_SAND.get(), RED_ARID_SAND.get(), CRUSTOSE.get(), CRUSTOSE_PATH.get());

		this.tag(BlockTags.BEE_GROWABLES).add(PASSION_VINE.get());
		this.tag(BlockTags.BEEHIVES).add(ROSEWOOD_BEEHIVE.get(), MORADO_BEEHIVE.get(), YUCCA_BEEHIVE.get(), KOUSA_BEEHIVE.get(), ASPEN_BEEHIVE.get(), GRIMWOOD_BEEHIVE.get());
		this.tag(BlockTags.CLIMBABLE).add(PASSION_VINE.get(), ROSEWOOD_LADDER.get(), MORADO_LADDER.get(), YUCCA_LADDER.get(), KOUSA_LADDER.get(), ASPEN_LADDER.get(), GRIMWOOD_LADDER.get());
		this.tag(BlockTags.FLOWER_POTS).add(POTTED_ROSEWOOD_SAPLING.get(), POTTED_MORADO_SAPLING.get(), POTTED_YUCCA_SAPLING.get(), POTTED_KOUSA_SAPLING.get(), POTTED_ASPEN_SAPLING.get(), POTTED_GRIMWOOD_SAPLING.get(), POTTED_WARM_MONKEY_BRUSH.get(), POTTED_HOT_MONKEY_BRUSH.get(), POTTED_SCALDING_MONKEY_BRUSH.get(), POTTED_WATER_HYACINTH.get(), POTTED_YUCCA_FLOWER.get(), POTTED_BARREL_CACTUS.get(), POTTED_GILIA.get());
		this.tag(BlockTags.FLOWERS).add(FLOWERING_MORADO_LEAVES.get());
		this.tag(BlockTags.GUARDED_BY_PIGLINS).add(SHIMMERING_PASSIONFRUIT_CRATE.get(), ROSEWOOD_CHESTS.getFirst().get(), ROSEWOOD_CHESTS.getSecond().get(), MORADO_CHESTS.getFirst().get(), MORADO_CHESTS.getSecond().get(), YUCCA_CHESTS.getFirst().get(), YUCCA_CHESTS.getSecond().get(), KOUSA_CHESTS.getFirst().get(), KOUSA_CHESTS.getSecond().get(), ASPEN_CHESTS.getFirst().get(), ASPEN_CHESTS.getSecond().get(), GRIMWOOD_CHESTS.getFirst().get(), GRIMWOOD_CHESTS.getSecond().get());
		this.tag(BlockTags.LEAVES).add(ROSEWOOD_LEAVES.get(), MORADO_LEAVES.get(), FLOWERING_MORADO_LEAVES.get(), YUCCA_LEAVES.get(), KOUSA_LEAVES.get(), ASPEN_LEAVES.get(), GRIMWOOD_LEAVES.get());
		this.tag(BlockTags.LOGS_THAT_BURN).addTags(ROSEWOOD_LOGS, MORADO_LOGS, YUCCA_LOGS, ASPEN_LOGS, KOUSA_LOGS, GRIMWOOD_LOGS);
		this.tag(BlockTags.PLANKS).add(ROSEWOOD_PLANKS.get(), MORADO_PLANKS.get(), YUCCA_PLANKS.get(), KOUSA_PLANKS.get(), ASPEN_PLANKS.get(), GRIMWOOD_PLANKS.get(), VERTICAL_ROSEWOOD_PLANKS.get(), VERTICAL_MORADO_PLANKS.get(), VERTICAL_YUCCA_PLANKS.get(), VERTICAL_KOUSA_PLANKS.get(), VERTICAL_ASPEN_PLANKS.get(), VERTICAL_GRIMWOOD_PLANKS.get());
		this.tag(BlockTags.SAND).add(ARID_SAND.get(), RED_ARID_SAND.get());
		this.tag(BlockTags.SAPLINGS).add(ROSEWOOD_SAPLING.get(), MORADO_SAPLING.get(), YUCCA_SAPLING.get(), KOUSA_SAPLING.get(), ASPEN_SAPLING.get(), GRIMWOOD_SAPLING.get());
		this.tag(BlockTags.SMALL_FLOWERS).add(WARM_MONKEY_BRUSH.get(), HOT_MONKEY_BRUSH.get(), SCALDING_MONKEY_BRUSH.get(), YUCCA_FLOWER.get(), GILIA.get(), WATER_HYACINTH.get());
		this.tag(BlockTags.STANDING_SIGNS).add(ROSEWOOD_SIGNS.getFirst().get(), MORADO_SIGNS.getFirst().get(), YUCCA_SIGNS.getFirst().get(), KOUSA_SIGNS.getFirst().get(), ASPEN_SIGNS.getFirst().get(), GRIMWOOD_SIGNS.getFirst().get());
		this.tag(BlockTags.TALL_FLOWERS).add(TALL_YUCCA_FLOWER.get());
		this.tag(BlockTags.WALL_SIGNS).add(ROSEWOOD_SIGNS.getSecond().get(), MORADO_SIGNS.getSecond().get(), YUCCA_SIGNS.getSecond().get(), KOUSA_SIGNS.getSecond().get(), ASPEN_SIGNS.getSecond().get(), GRIMWOOD_SIGNS.getSecond().get());
		this.tag(BlockTags.WOODEN_BUTTONS).add(ROSEWOOD_BUTTON.get(), MORADO_BUTTON.get(), YUCCA_BUTTON.get(), KOUSA_BUTTON.get(), ASPEN_BUTTON.get(), GRIMWOOD_BUTTON.get());
		this.tag(BlockTags.WOODEN_DOORS).add(ROSEWOOD_DOOR.get(), MORADO_DOOR.get(), YUCCA_DOOR.get(), KOUSA_DOOR.get(), ASPEN_DOOR.get(), GRIMWOOD_DOOR.get());
		this.tag(BlockTags.WOODEN_FENCES).add(ROSEWOOD_FENCE.get(), MORADO_FENCE.get(), YUCCA_FENCE.get(), KOUSA_FENCE.get(), ASPEN_FENCE.get(), GRIMWOOD_FENCE.get());
		this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ROSEWOOD_PRESSURE_PLATE.get(), MORADO_PRESSURE_PLATE.get(), YUCCA_PRESSURE_PLATE.get(), KOUSA_PRESSURE_PLATE.get(), ASPEN_PRESSURE_PLATE.get(), GRIMWOOD_PRESSURE_PLATE.get());
		this.tag(BlockTags.WOODEN_SLABS).add(ROSEWOOD_SLAB.get(), MORADO_SLAB.get(), YUCCA_SLAB.get(), KOUSA_SLAB.get(), ASPEN_SLAB.get(), GRIMWOOD_SLAB.get());
		this.tag(BlockTags.WOODEN_STAIRS).add(ROSEWOOD_STAIRS.get(), MORADO_STAIRS.get(), YUCCA_STAIRS.get(), KOUSA_STAIRS.get(), ASPEN_STAIRS.get(), GRIMWOOD_STAIRS.get());
		this.tag(BlockTags.WOODEN_TRAPDOORS).add(ROSEWOOD_TRAPDOOR.get(), MORADO_TRAPDOOR.get(), YUCCA_TRAPDOOR.get(), KOUSA_TRAPDOOR.get(), ASPEN_TRAPDOOR.get(), GRIMWOOD_TRAPDOOR.get());
		this.tag(BlockTags.FENCE_GATES).add(ROSEWOOD_FENCE_GATE.get(), MORADO_FENCE_GATE.get(), YUCCA_FENCE_GATE.get(), KOUSA_FENCE_GATE.get(), ASPEN_FENCE_GATE.get(), GRIMWOOD_FENCE_GATE.get());

		this.tag(BlockTags.SLABS).add(ARID_SANDSTONE_SLAB.get(), SMOOTH_ARID_SANDSTONE_SLAB.get(), CUT_ARID_SANDSTONE_SLAB.get(), ARID_SANDSTONE_BRICK_SLAB.get(), RED_ARID_SANDSTONE_SLAB.get(), SMOOTH_RED_ARID_SANDSTONE_SLAB.get(), CUT_RED_ARID_SANDSTONE_SLAB.get(), RED_ARID_SANDSTONE_BRICK_SLAB.get(), IVORY_TRAVERTINE_SLAB.get(), PEACH_TRAVERTINE_SLAB.get(), PERSIMMON_TRAVERTINE_SLAB.get(), SAFFRON_TRAVERTINE_SLAB.get());
		this.tag(BlockTags.STAIRS).add(ARID_SANDSTONE_STAIRS.get(), SMOOTH_ARID_SANDSTONE_STAIRS.get(), ARID_SANDSTONE_BRICK_STAIRS.get(), RED_ARID_SANDSTONE_STAIRS.get(), SMOOTH_RED_ARID_SANDSTONE_STAIRS.get(), RED_ARID_SANDSTONE_BRICK_STAIRS.get(), IVORY_TRAVERTINE_STAIRS.get(), PEACH_TRAVERTINE_STAIRS.get(), PERSIMMON_TRAVERTINE_STAIRS.get(), SAFFRON_TRAVERTINE_STAIRS.get());
		this.tag(BlockTags.WALLS).add(ARID_SANDSTONE_WALL.get(), ARID_SANDSTONE_BRICK_WALL.get(), RED_ARID_SANDSTONE_WALL.get(), RED_ARID_SANDSTONE_BRICK_WALL.get(), IVORY_TRAVERTINE_WALL.get(), PEACH_TRAVERTINE_WALL.get(), PERSIMMON_TRAVERTINE_WALL.get(), SAFFRON_TRAVERTINE_WALL.get());

		this.tag(ROSEWOOD_LOGS).add(ROSEWOOD_LOG.get(), ROSEWOOD.get(), STRIPPED_ROSEWOOD_LOG.get(), ROSEWOOD.get());
		this.tag(MORADO_LOGS).add(MORADO_LOG.get(), MORADO_WOOD.get(), STRIPPED_MORADO_LOG.get(), MORADO_WOOD.get());
		this.tag(YUCCA_LOGS).add(YUCCA_LOG.get(), YUCCA_WOOD.get(), STRIPPED_YUCCA_LOG.get(), YUCCA_WOOD.get());
		this.tag(ASPEN_LOGS).add(ASPEN_LOG.get(), ASPEN_WOOD.get(), STRIPPED_ASPEN_LOG.get(), ASPEN_WOOD.get(), WATCHFUL_ASPEN_LOG.get(), WATCHFUL_ASPEN_WOOD.get(), CRUSTOSE_LOG.get(), CRUSTOSE_WOOD.get());
		this.tag(KOUSA_LOGS).add(KOUSA_LOG.get(), KOUSA_WOOD.get(), STRIPPED_KOUSA_LOG.get(), KOUSA_WOOD.get());
		this.tag(GRIMWOOD_LOGS).add(GRIMWOOD_LOG.get(), GRIMWOOD.get(), STRIPPED_GRIMWOOD_LOG.get(), GRIMWOOD.get());

		this.tag(MONKEY_BRUSH_PLACEABLE).addTag(BlockTags.DIRT).addTag(BlockTags.LOGS_THAT_BURN);
		this.tag(PASSION_VINE_GROWABLE_ON).add(ROSEWOOD_LEAVES.get()).addTag(ROSEWOOD_LOGS);
		this.tag(ALOE_PLACEABLE).addTag(BlockTags.SAND);
		this.tag(TALL_ALOE_GROWABLE_ON).addTag(Tags.Blocks.SAND_COLORLESS);
		this.tag(YUCCA_PLACEABLE).addTag(BlockTags.SAND).addTag(BlockTags.DIRT);
		this.tag(YUCCA_FLOWER_PLACEABLE).add(Blocks.CACTUS, YUCCA_LEAVES.get(), YUCCA_HEDGE.get()).addTag(YUCCA_PLACEABLE);
		this.tag(BARREL_CACTUS_PLACEABLE).addTag(BlockTags.SAND);

		this.tag(Tags.Blocks.CHESTS_WOODEN).add(ROSEWOOD_CHESTS.getFirst().get(), ROSEWOOD_CHESTS.getSecond().get(), MORADO_CHESTS.getFirst().get(), MORADO_CHESTS.getSecond().get(), YUCCA_CHESTS.getFirst().get(), YUCCA_CHESTS.getSecond().get(), KOUSA_CHESTS.getFirst().get(), KOUSA_CHESTS.getSecond().get(), ASPEN_CHESTS.getFirst().get(), ASPEN_CHESTS.getSecond().get(), GRIMWOOD_CHESTS.getFirst().get(), GRIMWOOD_CHESTS.getSecond().get());
		this.tag(Tags.Blocks.CHESTS_TRAPPED).add(ROSEWOOD_CHESTS.getSecond().get(), MORADO_CHESTS.getSecond().get(), YUCCA_CHESTS.getSecond().get(), KOUSA_CHESTS.getSecond().get(), ASPEN_CHESTS.getSecond().get(), GRIMWOOD_CHESTS.getSecond().get());
		this.tag(Tags.Blocks.FENCE_GATES_WOODEN).add(ROSEWOOD_FENCE_GATE.get(), MORADO_FENCE_GATE.get(), YUCCA_FENCE_GATE.get(), KOUSA_FENCE_GATE.get(), ASPEN_FENCE_GATE.get(), GRIMWOOD_FENCE_GATE.get());
		this.tag(Tags.Blocks.FENCES_WOODEN).add(ROSEWOOD_FENCE.get(), MORADO_FENCE.get(), YUCCA_FENCE.get(), KOUSA_FENCE.get(), ASPEN_FENCE.get(), GRIMWOOD_FENCE.get());
		this.tag(Tags.Blocks.SAND_COLORLESS).add(ARID_SAND.get());
		this.tag(Tags.Blocks.SAND_RED).add(RED_ARID_SAND.get());
		this.tag(Tags.Blocks.SANDSTONE).add(ARID_SANDSTONE.get(), CUT_ARID_SANDSTONE.get(), CHISELED_ARID_SANDSTONE.get(), SMOOTH_ARID_SANDSTONE.get(), RED_ARID_SANDSTONE.get(), CUT_RED_ARID_SANDSTONE.get(), CHISELED_RED_ARID_SANDSTONE.get(), SMOOTH_RED_ARID_SANDSTONE.get());

		this.tag(BlueprintBlockTags.LEAF_PILES).add(ROSEWOOD_LEAF_PILE.get(), MORADO_LEAF_PILE.get(), FLOWERING_MORADO_LEAF_PILE.get(), YUCCA_LEAF_PILE.get(), KOUSA_LEAF_PILE.get(), ASPEN_LEAF_PILE.get(), GRIMWOOD_LEAF_PILE.get());
		this.tag(BlueprintBlockTags.LADDERS).add(ROSEWOOD_LADDER.get(), MORADO_LADDER.get(), YUCCA_LADDER.get(), KOUSA_LADDER.get(), ASPEN_LADDER.get(), GRIMWOOD_LADDER.get());
		this.tag(BlueprintBlockTags.VERTICAL_SLABS).add(ARID_SANDSTONE_VERTICAL_SLAB.get(), SMOOTH_ARID_SANDSTONE_VERTICAL_SLAB.get(), CUT_ARID_SANDSTONE_VERTICAL_SLAB.get(), ARID_SANDSTONE_BRICK_VERTICAL_SLAB.get(), RED_ARID_SANDSTONE_VERTICAL_SLAB.get(), SMOOTH_RED_ARID_SANDSTONE_VERTICAL_SLAB.get(), CUT_RED_ARID_SANDSTONE_VERTICAL_SLAB.get(), RED_ARID_SANDSTONE_BRICK_VERTICAL_SLAB.get(), IVORY_TRAVERTINE_VERTICAL_SLAB.get(), PEACH_TRAVERTINE_VERTICAL_SLAB.get(), PERSIMMON_TRAVERTINE_VERTICAL_SLAB.get(), SAFFRON_TRAVERTINE_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.WOODEN_VERTICAL_SLABS).add(ROSEWOOD_VERTICAL_SLAB.get(), MORADO_VERTICAL_SLAB.get(), YUCCA_VERTICAL_SLAB.get(), KOUSA_VERTICAL_SLAB.get(), ASPEN_VERTICAL_SLAB.get(), GRIMWOOD_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.HEDGES).add(ROSEWOOD_HEDGE.get(), MORADO_HEDGE.get(), FLOWERING_MORADO_HEDGE.get(), YUCCA_HEDGE.get(), KOUSA_HEDGE.get(), ASPEN_HEDGE.get(), GRIMWOOD_HEDGE.get());
	}
}