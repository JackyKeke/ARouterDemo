package com.jackykeke.commonbusinesslibrary.model.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by JackyKeke on 18-7-19.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:
 */


/**
 * .withString姓名
 * .withBoolean是否男性
 * .withChar英文首字母大写 ' '
 * <p>
 * .withInt 年龄
 * .withLong
 * .withDouble    钱数
 * .withByte
 * .withFloat
 * .withCharSequence
 * .with( Bundle bundle )
 * .withTransition(int enterAnim, int exitAnim)动画
 */

public class OrderDetailBean implements Parcelable {


    private String name;// 买主姓名

    private boolean man;//是否男性

    private String engChar;//英文首字母大写 ' '

    private int age;//年龄
    
    private double money;//钱数

    private String product;//商品


    public OrderDetailBean() {
    }

    public OrderDetailBean(String name, boolean man, String engChar, int age, double money, String product) {
        this.name = name;
        this.man = man;
        this.engChar = engChar;
        this.age = age;
        this.money = money;
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetailBean{" +
                "买主姓名：'" + name + '\'' +
                ", 是否男性：'" + man + '\'' +
                ", 英文首字母大写：" + engChar +
                ", 年龄：'" + age + '\'' +
                ", 钱数：'" + money + '\'' +
                ", 商品：'" + product + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public String getEngChar() {
        return engChar;
    }

    public void setEngChar(String engChar) {
        this.engChar = engChar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    protected OrderDetailBean(Parcel in) {

        this.name = in.readString();
        this.man = in.readByte() != 0;
        this.engChar = in.readString();
        this.age = in.readInt();
        this.money = in.readDouble();
        this.product = in.readString();


    }

    public static final Creator<OrderDetailBean> CREATOR = new Creator<OrderDetailBean>() {
        @Override
        public OrderDetailBean createFromParcel(Parcel in) {
            return new OrderDetailBean(in);
        }

        @Override
        public OrderDetailBean[] newArray(int size) {
            return new OrderDetailBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.name);
        dest.writeByte((byte)(man?1:0));
        dest.writeString(this.engChar);
        dest.writeInt(this.age);
        dest.writeDouble(this.money);
        dest.writeString(this.product);

    }


}
