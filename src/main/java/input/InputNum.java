package input;
import java.util.regex.Matcher;
public class InputNum {
    public int input;

    public InputNum(String text) {
        this.input = makeInput(text);
    }

    public int makeInput(String text) {
        check(text);
        return Integer.parseInt(text);
    }

    private void check(String text) {
        if(text.matches("[^0-9]")) throw new NumberFormatException("회수에는 숫자만 입력 가능합니다.");
    }
}
