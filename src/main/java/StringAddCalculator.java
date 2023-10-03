import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAddCalculator {

    static int splitAndSum(String str) {
        if(checkValidation(str)) return 0;
        Text text = new Text(str);
        List<Integer> nums = makeNumberList(text.nums ,text.regex);
        checkException(nums);

        return sum(nums);
    }
    static int sum(List<Integer> nums) {
        return nums.stream()
                .mapToInt(i->i)
                .sum();
    }
    static boolean checkValidation(String str) {
        return str==null || str.equals("");
    }
    static List<Integer> makeNumberList(String str, String regex) {
        return Arrays.stream(str.split(regex))
                .map(Integer::valueOf)
                .collect(Collectors.toList())
                ;
    }

    static void checkException(List<Integer> nums) {
        nums.stream().forEach(i -> negativeException(i));
    }

    static void negativeException(int i) {
        if(i < 0) throw new RuntimeException("음수는 올 수 없습니다.");
    }
}
