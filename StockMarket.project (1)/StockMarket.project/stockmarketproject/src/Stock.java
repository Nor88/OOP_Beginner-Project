package stockmarketproject.src;
import java.util.Random;

class Stock {
    private double currentPrice;
    private Random random;
    private double randomShockVolatility; 

    Stock(double randomShockVolatility, double startPrice, Random random) {
        this.randomShockVolatility = randomShockVolatility;
        this.currentPrice = startPrice;
        this.random = random;
    }
    
    void randomEffect() {
        double shock = random.nextGaussian() * randomShockVolatility * currentPrice;
        currentPrice += shock;
    }

    double getCurrentPrice() {
        return currentPrice;
    }

}
