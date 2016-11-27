package net.minecraft.entity.passive;

import javax.annotation.Nullable;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class EntityDonkey extends AbstractChestHorse
{
    public EntityDonkey(World p_i47298_1_)
    {
        super(p_i47298_1_);
    }

    public static void func_190699_b(DataFixer p_190699_0_)
    {
        AbstractChestHorse.func_190694_b(p_190699_0_, EntityDonkey.class);
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.field_191190_H;
    }

    protected SoundEvent getAmbientSound()
    {
        super.getAmbientSound();
        return SoundEvents.ENTITY_DONKEY_AMBIENT;
    }

    protected SoundEvent getDeathSound()
    {
        super.getDeathSound();
        return SoundEvents.ENTITY_DONKEY_DEATH;
    }

    protected SoundEvent getHurtSound()
    {
        super.getHurtSound();
        return SoundEvents.ENTITY_DONKEY_HURT;
    }

    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        return otherAnimal == this ? false : (!(otherAnimal instanceof EntityDonkey) && !(otherAnimal instanceof EntityHorse) ? false : this.canMate() && ((AbstractHorse)otherAnimal).canMate());
    }

    public EntityAgeable createChild(EntityAgeable ageable)
    {
        AbstractHorse abstracthorse = (AbstractHorse)(ageable instanceof EntityHorse ? new EntityMule(this.worldObj) : new EntityDonkey(this.worldObj));
        this.func_190681_a(ageable, abstracthorse);
        return abstracthorse;
    }
}