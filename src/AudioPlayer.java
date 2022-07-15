public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3:"+fileName);
        }
        if (audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid type");
        }
    }
}
