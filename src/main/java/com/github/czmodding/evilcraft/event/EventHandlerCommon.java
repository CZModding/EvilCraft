package com.github.czmodding.evilcraft.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;

public class EventHandlerCommon {


	@SubscribeEvent(priority = EventPriority.NORMAL)
    public void onPlayerPickupXP(PlayerPickupXpEvent e) {
		 e.orb.xpValue *= 2;
	}
}

