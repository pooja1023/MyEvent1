package com.example.padminich.myevent;



import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Belal on 2/26/2017.
 */
@IgnoreExtraProperties
public class DetailsEntry1 {
    private String artistId;
    private String artistName;
    private String artistGenre;

    public DetailsEntry1(){
        //this constructor is required
    }

    public DetailsEntry1(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}