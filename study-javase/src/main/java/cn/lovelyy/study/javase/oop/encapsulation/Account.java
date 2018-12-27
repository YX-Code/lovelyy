package cn.lovelyy.study.javase.oop.encapsulation;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author yaojianxing
 * @since 2018/12/14
 */
public class Account {
    private boolean status;
    private Integer money;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
