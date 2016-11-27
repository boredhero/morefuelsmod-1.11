package net.minecraft.inventory;

import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerHorseChest extends InventoryBasic
{
    public ContainerHorseChest(String p_i47268_1_, int p_i47268_2_)
    {
        super(p_i47268_1_, false, p_i47268_2_);
    }

    @SideOnly(Side.CLIENT)
    public ContainerHorseChest(ITextComponent p_i47269_1_, int p_i47269_2_)
    {
        super(p_i47269_1_, p_i47269_2_);
    }
}