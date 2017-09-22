package ru.bav.game;

/**
 * Класс для определения победителя в игре
 * @author Barinov 1518
 */

public class GuessGame {
    Player FirstPlayer;
    Player SecondPlayer;
    Player ThirdPlayer;

    /**
     * Класс для объявления игроков и проведения игры.
     */
    public void startGame() {
        FirstPlayer = new Player();
        SecondPlayer = new Player();
        ThirdPlayer = new Player();
        int GuessofFirstPlayer = 0;
        int GuessofSecondPlayer = 0;
        int GuessofTherdPlayer = 0;
        boolean FirstPlayerisRight = false;
        boolean SecondPlayerisRight = false;
        boolean TherdPlayerisRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я думаю о числе между 0 и 9...");
        while (true) {
            System.out.println("Загаданное число - " + targetNumber);
            FirstPlayer.guess();
            SecondPlayer.guess();
            ThirdPlayer.guess();

            GuessofFirstPlayer = FirstPlayer.number;
            System.out.println("Игрок №1 выбирает число - " + GuessofFirstPlayer);
            GuessofSecondPlayer = SecondPlayer.number;
            System.out.println("Игрок №2 выбирает число - " + GuessofSecondPlayer);
            GuessofTherdPlayer = ThirdPlayer.number;
            System.out.println("Игрок №3 выбирает число - " + GuessofTherdPlayer);

            if (GuessofFirstPlayer == targetNumber) {
                FirstPlayerisRight = true;
            }
            if (GuessofSecondPlayer == targetNumber) {
                SecondPlayerisRight = true;
            }
            if (GuessofTherdPlayer == targetNumber) {
                TherdPlayerisRight = true;
            }
            if (FirstPlayerisRight || SecondPlayerisRight || TherdPlayerisRight)
            {
                System.out.println("У нас есть победитель");
                System.out.println("Игрок №1 прав? - " + FirstPlayerisRight);
                System.out.println("Игрок №2 прав? - " + SecondPlayerisRight);
                System.out.println("Игрок №3 прав? - " + TherdPlayerisRight);
                System.out.println("Игра окончена.");

                break;
            }
            else {
                System.out.println("Игроки не угадали. Игроки пробуют еще раз.");
            }
        }
    }
}
