import java.util.Arrays;
import java.util.List;

public class StockTypes {
    // Constants for different types of stocks
    public static final String TECH_STOCK = "Tech";
    public static final String PHARMA_STOCK = "Pharma";
    public static final String ENERGY_STOCK = "Energy";
    public static final String PREFERRED_STOCK = "Preferred";
    public static final String GROWTH_STOCK = "Growth";
    public static final String INCOME_STOCK = "Income";
    public static final String BLUE_CHIP_STOCK = "Blue-Chip";
    public static final String CYCLICAL_STOCK = "Cyclical";
    public static final String DEFENSIVE_STOCK = "Defensive";
    public static final String ESG_STOCK = "ESG";
    public static final String IPO_STOCK = "IPO";
    public static final String PENNY_STOCK = "Penny";

    // Instance variables
    private String type;
    private double price;
    private int quantity;

    // Constructor
    public StockTypes(String type, double price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total value of the stocks
    public double calculateValue() {
        return price * quantity;
    }

    // Method to buy stocks
    public void buyStocks(int quantityToBuy) {
        quantity += quantityToBuy;
    }

    // Method to sell stocks
    public void sellStocks(int quantityToSell) {
        if (quantityToSell <= quantity) {
            quantity -= quantityToSell;
        } else {
            System.out.println("Insufficient stocks to sell.");
        }
    }

    // Method to display information about the stock
    public void displayStockInfo() {
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: $" + calculateValue());
    }

     public static String determineStockType(String description) {
        String[] keywordsPreferred = {"preferred", "preference", "dividend"};
        String[] keywordsGrowth = {"growth", "fast-growing", "expansion"};
        String[] keywordsIncome = {"income", "dividend", "regular income"};
        String[] keywordsBlueChip = {"blue-chip", "large-cap", "established"};
        String[] keywordsCyclical = {"cyclical", "economic cycle", "recession"};
        String[] keywordsDefensive = {"defensive", "consistent returns", "recession-proof"};
        String[] keywordsESG = {"esg", "environmental", "social justice"};
        String[] keywordsIPO = {"ipo", "initial public offering", "newly listed"};
        String[] keywordsPenny = {"penny", "speculative", "low-priced"};

        List<String[]> keywordLists = Arrays.asList(
            keywordsPreferred, keywordsGrowth, keywordsIncome,
            keywordsBlueChip, keywordsCyclical, keywordsDefensive,
            keywordsESG, keywordsIPO, keywordsPenny
        );

        String descriptionLower = description.toLowerCase();
        
        for (int i = 0; i < keywordLists.size(); i++) {
            String[] keywords = keywordLists.get(i);
            for (String keyword : keywords) {
                if (descriptionLower.contains(keyword)) {
                    switch(i) {
                        case 0: return PREFERRED_STOCK;
                        case 1: return GROWTH_STOCK;
                        case 2: return INCOME_STOCK;
                        case 3: return BLUE_CHIP_STOCK;
                        case 4: return CYCLICAL_STOCK;
                        case 5: return DEFENSIVE_STOCK;
                        case 6: return ESG_STOCK;
                        case 7: return IPO_STOCK;
                        case 8: return PENNY_STOCK;
                    }
                }
            }
        }
        return "Unknown";
    }

    // public static void main(String[] args) {}
    //     String description = "This stock provides regular income through dividends.";
    //     String stockType = determineStockType(description);
    //     System.out.println("The type of stock based on the description is: " + stockType);
    // }


    public static void main(String[] args) {
        StockTypes techStock = new StockTypes(TECH_STOCK, 150.50, 50);
        techStock.displayStockInfo();
        techStock.buyStocks(10);
        techStock.displayStockInfo();
        techStock.sellStocks(20);
        techStock.displayStockInfo();
    }
}
