package GunAbstractclass.adapters;

public class AccessoryPlayer implements GunsAccessory {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String Accessory_type) {

        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + Accessory_type);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("flac")||audioType.equalsIgnoreCase("avi")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, Accessory_type);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}