package example.explanationofpsystemsekkei.ch2.domain;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    List<Fee> list;

    @Deprecated
    Reservation(){}

    private Reservation(List<Fee> list) {
        this.list = list;
    }

    public static Reservation from(List<Fee> list){
        return new Reservation(list);
    }

    public List<Fee> asList() {
        return list;
    }

    public Reservation add(Fee fee){
        List<Fee> result = new ArrayList<>(fee);
        result.add(fee);
        return new Reservation(result);
    }

    public Yen total(){
        Yen result = new Yen(0);
        for (Fee fee : list) {
            result = result.plus(fee.yen());
        }
        return result;
    }
}
