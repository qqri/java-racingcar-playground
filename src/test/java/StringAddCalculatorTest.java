import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringAddCalculatorTest {

    @Test
    @DisplayName("null또는 빈문자열이 들어오면 0")
    public void splitAndSum_null() throws Exception {
        int result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }
    @Test
    @DisplayName("숫자 하나만 입력되면 해당 숫자 반환")
    public void splitAndSum_one() throws Exception {
        int result = StringAddCalculator.splitAndSum("2");
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("구분자 , : 인 경우 합 계산")
    public void splitAndSum_comma_colon() throws Exception {
        int result = StringAddCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_custom_구분자() throws Exception {
        String str = "//;\n1;2;3";
        String regex = StringAddCalculator.seperator(str).regex;
        String text = StringAddCalculator.seperator(str).nums;
        assertThat(regex).isEqualTo(",|:|;");
        assertThat(text).isEqualTo("1;2;3");
    }

    @Test
    public void splitAndSum_custom_계산() throws Exception {
        String str = "//;\n1;2;4";

        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(7);
    }
}
