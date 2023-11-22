package ru.ex.bot.console;

import ru.ex.bot.AnswerWriter;
import ru.ex.bot.logic.BotResponse;

public class EchoAnswerWriter implements AnswerWriter {
    @Override
    public void writeAnswer(BotResponse response) {
        System.out.println("Message: " + response.getMessage());
    }
}
