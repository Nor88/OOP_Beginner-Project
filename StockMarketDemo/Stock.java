import java.util.Random;

public class Stock {
    private final String symbol;
    private double price;
    private final String companyName;
    private final double priceChangePercent;

    public Stock(String symbol, double initialPrice, String companyName, double priceChangePercent){
        this.symbol = symbol;
        this.price = initialPrice;
        this.companyName = companyName;
        this.priceChangePercent = priceChangePercent;

    }

    public String getSymbol(){
        return symbol;
    }

    public double getPrice(){
        return price;
    }

    public String getCompanyName(){
        return companyName;
    }


    //Method which simulates price change.
    public void updatePrice(){
        Random random = new Random();
        double change = price * priceChangePercent * (random.nextDouble() * 2 - 1);
        price += change;
    }

    @Override
    public String toString(){
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
