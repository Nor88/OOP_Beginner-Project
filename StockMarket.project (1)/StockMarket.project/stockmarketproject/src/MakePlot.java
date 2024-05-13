// import org.math.plot.Plot2DPanel;
// import javax.swing.JFrame;
// import java.util.List;

// class MakePlot {
//     public static void simplePlot(List<Double> myList) {
//         // Convert the list to an array
//         double[] myArray = listToArray(myList);
        
//         // Create a plot
//         Plot2DPanel plot = new Plot2DPanel(); // Instantiate the plot
        
//         // Add the line plot to the plot panel
//         plot.addLinePlot("My Plot", myArray);
        
//         // Display the plot in a GUI window
//         JFrame frame = new JFrame("Plot Panel");
//         frame.setContentPane(plot);
//         frame.setSize(600, 600); // Set size of the frame
//         frame.setVisible(true);
//     }
    
//     private static double[] listToArray(List<Double> myList) {
//         // Convert List<Double> to double[]
//         double[] myArray = new double[myList.size()];
//         for (int i = 0; i < myList.size(); i++) {
//             myArray[i] = myList.get(i);
//         }
//         return myArray;
//     }
// }
