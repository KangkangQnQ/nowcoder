
/**
 * @nc app=nowcoder id=ae809795fca34687a48b172186e3dafe topic=37 question=21234 lang=Java
 * 2024-08-18 00:15:36
 * https://www.nowcoder.com/practice/ae809795fca34687a48b172186e3dafe?tpId=37&tqId=21234
 * [HJ11] 数字颠倒
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
