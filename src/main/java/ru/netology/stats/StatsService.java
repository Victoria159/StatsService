package ru.netology.stats;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }

    public int avg(int[] sales) {
        int averageSales = totalSum(sales) / sales.length;

        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int averageSales = avg(sales);
        int monthAmount = 0;
        for (int monthSale : sales) {
            if (monthSale < averageSales) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

    public int salesAreAboveAverage(int[] sales) {
        int averageSales = avg(sales);
        int monthAmount = 0;
        for (int monthSale : sales) {
            if (monthSale > averageSales) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }
}








