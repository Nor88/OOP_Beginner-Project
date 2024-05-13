package stockmarketproject.src; // Assuming both MainFile.java and StockMarket.java are in the same package

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockMarket {
    private List<Stock> allStocks = new ArrayList<>();
    Random random = new Random();

    StockMarket(Random random) {
        this.random = random;
    }

    List<Stock> getAllStocks() {
        return allStocks;
    }

    void showPlot(int stockId) {
        System.out.println("Showing plot for stock ID: " + stockId);
    }
}
