package week1.javaObj.domain.discount;

public class MinusDiscountPolicy implements  DiscountPoliciy{
    @Override
    public int calculate(int gold, double ratio) {
        return (int)(-gold*ratio);
    }
    @Override
    public String toString(){
        return "할인 결제 방식";
    }
}
