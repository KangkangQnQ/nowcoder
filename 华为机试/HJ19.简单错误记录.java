/**
 * @nc app=nowcoder id=2baa6aba39214d6ea91a2e03dff3fbeb topic=37 question=21242 lang=Java
 * 2024-08-18 22:29:56
 * https://www.nowcoder.com/practice/2baa6aba39214d6ea91a2e03dff3fbeb?tpId=37&tqId=21242
 * [HJ19] 简单错误记录
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}

/** @nc code=end */
