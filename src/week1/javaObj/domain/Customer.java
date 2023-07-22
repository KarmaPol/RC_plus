package week1.javaObj.domain;

import week1.javaObj.domain.discount.BonusDiscountPolicy;
import week1.javaObj.domain.discount.DiscountPoliciy;

abstract public class Customer {
    private String connection;
    private String name;
    private Grade grade;
    private DiscountPoliciy discountPolicy;
    private int price;
    private int BonusPoint;

    public Customer(String name, Grade grade, DiscountPoliciy discountPoliciy, int price) {
        setBonusPoint(0);
        setName(name);
        setGrade(grade);
        setDiscountPolicy(discountPoliciy);
        setPrice(price);
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public DiscountPoliciy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPoliciy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return BonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        BonusPoint = bonusPoint;
    }

    public void calculatePrice(){
        int discount = discountPolicy.calculate(price, grade.getRatio());
        if(discountPolicy instanceof BonusDiscountPolicy){
            setBonusPoint(this.getBonusPoint() + discount);
        }
        else {
            setPrice(getPrice() + discount);
        }
    }

    abstract public void getUserInfo();

    @Override
    public boolean equals(Object o){
        return this.getName() == ((Customer)o).getName();
    }
}
