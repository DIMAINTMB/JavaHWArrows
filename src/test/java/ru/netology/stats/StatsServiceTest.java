package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumma = 180 ;
        int actualSumma = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSumma, actualSumma);
    }
    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        int actualAmount = service.averageMonthlySales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }
    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }
    @Test
    public void  belowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelow = 5;
        int actualBelow = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedBelow, actualBelow);
    }
    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAbove = 5;
        int actualAbove = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}