package stockmarketproject.src;

import stockmarketproject.src.Investor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class InvestorGUI extends JFrame {
    private JLabel moneyLabel;
    private JTextField moneyField;
    private JButton tradingMethodButton;
    private Investor investor;

    public InvestorGUI(double initialMoney) {
        super("Investor Information");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(2, 2));


        moneyLabel = new JLabel("Money:");
        moneyField.setEditable(false);

        tradingMethodButton = new JButton("Trading Method");
        tradingMethodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Profit from trading method: $");

            }
        });

        add(moneyLabel);
        add(moneyField);
        add(new JLabel()); // Empty label for alignment
        add(tradingMethodButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InvestorGUI(10000));
    }
}

