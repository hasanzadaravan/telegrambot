package com.ravanhasanzada.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TelegrambotApplication {

    public static void main(String[] args) throws TelegramApiException {
        SpringApplication.run(TelegrambotApplication.class, args);
        Bot bot = new Bot();
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(bot);
            bot.sendText(123456L, "Salam Azarbaycan");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
