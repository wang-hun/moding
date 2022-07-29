package com.wh.orientalmagic.block;

import net.minecraft.block.Block;

import java.util.Random;

import javax.annotation.Nonnull;



import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.item.ItemRegistryHandler;
import com.wh.orientalmagic.util.Reference;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class CinnabarOre extends Block
{
	public CinnabarOre() 
	{
	super(Material.ROCK);//方块类型
	this.setUnlocalizedName(Reference.Mod_ID+":cinnabar_ore");
	this.setRegistryName("cinnabar_ore");
	this.setHarvestLevel("pickaxe", 1);//挖掘工具，及等级，详见注释 
	this.setHardness(2.5F);//硬度	
	this.setCreativeTab(TabOrientalmagic.TAB_ORIENTALMAGIC);
	}
	  // SRG func_180660_a，用于决定掉落的物品种类
    @Nonnull
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegistryHandler.CINNABAR;
    }

    // SRG func_149745_a，用于决定掉落的物品数量
    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    // SRG func_149679_a，用于决定受时运影响时掉落的物品数量
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int bonusFactor = Math.max(random.nextInt(fortune + 2) - 1, 0);
            return this.quantityDropped(random) * (bonusFactor + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

    // Forge 的 patch，用于决定掉落的经验数量（参考原版煤炭、红石、青金石、钻石、绿宝石、下界石英）
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random random = world instanceof World ? ((World) world).rand : new Random();
        return MathHelper.getInt(random, 0, 3);
    }

    // Forge 的 patch，取代 getItem (func_185473_a)，用于创造模式下鼠标中键选取方块的功能。
    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this);
    }
}

