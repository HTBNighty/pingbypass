package me.earth.pingbypass.api.event.loop;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.player.LocalPlayer;

@Getter
@RequiredArgsConstructor
public class LocalPlayerUpdateEvent {
    private final LocalPlayer player;

}