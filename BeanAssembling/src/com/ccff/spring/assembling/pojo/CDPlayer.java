package com.ccff.spring.assembling.pojo;

import com.ccff.spring.assembling.service.CompactDisc;

public class CDPlayer {
    private CompactDisc compactDisc;

    public CDPlayer() {
    }

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void playMusic(){
        compactDisc.play();
    }
}
