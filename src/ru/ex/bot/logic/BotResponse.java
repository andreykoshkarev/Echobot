package ru.ex.bot.logic;

public class BotResponse {
    private String message;

    public BotResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}