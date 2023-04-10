package ru.netology.stats.javamvn.services;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatsService {

    public int getSumOfSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAvrgOfSales(int[] sales) {
        return getSumOfSales(sales) / sales.length;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0; //номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int getMinSales(int[] sales) {
        int minSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int getSalesBelowAvrg(int[] sales) {
        int avrgSales = getAvrgOfSales(sales);
        int count = 0;
        for (int s : sales) {
            if (s < avrgSales) {
                count++;
            }
        }
        return count;
    }

    public int getSalesAboveAvrg(int[] sales) {
        int avrgSales = getAvrgOfSales(sales);
        int count = 0;
        for (int s : sales) {
            if (s > avrgSales) {
                count++;
            }
        }
        return count;
    }
}
