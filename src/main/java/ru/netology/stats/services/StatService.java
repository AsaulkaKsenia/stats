package ru.netology.stats.services;

public class StatService {
    public int sumSales(int[] sales) {
        int sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        return sumMonth;
    }

    public int averageSales(int[] sales) {
        int averageMonth = ((sumSales(sales)) / sales.length);
        return averageMonth;
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

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int belowMonth = 0;

        for (int i : sales) {
            if (i < averageSales(sales)) {
                belowMonth = belowMonth + 1;
            }
        }
        return belowMonth;

    }

    public int higherAverage(int[] sales) {
        int hiMonth = 0;

        for (int i : sales) {
            if (i > averageSales(sales)) {
                hiMonth = hiMonth + 1;
            }
        }
        return hiMonth;
    }

}




