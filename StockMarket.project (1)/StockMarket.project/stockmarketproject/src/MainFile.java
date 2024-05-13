package stockmarketproject.src;

import java.util.Random;

public class MainFile {
    public static void main(String[] args) {
        Random random = new Random();
        StockMarket sm = new StockMarket(random);
        sm.showPlot(0);
    }
}

