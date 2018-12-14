package cn.lovelyy.study.javase.oop;

import cn.lovelyy.study.javase.oop.encapsulation.Person;
import cn.lovelyy.study.javase.oop.inheritance.MiPhone;
import cn.lovelyy.study.javase.oop.polymorphism.MsgPhone;
import cn.lovelyy.study.javase.oop.polymorphism.Phone;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class OopTest {
    public static void main(String[] args) {
        Person person = new Person();
        Phone phone1 = new MiPhone();
        Phone phone2 = new MsgPhone();
        person.call(phone1,"13333333333");
        person.call(phone2,"13333333333");
    }
}
