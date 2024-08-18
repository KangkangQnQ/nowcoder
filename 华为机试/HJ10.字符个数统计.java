
/**
 * @nc app=nowcoder id=eb94f6a5b2ba49c6ac72d40b5ce95f50 topic=37 question=21233 lang=Java
 * 2024-08-18 00:11:26
 * https://www.nowcoder.com/practice/eb94f6a5b2ba49c6ac72d40b5ce95f50?tpId=37&tqId=21233
 * [HJ10] 字符个数统计
 */

/** @nc code=start */

import java.util.HashSet;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashSet<Character> hashSet = new HashSet<>();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            Character ch = str.charAt(i);
            if (ch >= 0 && ch <= 127) {
                hashSet.add(ch);
            }
        }
        System.out.println(hashSet.size());

    }
}

/** @nc code=end */
