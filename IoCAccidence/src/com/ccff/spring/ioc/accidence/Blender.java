package com.ccff.spring.ioc.accidence;

//搅拌机类
public class Blender {
    /**
     * 搅拌
     * @param water
     * @param fruit
     * @param sugar
     * @return
     */

    public String mix(String water, String fruit, String sugar){
        String juice = "这是一杯由液体："+water+"\n水果："+fruit+"\n糖量："+sugar+"\n组成的果汁";
        return juice;
    }

}
