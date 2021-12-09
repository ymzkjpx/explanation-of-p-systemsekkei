package example.explanationofpsystemsekkei.ch2.domain;

public class ChildFee implements Fee{
    private int price = 500;
    private String label = "小人";

    ChildFee(){}

    @Override
    public Yen yen() {
        return new Yen(price);
    }

    @Override
    public String label() {
        return label;
    }
}
