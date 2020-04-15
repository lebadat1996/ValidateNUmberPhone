package ValidateNumberPhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatePhone {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_EXAMPLE = "^(\\d{2})[-](0\\d{9})$";

    public validatePhone() {
        pattern = Pattern.compile(CLASS_EXAMPLE);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        if (matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("DON'T FIND");
        }
        return matcher.matches();
    }
}
