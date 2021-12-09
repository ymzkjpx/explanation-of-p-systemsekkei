package example.explanationofpsystemsekkei.ch2.domain;

public class AdultFee implements Fee{
    private int price = 1000;
    private String label = "大人";

    AdultFee(){}

    @Override
    public Yen yen() {
        return new Yen(price);
    }

    @Override
    public String label() {
        return label;
    }
}
