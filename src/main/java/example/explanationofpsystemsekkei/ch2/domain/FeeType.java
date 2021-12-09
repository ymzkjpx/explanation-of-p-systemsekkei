package example.explanationofpsystemsekkei.ch2.domain;

public enum FeeType {
    ADULT(new AdultFee()),
    CHILD(new ChildFee()),
    SENIOR(new SeniorFee());

    private Fee fee;

    FeeType(Fee fee) {
        this.fee = fee;
    }

    Yen yen(){
        return fee.yen();
    }

    String label(){
        return fee.label();
    }
}
