package Mid_term_exam;
//Câu 2
//Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó
//có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
//- Nếu mật khẩu ít hơn 10 ký tự thông báo 'mật khẩu yếu'
//- Nếu thiếu một trong các ký tự đặc biệt thì thông báo 'mật khẩu chưa đủ mạnh'

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input password: ");
        String pw = input.nextLine();

        //- Nếu mật khẩu ít hơn 10 ký tự thông báo 'mật khẩu yếu'
        if (!Question2.isMoreThan10(pw))
            System.out.println("Password is weak!");

        //- Nếu thiếu một trong các ký tự đặc biệt, ký tự in hoa, kí tự số thì thông báo 'mật khẩu chưa đủ mạnh'
        else if (Question2.isNotStrong(pw))
            System.out.println("Password is NOT strong enough!!!");

        else System.out.println("PASSWORD IS STRONG");
    }
}
