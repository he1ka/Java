package com.company;

public class VideoGame extends Item {
   protected String platform;

    public VideoGame(String title, String barCode, String genre, String platform) {
        super(title, barCode, genre);
        this.platform = platform;
    }
}
