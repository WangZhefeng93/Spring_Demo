package com.ccff.spring.assembling.service;

public class CompactDiscImpl implements CompactDisc {
    private String title = "依然范特西";
    private String artist = "周杰伦";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("当前正在播放"+artist+"的专辑《"+title+"》");
    }
}
