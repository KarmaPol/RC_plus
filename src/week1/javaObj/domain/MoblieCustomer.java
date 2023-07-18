package week1.javaObj.domain;

import week1.javaObj.domain.discount.BonusDiscountPolicy;
import week1.javaObj.domain.discount.DiscountPoliciy;

public class MoblieCustomer extends Customer{
    public MoblieCustomer(String name, Grade grade, DiscountPoliciy discountPoliciy, int price) {
        setConnection("Mobile");
        setBonusPoint(0);

        setName(name);
        setGrade(grade);
        setDiscountPolicy(discountPoliciy);
        setPrice(price);
    }

    @Override
    public void getUserInfo() {
        System.out.println("접속 경로: " + getConnection());
        System.out.println("이름: " + getName());
        System.out.println("등급: " + getGrade());
        System.out.println("결제 방식: " + getDiscountPolicy());
        if (getDiscountPolicy() instanceof BonusDiscountPolicy) {
            System.out.println("보너스: " + getBonusPoint());
        }
        System.out.println("결제 금액: " + getPrice());
    }
}
