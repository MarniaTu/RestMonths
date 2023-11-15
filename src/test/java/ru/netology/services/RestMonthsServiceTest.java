package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthsServiceTest {

    @Test
    void shouldCalculateThreeRestMonths() {
        RestMonthsService service = new RestMonthsService();
        int expected = 3;
        int actual = service.calcRestMonths(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateTwoRestMonths() {
        RestMonthsService service = new RestMonthsService();
        int expected = 2;
        int actual = service.calcRestMonths(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}

