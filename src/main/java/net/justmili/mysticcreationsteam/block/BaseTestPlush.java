package net.justmili.mysticcreationsteam.block;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BaseTestPlush extends Block {
    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape BOUNDING_BOX = Block.box(2, 0, 2, 14, 16, 14);

    public BaseTestPlush() {
        super(Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, MCTPlushies.asResource("basetestplush")))
            .strength(0.8f, 0.8f)
            .mapColor(MapColor.COLOR_LIGHT_GRAY)
            .noOcclusion()
            .lightLevel(state -> 0)
            .isSuffocating((state, getter, pos) -> false)
            .isViewBlocking((state, getter, pos) -> false)
        );

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return BOUNDING_BOX;
    }
}
