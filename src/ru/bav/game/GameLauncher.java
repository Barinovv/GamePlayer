package ru.bav.game;

/**
 * Класс для запуска игры.
 * @author Barinov 1518
 */
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
