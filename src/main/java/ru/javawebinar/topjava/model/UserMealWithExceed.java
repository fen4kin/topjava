package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

public class UserMealWithExceed {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    private final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }

    public String toString() {
        return String.format("%s %s: %s %d %s",
                dateTime.toLocalDate().toString(),
                dateTime.toLocalTime().toString(),
                description, calories, exceed);
    }
}
