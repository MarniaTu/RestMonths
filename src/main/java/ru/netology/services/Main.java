package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestMonthsService service = new RestMonthsService();
        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        //int money = 0;
        //int count = 0;
        //for (int months = 1; months <= 12; months++) {
        //  if (money >= threshold) {
        //    System.out.println();
        //  System.out.println("Месяц " + months + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + (money - expenses) / 3 * 2);
        //money = (money - expenses) / 3;
        //count++;

        // } else {
        //   System.out.println();
        // System.out.println("Месяц " + months + ". Денег " + money + ". Придется работать. Заработал +" + income + ", потратил -" + expenses);
        // money = money + income - expenses;

        //  }
        System.out.println();
        System.out.println("В течение года получится отдохнуть " + service.calcRestMonths(100_000, 60_000, 150_000) + " раз(а)");
        // }
    }
}
