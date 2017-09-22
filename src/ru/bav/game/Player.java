package ru.bav.game;

/**
 * Класс для начала игры с числами
 * @author Barinov 1518
 */

public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
