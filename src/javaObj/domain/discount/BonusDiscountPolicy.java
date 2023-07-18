package javaObj.domain.discount;

public class BonusDiscountPolicy implements DiscountPoliciy{
    @Override
    public int calculate(int gold, double ratio) {
        return (int)(gold*ratio);
    }
    @Override
    public String toString(){
        return "보너스 결제 방식";
    }
}
