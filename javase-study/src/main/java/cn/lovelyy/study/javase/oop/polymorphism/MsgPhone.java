package cn.lovelyy.study.javase.oop.polymorphism;

import cn.lovelyy.study.javase.oop.inheritance.Dageda;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class MsgPhone extends Dageda {
    public MsgPhone() {
        System.out.println("创建能发短信的手机");
    }

    public void sendMsg(String msg){
        System.out.println(msg);
    }
}
