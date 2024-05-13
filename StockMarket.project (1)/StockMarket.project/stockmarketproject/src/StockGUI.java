package stockmarketproject.src;

import javax.swing.*;
import java.awt.*;

public class StockGUI extends JFrame {
    private JLabel symbolLabel, priceLabel, companyNameLabel;
    private JTextField symbolField, priceField, companyNameField;

    public StockGUI(String symbol, double price, String companyName) {
        super("Stock Information");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        symbolLabel = new JLabel("Symbol:");
        symbolField = new JTextField(symbol);
        symbolField.setEditable(false);

        priceLabel = new JLabel("Price:");
        priceField = new JTextField(String.valueOf(price));
        priceField.setEditable(false);

        companyNameLabel = new JLabel("Company Name:");
        companyNameField = new JTextField(companyName);
        companyNameField.setEditable(false);

        add(symbolLabel);
        add(symbolField);
        add(priceLabel);
        add(priceField);
        add(companyNameLabel);
        add(companyNameField);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StockGUI("AAPL", 150.0, "Apple Inc.");
        });
    }
}
