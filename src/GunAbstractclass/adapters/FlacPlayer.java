package GunAbstractclass.adapters;

import GunAbstractclass.adapters.AdvancedMediaPlayer;

public class FlacPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

    @Override
    public void playFlac(String fileName){
        System.out.println("Playing flac file. Name: "+ fileName);
    }
    @Override
    public void playAvi(String fileName) {
        //do nothing
    }
}
