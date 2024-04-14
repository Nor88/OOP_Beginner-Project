import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private final List<Stock> stocks;
    private int tradingDays;

    public StockMarket(){
        this.stocks = new ArrayList<>();
        this.tradingDays = 0;
    }

    public  void addStock(Stock stock){
        stocks.add(stock);
    }

    public void simulateTrading(int days){
        for(int i = 0; i < days; i++){
            tradingDays++;
            System.out.println("Day" + tradingDays + ":");

            //Simulate price update for each stock.
            for(Stock stock: stocks){
                stock.updatePrice();
                System.out.println("Price update for" + stock.getCompanyName() + "(" + stock.getSymbol() + "):$" + stock.getPrice());
            }
            System.out.println();
        }
    }


    //Simulate buying stock.
    public void buyStock(Stock stock, int quantity){
        System.out.println("Buying " + quantity + " shares of " + stock.getCompanyName() + "(" + stock.getSymbol() + ")");
    }


    //Simulate selling stock.
    public void sellStock(Stock stock, int quantity){
        System.out.println("Selling " + quantity + " shares of " + stock.getCompanyName() + "(" + stock.getSymbol() + ")");
    }

    public static void main(String[] args){
        StockMarket stockMarket = new StockMarket();

        //Adding some stocks to the market.
        Stock apple = new Stock("AAPL", 150.0, "Apple Inc.", 0.05);
        Stock google = new Stock("GOOGL", 2500.0, "Alphabet Inc.", 0.03);

        stockMarket.addStock(apple);
        stockMarket.addStock(google);

        //Example of trading for 10 days.
        stockMarket.simulateTrading(10);

        //Example of dealing with stocks(buying and selling)
        stockMarket.buyStock(apple, 5);
        stockMarket.sellStock(google, 3);
    }
}
