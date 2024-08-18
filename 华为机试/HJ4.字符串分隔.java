
/**
 * @nc app=nowcoder id=d9162298cb5a437aad722fccccaae8a7 topic=37 question=21227 lang=Java
 * 2024-08-17 22:53:27
 * https://www.nowcoder.com/practice/d9162298cb5a437aad722fccccaae8a7?tpId=37&tqId=21227
 * [HJ4] 字符串分隔
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String inputString = in.nextLine();
        if (inputString == "")
            return;
        int length = inputString.length();
        int count = ((length % 8) == 0) ? length / 8 : length / 8 + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count * 8; i++) {
            if (i < length)
                sb.append(inputString.charAt(i));
            else
                sb.append("0");

            if ((i + 1) % 8 == 0) {
                // System.out.println(sb);
                // sb = new StringBuilder();
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}

/** @nc code=end */
