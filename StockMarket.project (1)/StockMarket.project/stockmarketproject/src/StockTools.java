package stockmarketproject.src;

import java.util.ArrayList;
import java.util.List;

class StockTools {

    static List<Double> makeCopy(List<Double> x) {
        return new ArrayList<>(x);
    }
}
