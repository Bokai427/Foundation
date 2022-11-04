// Generated by delombok at Fri Nov 04 22:13:54 CST 2022
package org.mineacademy.fo.event;

import org.bukkit.World;
import org.bukkit.event.HandlerList;

/**
 * Triggered when {@link OfflineRegionScanner} finishes scanning all offline regions on your disk
 */
public final class RegionScanCompleteEvent extends SimpleEvent {
	private static final HandlerList handlers = new HandlerList();
	/**
	 * The world this scanner operated in
	 */
	private final World world;

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	/**
	 * The world this scanner operated in
	 */
	@java.lang.SuppressWarnings("all")
	public World getWorld() {
		return this.world;
	}

	@java.lang.SuppressWarnings("all")
	public RegionScanCompleteEvent(final World world) {
		this.world = world;
	}
}
