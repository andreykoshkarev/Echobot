package ru.ex.bot;

import ru.ex.bot.console.EchoAnswerWriter;
import ru.ex.bot.console.EchoInputReader;
import ru.ex.bot.logic.BotRequest;
import ru.ex.bot.logic.EchoBotHandler;

public class Main {
    public static void main(String[] args) {
        BotHandler botHandler = new EchoBotHandler();
        InputReader reader = new EchoInputReader();
        AnswerWriter writer = new EchoAnswerWriter();
        while (true) {
            BotRequest request = reader.getUserInput();
            if (request.getMessage().equalsIgnoreCase("выход"))
                break;
            botHandler.handleRequest(request, writer);
        }
    }

}
//
// ru.ex.bot.logic.BotRequest и ru.ex.bot.logic.BotResponse хранят данные запроса и ответа соответственно.тплдтшлэвпмышзщовышозвыа
// Интерфейс ru.ex.bot.BotHandler определяет метод handleRequest, который обрабатывает запрос и возвращает ответ.
// Класс ru.ex.bot.logic.EchoBotHandler реализует интерфейс ru.ex.bot.BotHandler и просто возвращает сообщение из запроса в качестве ответа.
