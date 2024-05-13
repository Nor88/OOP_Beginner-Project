package stockmarketproject.src;

import java.util.List;
import java.util.Random;

class StatisticsTools {
    static double randomNormal(double mean, double stdDev, Random random) {
        double number = random.nextGaussian();
        return number * stdDev + mean;
    }

    static double getMean(List<Double> myContainer) {
        double sum = 0;
        for (double ele : myContainer) {
            sum += ele;
        }
        return sum / myContainer.size();
    }

    static double getStdDev(List<Double> myContainer) {
        double mean = getMean(myContainer);
        double tempSum = 0;
        for (double d : myContainer) {
            tempSum += Math.pow((d - mean), 2);
        }
        return Math.sqrt(tempSum / myContainer.size());
    }
}
