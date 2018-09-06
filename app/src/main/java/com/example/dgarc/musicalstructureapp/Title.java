package com.example.dgarc.musicalstructureapp;

public class Title {

    private String mSongTitle;
    private String mArtist;

    /**
     * Create a new Title object.
     */
    public Title(String SongTitle, String ArtistTitle) {
        mSongTitle = SongTitle;
        mArtist = ArtistTitle;
    }

    /**
     * Get the Song Title.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the Artist.
     */
    public String getSongTitle() {
        return mSongTitle;
    }
}
