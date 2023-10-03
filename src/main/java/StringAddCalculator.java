import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    static int splitAndSum(String str) {
        if(checkValidation(str)) return 0;
        Text text = seperator(str);
        List<Integer> nums = makeNumberList(text.nums ,text.regex);

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
                .collect(Collectors.toList());
    }

    public static Text seperator(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        String customDelimiter = ",|:";
        Text text = new Text(str , customDelimiter);

        if (m.find()) {
            customDelimiter = customDelimiter + "|" + m.group(1);
            text.setRegex(customDelimiter);
            text.setNums(m.group(2));
        }
        return text;
    }
}
