
/**
 * @nc app=nowcoder id=a35ce98431874e3a820dbe4b2d0508b1 topic=37 question=21225 lang=Java
 * 2024-08-17 22:11:55
 * https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&tqId=21225
 * [HJ2] 计算某字符出现次数
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine().toLowerCase();
        char ch = in.nextLine().toLowerCase().charAt(0);
        int result = 0;
        int length = inputString.length();
        for (int i = 0; i < length; i++) {
            if (ch == inputString.charAt(i))
                result++;
        }
        System.out.println(result);
    }
}

/** @nc code=end */
