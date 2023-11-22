package ru.ex.bot;

import ru.ex.bot.logic.BotResponse;

public interface AnswerWriter {
    void writeAnswer(BotResponse response);
}
