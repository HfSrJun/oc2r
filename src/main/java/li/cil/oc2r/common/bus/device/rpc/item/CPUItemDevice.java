package li.cil.oc2r.common.bus.device.rpc.item;

import li.cil.oc2r.api.bus.device.object.Callback;
import li.cil.oc2r.common.item.CPUItem;
import net.minecraft.world.item.ItemStack;

public class CPUItemDevice extends AbstractItemRPCDevice {
    private final int frequency;
    public CPUItemDevice(final ItemStack identity) {
        super(identity, "cpu");
        frequency = ((CPUItem) identity.getItem()).getFrequency();
    }

    @Callback
    public int getFrequency()
    {
        return frequency;
    }
}
