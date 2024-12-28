package javaAdvance;
import java.util.LinkedList;

public class musicPlayList {

    private LinkedList<String>playlist;

    public musicPlayList(){
        playlist = new LinkedList<>();
    }

    public void addSong(String song){
        playlist.add(song);
    }

    public void playNextSong(){
        if (!playlist.isEmpty()){
            System.out.println("Now playing: " + playlist.removeFirst());
        }else{
        System.out.println("There are no song playing");
        }
    }

    public String getCurrentSong(){
        if(!playlist.isEmpty()){
            return playlist.getFirst();
        }
        return null;
    }
    public boolean isEmpty(){
        return playlist.isEmpty();
    }

    public void clearSong(){
        playlist.clear();
    }
    public static void main(String[] args){
        musicPlayList music = new musicPlayList();
        music.addSong("song1");
        music.addSong("song2");
        music.addSong("song3");

        System.out.println("Current song is:" + music.getCurrentSong());
        music.playNextSong();
        music.playNextSong();
        music.clearSong();
        System.out.println(music.isEmpty());
    }
}
