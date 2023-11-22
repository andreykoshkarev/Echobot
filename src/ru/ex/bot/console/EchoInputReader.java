package ru.ex.bot.console;

import ru.ex.bot.InputReader;
import ru.ex.bot.logic.BotRequest;

import java.util.Scanner;

public class EchoInputReader implements InputReader {
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public BotRequest getUserInput() {
        System.out.println("enter your message");
        System.out.println("exit \"выход\".");
        return new BotRequest(scanner.nextLine());
    }
}
