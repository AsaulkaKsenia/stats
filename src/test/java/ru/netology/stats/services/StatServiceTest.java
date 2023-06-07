package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldFindSumMonthSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMonth = 180;
        int actualSunMonth = service.sumSales(sales);

        Assertions.assertEquals(expectedSumMonth, actualSunMonth);
    }

    @Test
    public void shouldFindAverageMonthSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageMonth = 15;
        int actualAverageMonth = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageMonth, actualAverageMonth);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowMonth = 5;
        int actualBelowMonth = service.belowAverage(sales);

        Assertions.assertEquals(expectedBelowMonth, actualBelowMonth);

    }
    @Test
    public void shouldFindHigherAverageSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHiMonth = 5;
        int actualHiMonth = service.higherAverage(sales);

        Assertions.assertEquals(expectedHiMonth, actualHiMonth);

    }

}