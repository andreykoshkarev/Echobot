package ru.ex.bot.logic;

import ru.ex.bot.AnswerWriter;
import ru.ex.bot.BotHandler;

public class EchoBotHandler implements BotHandler {
    @Override
    public void handleRequest(BotRequest request, AnswerWriter writer) {
        String message = request.getMessage();
        BotResponse botResponse = new BotResponse(message);
        writer.writeAnswer(botResponse);
    }
}
