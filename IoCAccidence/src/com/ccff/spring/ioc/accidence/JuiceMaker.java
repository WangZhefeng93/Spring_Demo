package com.ccff.spring.ioc.accidence;

//制作果汁类
public class JuiceMaker {

    private Blender blender = null; //搅拌机
    private String water;   //水描述
    private String fruit;   //水果描述
    private String suger;   //糖量描述

    /**
     * 生成果汁
     * @return
     */
    public String makeJuice(){
        blender = new Blender();
        return blender.mix(water,fruit,suger);
    }

    public Blender getBlender() {
        return blender;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSuger() {
        return suger;
    }

    public void setSuger(String suger) {
        this.suger = suger;
    }
}