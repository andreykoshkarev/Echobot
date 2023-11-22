package ru.ex.bot.logic;

public class BotRequest {
    private String message;

    public BotRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}