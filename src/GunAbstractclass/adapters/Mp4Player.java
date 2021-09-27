package GunAbstractclass.adapters;

import GunAbstractclass.adapters.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

    @Override
    public void playFlac(String fileName){
        //do nothing
    }

    @Override
    public void playAvi(String fileName) {
        //do nothing
    }
}
