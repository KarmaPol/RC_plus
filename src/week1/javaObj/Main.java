package week1.javaObj;

import week1.javaObj.domain.Customer;
import week1.javaObj.domain.Grade;
import week1.javaObj.domain.MoblieCustomer;
import week1.javaObj.domain.WebCustomer;
import week1.javaObj.domain.discount.BonusDiscountPolicy;
import week1.javaObj.domain.discount.DiscountPoliciy;
import week1.javaObj.domain.discount.MinusDiscountPolicy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 세일 서비스 객체 생성
        DiscountPoliciy bonusDiscountPolicy = new BonusDiscountPolicy();
        DiscountPoliciy minusDiscountPolicy = new MinusDiscountPolicy();

        // 고객 객체 생성
        Customer webCustomer = new WebCustomer("이름6", Grade.GOLD, minusDiscountPolicy, 10000);
        Customer moblieCustomer = new MoblieCustomer("이름7", Grade.BRONZE, bonusDiscountPolicy, 10000);

        // 고객 리스트 생성, 추가
        List<Customer> customerList = new ArrayList<>();
        customerList.add(webCustomer);
        customerList.add(moblieCustomer);

        // 고객 정보 조회 & 가격 계산
        customerList.stream().forEach((customer) -> {
            System.out.println("====================");
            customer.calculatePrice();
            customer.getUserInfo();
        });

        System.out.println("====================");

        // 고객 객체 비교
//        System.out.println(webCustomer.equals(moblieCustomer));
    }
}
