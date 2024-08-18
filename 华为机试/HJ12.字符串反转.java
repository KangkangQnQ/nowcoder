
/**
 * @nc app=nowcoder id=e45e078701ab4e4cb49393ae30f1bb04 topic=37 question=21235 lang=Java
 * 2024-08-18 00:20:39
 * https://www.nowcoder.com/practice/e45e078701ab4e4cb49393ae30f1bb04?tpId=37&tqId=21235
 * [HJ12] 字符串反转
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

/** @nc code=end */
