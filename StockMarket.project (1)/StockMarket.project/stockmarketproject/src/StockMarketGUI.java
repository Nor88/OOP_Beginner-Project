package stockmarketproject.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockMarketGUI extends JFrame {
    private JTextArea stockTextArea;
    private JButton refreshButton;
    private JButton tradeButton;
    private StockMarket stockMarket;

    public StockMarketGUI() {
        super("Stock Market Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());


        stockTextArea = new JTextArea();
        stockTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(stockTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        refreshButton = new JButton("Refresh");
        buttonPanel.add(refreshButton);

        tradeButton = new JButton("Trade");
        buttonPanel.add(tradeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshStocks();
            }
        });

        tradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String symbol = JOptionPane.showInputDialog("Enter the symbol of the stock you want to trade:");
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the stock:"));
                int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of stocks to buy/sell:"));

                boolean buy = JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Trade Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;


                refreshStocks();
            }
        });

        refreshStocks();

        setVisible(true);
    }

    private void refreshStocks() {
        StringBuilder sb = new StringBuilder();

        List<Stock> allStocks = stockMarket.getAllStocks();

        stockTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StockMarketGUI());
    }
}
