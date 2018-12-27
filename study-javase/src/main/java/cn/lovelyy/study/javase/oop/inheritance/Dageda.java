package cn.lovelyy.study.javase.oop.inheritance;

import cn.lovelyy.study.javase.oop.polymorphism.Phone;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class Dageda implements Phone {
    public Dageda() {
        System.out.println("创建大哥大");
    }

    @Override
    public void call(String phoneNo) {
        System.out.println("大哥大拨打电话"+phoneNo);
    }
}
