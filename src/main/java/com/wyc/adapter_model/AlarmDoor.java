package com.wyc.adapter_model;

/**
 * 判断是建抽象类还是接口:
 * 通过判断对象内容来选择是做抽象类 还是接口
 * abstract class ----------is a
 * interface      ----------like a
 */
abstract class Door {
    abstract void open();

    abstract void close();
}

interface Alarm {
    void alarm();
}

public class AlarmDoor extends Door implements Alarm {
    void open() {

    }

    void close() {

    }

    public void alarm() {

    }
}
