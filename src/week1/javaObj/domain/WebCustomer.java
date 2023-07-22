package week1.javaObj.domain;

import week1.javaObj.domain.discount.BonusDiscountPolicy;
import week1.javaObj.domain.discount.DiscountPoliciy;

public class WebCustomer extends Customer {
    public WebCustomer(String name, Grade grade, DiscountPoliciy discountPoliciy, int price) {
        super(name,grade,discountPoliciy,price);
        setConnection("Web");
    }

    @Override
    public void getUserInfo() {
        System.out.println("접속 경로: " + getConnection()
                + "\n이름: " + getName()
                + "\n등급: " + getGrade()
                + "\n결제 방식: " + getDiscountPolicy()
        );
        if (getDiscountPolicy() instanceof BonusDiscountPolicy) {
            System.out.println("보너스: " + getBonusPoint());
        }
        System.out.println("결제 금액: " + getPrice());
    }
}
