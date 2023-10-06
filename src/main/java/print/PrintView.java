package print;

import car.Car;
import car.Cars;

import java.util.List;
import java.util.stream.IntStream;

public class PrintView {

    final String playMsg = "실행 결과";
    final String winnerMsg = "가 최종 우승했습니다.";
    public static void eachPlayPrint(Cars cars) {
        cars.carList.stream()
                .forEach(c->
                        System.out.println(c.name + " : " + goCarResultPrint(c.distance)));
        System.out.println();
    }

    private static String goCarResultPrint(int dist) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0,dist).forEach( i -> sb.append("-"));
        return sb.toString();
    }

    public static String winnerPlayPrint(List<Car> winnerCars) {
        return winnerCars.stream()
                            .map(Car::getName)
                            .reduce((s1, s2) -> s1 + ", " + s2)
                            .get();
    }

    public void playPrint() {
        System.out.println();
        System.out.println(playMsg);
    }

    public void winnerPrint(String winner){
        System.out.println(winner + winnerMsg);
    }
}
