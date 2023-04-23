package team.chisel.block;

import net.minecraft.block.Block;

import com.cricketcraft.chisel.api.ChiselTabs;

public class BlockHempcreteSand extends BlockCarvableSand {

    public BlockHempcreteSand() {
        super();
        setCreativeTab(ChiselTabs.tabStoneChiselBlocks);
        setHardness(0.5F);
        setResistance(0.5F);
        setStepSound(Block.soundTypeSand);

    }

}
