package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
public static final int[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
void shouldTotalSum (){
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.totalSum(sales);

assertEquals(expected,actual);
}
@Test
    void shouldAverageSalesAmount(){
    StatsService service = new StatsService();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 15;

    int actual = service.averageSalesAmount(sales);
    assertEquals(expected,actual);
}
@Test
    void souldMaxSales(){
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 8;

    long actual = service.maxSales(sales);
    assertEquals(expected,actual);
}
@Test
    void shouldMinSales(){
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 9;

    long actual = service.minSales(sales);
    assertEquals(expected,actual);
}
    @Test
    void shouldBelowAverageSales(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.belowAverageSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldSalesAreAboveAverage(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.salesAreAboveAverage(sales);
        assertEquals(expected,actual);
    }

}
