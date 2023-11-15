package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthsServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restmonths.csv")
    void shouldCalculateRestMonths(int expected, int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();
        //int expected = 3;
        int actual = service.calcRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //void shouldCalculateTwoRestMonths() {
    //  RestMonthsService service = new RestMonthsService();
    //int expected = 2;
    //int actual = service.calcRestMonths(100_000, 60_000, 150_000);

    //Assertions.assertEquals(expected, actual);
    //}
}

