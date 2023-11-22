package ru.ex.bot;

import ru.ex.bot.logic.BotRequest;

public interface BotHandler {
    void handleRequest(BotRequest request, AnswerWriter writer);
}