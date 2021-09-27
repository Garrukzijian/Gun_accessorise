package GunAbstractclass.adapters;

public class MediaAdapter implements GunsAccessory {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") )
            advancedMusicPlayer = new VlcPlayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer = new Mp4Player();
        else if (audioType.equalsIgnoreCase("flac"))
            advancedMusicPlayer = new FlacPlayer();
        else if (audioType.equalsIgnoreCase("avi"))
            advancedMusicPlayer = new AviPlayer();
    }

    @Override
    public void play(String audioType, String Accessory_type) {

        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer.playVlc(Accessory_type);
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMp4(Accessory_type);
        else if(audioType.equalsIgnoreCase("flac"))
            advancedMusicPlayer.playFlac(Accessory_type);
        else if(audioType.equalsIgnoreCase("avi"))
            advancedMusicPlayer.playAvi(Accessory_type);
    }
}