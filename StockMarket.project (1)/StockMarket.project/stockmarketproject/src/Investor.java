package stockmarketproject.src;

import java.util.Random;

abstract class Investor {
    protected double money;
    protected Random random;

    abstract void tradingMethod();

    Investor(double buyAndSellVolatility, Random random) {
        this.money = 0;
        this.random = random;
    }
}
