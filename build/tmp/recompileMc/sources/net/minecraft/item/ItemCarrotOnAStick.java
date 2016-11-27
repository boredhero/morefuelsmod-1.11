package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCarrotOnAStick extends Item
{
    public ItemCarrotOnAStick()
    {
        this.setCreativeTab(CreativeTabs.TRANSPORTATION);
        this.setMaxStackSize(1);
        this.setMaxDamage(25);
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    public ActionResult<ItemStack> onItemRightClick(World itemStackIn, EntityPlayer worldIn, EnumHand playerIn)
    {
        ItemStack itemstack = worldIn.getHeldItem(playerIn);

        if (worldIn.isRiding() && worldIn.getRidingEntity() instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)worldIn.getRidingEntity();

            if (itemstack.getMaxDamage() - itemstack.getMetadata() >= 7 && entitypig.boost())
            {
                itemstack.damageItem(7, worldIn);

                if (itemstack.func_190926_b())
                {
                    ItemStack itemstack1 = new ItemStack(Items.FISHING_ROD);
                    itemstack1.setTagCompound(itemstack.getTagCompound());
                    return new ActionResult(EnumActionResult.SUCCESS, itemstack1);
                }

                return new ActionResult(EnumActionResult.SUCCESS, itemstack);
            }
        }

        worldIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.PASS, itemstack);
    }
}