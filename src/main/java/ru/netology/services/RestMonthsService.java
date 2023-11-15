package ru.netology.services;

public class RestMonthsService {
    public int calcRestMonths(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int months = 1; months <= 12; months++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
