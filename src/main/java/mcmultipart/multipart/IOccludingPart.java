package mcmultipart.multipart;

import java.util.List;

import net.minecraft.util.AxisAlignedBB;

public interface IOccludingPart extends IMultipart {

    public void addOcclusionBoxes(List<AxisAlignedBB> list);

}
