package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSeedFood extends ItemFood implements net.minecraftforge.common.IPlantable
{
    private final Block crops;
    /** Block ID of the soil this seed food should be planted on. */
    private final Block soilId;

    public ItemSeedFood(int healAmount, float saturation, Block crops, Block soil)
    {
        super(healAmount, saturation, false);
        this.crops = crops;
        this.soilId = soil;
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY)
    {
        ItemStack itemstack = stack.getHeldItem(pos);
        net.minecraft.block.state.IBlockState state = playerIn.getBlockState(worldIn);
        if (hand == EnumFacing.UP && stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack) && state.getBlock().canSustainPlant(state, playerIn, worldIn, EnumFacing.UP, this) && playerIn.isAirBlock(worldIn.up()))
        {
            playerIn.setBlockState(worldIn.up(), this.crops.getDefaultState(), 11);
            itemstack.func_190918_g(1);
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Crop;
    }

    @Override
    public net.minecraft.block.state.IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return this.crops.getDefaultState();
    }
}