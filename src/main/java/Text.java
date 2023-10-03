import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    String str;
    String nums;
    String regex;

    public Text(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        String customDelimiter = ",|:";
        this.nums = str;
        this.regex = customDelimiter;

        if (m.find()) {
            customDelimiter = customDelimiter + "|" + m.group(1);
            this.regex = customDelimiter;
            this.nums = m.group(2);
        }
    }

    public void setNums(String nums) {
        this.nums = nums;
    }
    public void setRegex(String regex) {
        this.regex = regex;
    }

}
