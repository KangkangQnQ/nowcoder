/**
 * @nc app=nowcoder id=de538edd6f7e4bc3a5689723a7435682 topic=37 question=21241 lang=Java
 * 2024-08-18 22:27:01
 * https://www.nowcoder.com/practice/de538edd6f7e4bc3a5689723a7435682?tpId=37&tqId=21241
 * [HJ18] 识别有效的IP地址和掩码并进行分类统计
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
