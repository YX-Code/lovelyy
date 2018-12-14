package cn.lovelyy.study.javase.oop.inheritance;

import cn.lovelyy.study.javase.oop.polymorphism.Phone;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class MiPhone implements Phone {
    public MiPhone() {
        System.out.println("创建小米手机");
    }

    public void playGame(){
        System.out.println("小米玩游戏");
    }

    @Override
    public void call(String phoneNo) {
        System.out.println("小米手机打电话"+phoneNo);
    }
}
