
/**
 * @nc app=nowcoder id=7960b5038a2142a18e27e4c733855dac topic=37 question=21244 lang=Java
 * 2024-08-19 00:03:11
 * https://www.nowcoder.com/practice/7960b5038a2142a18e27e4c733855dac?tpId=37&tqId=21244
 * [HJ21] 简单密码
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                System.out.print(2);
            } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                System.out.print(3);
            } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                System.out.print(4);
            } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                System.out.print(5);
            } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                System.out.print(6);
            } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
                System.out.print(7);
            } else if (ch == 't' || ch == 'u' || ch == 'v') {
                System.out.print(8);
            } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
                System.out.print(9);
            } else if (ch >= '0' && ch <= '9') {
                System.out.print(ch);
            } else if (ch == 'Z') {
                System.out.print('a');
            } else {
                System.out.print((char) (Character.toLowerCase(ch) + 1));
            }

        }
    }
}

/** @nc code=end */
