package GunAbstractclass.adapters;

import GunAbstractclass.adapters.AccessoryPlayer;

public class GunsAdapters {
    public static void main(String[] args) {
        AccessoryPlayer accessoryPlayer = new AccessoryPlayer();

        accessoryPlayer.play("mp3", "beyond the horizon.mp3");
        accessoryPlayer.play("mp4", "alone.mp4");
        accessoryPlayer.play("vlc", "far far away.vlc");
        accessoryPlayer.play("avi", "mind me.avi");
        accessoryPlayer.play("flac","i will always love you.flac");
    }
}