package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Для запуска игры введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Для запуска игры введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        char option = 'y';
        while (option == 'y') {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                option = scanner.next().charAt(0);
            } while (option != 'n' && option != 'y');
        }
    }
}