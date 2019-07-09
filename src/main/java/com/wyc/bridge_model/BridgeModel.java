package com.wyc.bridge_model;

/**
 * 桥接模式:
 * 蜡笔:12种颜色 大中小 共计36只笔
 * 毛笔:12种颜色 大中小 共计3字笔
 * 也就是抽象化和实现化分离
 * 桥接和适配的区别:
 * 已经有俩个模块(正在运行),想要关联起来,使用适配.
 * 如果还没有,只是分离开,使用桥接模式
 *
 */
public class BridgeModel {
    public static void main(String[] args) {
        Brush big=new BigBrush();
        big.setC(new Red());
        big.paint();
        big.setC(new Green());
        big.paint();
        big.setC(new Yellow());
        big.paint();

        Brush small=new SmallBrush();
        small.setC(new Red());
        small.paint();
        small.setC(new Green());
        small.paint();
        small.setC(new Yellow());
        small.paint();
    }
}
