
/**
 * @nc app=nowcoder id=184edec193864f0985ad2684fbc86841 topic=37 question=21243 lang=Java
 * 2024-08-18 22:31:00
 * https://www.nowcoder.com/practice/184edec193864f0985ad2684fbc86841?tpId=37&tqId=21243
 * [HJ20] 密码验证合格程序
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            boolean isLength = (str.length() > 8) ? true : false;
            boolean hasCaptial = false;
            boolean hasLowerCase = false;
            boolean hasNumber = false;
            boolean hasChar = false;
            boolean hasNull = false;
            boolean hasRepeat = false;

            for (int i = 0; i < str.length() - 3; i++) {
                String temp = str.substring(i, i + 3);
                if (str.substring(i + 3).contains(temp)) {
                    hasRepeat = true;
                    break;
                }
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9')
                    hasNumber = true;
                else if (ch >= 'A' && ch <= 'Z')
                    hasCaptial = true;
                else if (ch >= 'a' && ch <= 'z')
                    hasLowerCase = true;
                else if (ch == ' ' || ch == '\n')
                    hasNull = true;
                else
                    hasChar = true;
            }
            int count = 0;
            if (hasCaptial)
                count++;
            if (hasLowerCase)
                count++;
            if (hasNumber)
                count++;
            if (hasChar)
                count++;
            if (count >= 3 && isLength && !hasNull && !hasRepeat)
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }
}

/** @nc code=end */
