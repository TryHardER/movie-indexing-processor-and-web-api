package com.khaistimpson.movieindexingapi.Helpers;/*
 *
 * Created by Khai Stimpson - 2/23/2018
 *
 * */

import java.time.LocalDate;
import java.util.Random;

public class RandomDate {

        private final LocalDate minDate;
        private final LocalDate maxDate;
        private final Random random;

        public RandomDate() {
            this.minDate = LocalDate.of(1900, 1, 1);
            this.maxDate = LocalDate.of(2010, 1, 1);
            this.random = new Random();
        }

        public LocalDate nextDate() {
            int minDay = (int) minDate.toEpochDay();
            int maxDay = (int) maxDate.toEpochDay();
            long randomDay = minDay + random.nextInt(maxDay - minDay);
            return LocalDate.ofEpochDay(randomDay);
        }
}
