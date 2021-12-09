package example.explanationofpsystemsekkei.ch2.domain;

public class Yen {
    int value;

    @Deprecated
    Yen(){}

    public Yen(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public Yen plus(Yen other){
        return new Yen(this.value + other.value);
    }

    @Override
    public String toString() {
        return "Yen{" +
                "value=" + value +
                '}';
    }
}
