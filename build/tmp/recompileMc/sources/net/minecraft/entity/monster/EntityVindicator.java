package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityVindicator extends EntityMob
{
    protected static final DataParameter<Byte> field_190642_a = EntityDataManager.<Byte>createKey(EntityVindicator.class, DataSerializers.BYTE);
    private boolean field_190643_b;
    private static final Predicate<Entity> field_190644_c = new Predicate<Entity>()
    {
        public boolean apply(@Nullable Entity p_apply_1_)
        {
            return p_apply_1_ instanceof EntityLivingBase && ((EntityLivingBase)p_apply_1_).func_190631_cK();
        }
    };

    public EntityVindicator(World p_i47279_1_)
    {
        super(p_i47279_1_);
        this.setSize(0.6F, 1.95F);
    }

    public static void func_190641_b(DataFixer p_190641_0_)
    {
        EntityLiving.registerFixesMob(p_190641_0_, EntityVindicator.class);
    }

    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(8, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityVindicator.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        this.targetTasks.addTask(4, new EntityVindicator.AIJohnnyAttack(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3499999940395355D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(12.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(24.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(field_190642_a, Byte.valueOf((byte)0));
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ILLAGER;
    }

    protected ResourceLocation getLootTable()
    {
        return LootTableList.field_191186_av;
    }

    @SideOnly(Side.CLIENT)
    private boolean func_190637_a(int p_190637_1_)
    {
        int i = ((Byte)this.dataManager.get(field_190642_a)).byteValue();
        return (i & p_190637_1_) != 0;
    }

    private void func_190638_a(int p_190638_1_, boolean p_190638_2_)
    {
        int i = ((Byte)this.dataManager.get(field_190642_a)).byteValue();

        if (p_190638_2_)
        {
            i = i | p_190638_1_;
        }
        else
        {
            i = i & ~p_190638_1_;
        }

        this.dataManager.set(field_190642_a, Byte.valueOf((byte)(i & 255)));
    }

    public void func_190636_a(boolean p_190636_1_)
    {
        this.func_190638_a(1, p_190636_1_);

        if (this.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND) == ItemStack.field_190927_a)
        {
            this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_AXE));
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean func_190639_o()
    {
        return this.func_190637_a(1);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        if (this.field_190643_b)
        {
            compound.setBoolean("Johnny", true);
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        if (compound.hasKey("Johnny", 99))
        {
            this.field_190643_b = compound.getBoolean("Johnny");
        }
    }

    /**
     * Called only once on an entity when first time spawned, via egg, mob spawner, natural spawning etc, but not called
     * when entity is reloaded from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        IEntityLivingData ientitylivingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setEquipmentBasedOnDifficulty(difficulty);
        this.setEnchantmentBasedOnDifficulty(difficulty);
        return ientitylivingdata;
    }

    /**
     * Gives armor or weapon for entity based on given DifficultyInstance
     */
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
    {
        this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_AXE));
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
        this.func_190636_a(this.getAttackTarget() != null);
    }

    /**
     * Returns whether this Entity is on the same team as the given Entity.
     */
    public boolean isOnSameTeam(Entity entityIn)
    {
        return super.isOnSameTeam(entityIn) ? true : (entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getCreatureAttribute() == EnumCreatureAttribute.ILLAGER ? this.getTeam() == null && entityIn.getTeam() == null : false);
    }

    /**
     * Sets the custom name tag for this entity
     */
    public void setCustomNameTag(String name)
    {
        super.setCustomNameTag(name);

        if (!this.field_190643_b && "Johnny".equals(name))
        {
            this.field_190643_b = true;
        }
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.field_191268_hm;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.field_191269_hn;
    }

    protected SoundEvent getHurtSound()
    {
        return SoundEvents.field_191270_ho;
    }

    static class AIJohnnyAttack extends EntityAINearestAttackableTarget<EntityLivingBase>
        {
            public AIJohnnyAttack(EntityVindicator p_i47345_1_)
            {
                super(p_i47345_1_, EntityLivingBase.class, 0, true, true, EntityVindicator.field_190644_c);
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                return ((EntityVindicator)this.taskOwner).field_190643_b && super.shouldExecute();
            }
        }
}