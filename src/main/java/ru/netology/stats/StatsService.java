package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] sales) {

        int allSumma = 0;
        for (int i = 0; i < sales.length; i++) {
            allSumma = (int) (allSumma + sales[i]);
        }

        return allSumma;
    }

    public int averageMonthlySales(int[] sales) {

        int allSumma = sumOfAllSales(sales);
        int averageAmount = allSumma / 12;

        return averageAmount;
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {

        int average = averageMonthlySales(sales);
        int below = 0;
        for (int i : sales) {
            if (i < average) {
                below = below + 1;
            }
        }
        return below;
    }

    public int aboveAverageSales(int[] sales) { // количество месяцев, в которых продажи были выше среднего

        int average = averageMonthlySales(sales);
        int above = 0;
        for (int i : sales) {
            if (i > average) {
                above = above + 1;
            }
        }
        return above;
    }
}