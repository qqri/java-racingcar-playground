package game;

import car.Cars;
import input.InputNum;
import input.InputView;
import print.PrintView;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GamePlay {
    static InputView inputView = new InputView();
    static PrintView printView = new PrintView();

    public static void main(String[] args) {

        Cars cars = new Cars(inputView.firstInput());
        int input = new InputNum(inputView.numberInput()).input;
        printView.playPrint();

        IntStream.range(0, input).forEach(i -> {
            cars.play();
            printView.eachPlayPrint(cars);
        });

        printView.winnerPrint(printView.winnerPlayPrint(cars.winner()));

    }


}
