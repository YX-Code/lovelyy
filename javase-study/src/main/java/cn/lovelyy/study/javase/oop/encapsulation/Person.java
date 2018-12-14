package cn.lovelyy.study.javase.oop.encapsulation;

import cn.lovelyy.study.javase.oop.inheritance.Phone;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class Person {
    private Account account;

    public Person() {
        this.account = new Account();
        this.account.setMoney(100000);
    }

    void pay(Integer money){
        if(account.getStatus()){
            int left = account.getMoney() - money;
            account.setMoney(left);
            if (left < 10) {
                account.setStatus(false);
            }
        }
    }
    public void call(Phone phone,String phoneNo){
        phone.call(phoneNo);
    }
}
