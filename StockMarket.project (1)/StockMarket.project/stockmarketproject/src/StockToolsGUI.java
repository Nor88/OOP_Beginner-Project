package stockmarketproject.src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StockToolsGUI extends JFrame {
    private JTextArea originalListTextArea, copyListTextArea;
    private JButton makeCopyButton;

    public StockToolsGUI() {
        super("Stock Tools");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        originalListTextArea = new JTextArea();
        originalListTextArea.setEditable(false);
        JScrollPane originalScrollPane = new JScrollPane(originalListTextArea);

        copyListTextArea = new JTextArea();
        copyListTextArea.setEditable(false);
        JScrollPane copyScrollPane = new JScrollPane(copyListTextArea);

        makeCopyButton = new JButton("Make Copy");
        makeCopyButton.addActionListener(e -> {
            List<Double> originalList = new ArrayList<>();
            // Populate original list with some data (not included here for simplicity)
            List<Double> copyList = StockTools.makeCopy(originalList);
            copyListTextArea.setText("Copy List:\n" + copyList.toString());
        });

        add(originalScrollPane);
        add(copyScrollPane);
        add(new JLabel()); // Empty label for alignment
        add(makeCopyButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StockToolsGUI());
    }
}

