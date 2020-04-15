package ValidateNumberPhone;

public class test {
    public static final String t1 = "84-0978489648";
    public static final String t2 = "(84)-(0978489648)";

    public static void main(String[] args) {
        validatePhone validatePhone = new validatePhone();
        validatePhone.validate(t1);
        validatePhone.validate(t2);
    }
}
