package Mid_term_exam;

public class Question2 {
    //Kiểm tra hơn 10 kí tự hay không?
    public static boolean isMoreThan10 (String pw){
        return pw.length() >= 10;
    }

    //Kiểm tra có một trong các ký tự đặc biệt, ký tự in hoa, kí tự số hay không?
    public static boolean isNotStrong(String pw){
        char[] arr = pw.toCharArray();
        if(isMoreThan10(pw)){
            for (char c : arr) {
                if (Character.isDigit(c) || Character.isUpperCase(c) || (c == '!') || (c == '@') ||
                        (c == '#') || (c == '$') || (c == '%') || (c == '&') || (c == '*') || (c == '(') ||
                        (c == '_') || (c == '+') || (c == '=') || (c == '|') || (c == '<') || (c == '>') ||
                        (c == '?') || (c == '{') || (c == '}') || (c == '/') || (c == '[') || (c == ']') ||
                        (c == '~') || (c == '-') || (c == '.') || (c == ' '))
                    return false;
            }
        }
        return true;
    }
}
