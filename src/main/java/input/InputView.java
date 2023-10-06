package input;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public InputView() { }

    final String firstIInputMsg = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    final String numberInputMsg = "시도할 회수는 몇회인가요?";


    public String firstInput() {
        System.out.println(firstIInputMsg);
        return sc.next();
    }

    public String numberInput() {
        System.out.println(numberInputMsg);
        return sc.next();
    }


}
