package example.explanationofpsystemsekkei.ch2.domain;

public class Charge {
    Fee fee;

    public Charge(Fee fee) {
        this.fee = fee;
    }

    Yen yen(){
        return fee.yen();
    }
}
