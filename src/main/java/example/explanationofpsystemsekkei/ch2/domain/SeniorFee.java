package example.explanationofpsystemsekkei.ch2.domain;

public class SeniorFee implements Fee{
    private int price = 700;
    private String label = "シニア";

    SeniorFee(){}

    @Override
    public Yen yen() {
        return new Yen(price);
    }

    @Override
    public String label() {
        return label;
    }
}
