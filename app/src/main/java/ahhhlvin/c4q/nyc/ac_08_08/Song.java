package ahhhlvin.c4q.nyc.ac_08_08;

/**
 * Created by alvin2 on 8/8/15.
 */
public class Song {

    private long id;
    private String title;
    private String artist;


    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}




}
