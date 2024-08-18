
/**
 * @nc app=nowcoder id=440f16e490a0404786865e99c6ad91c9 topic=37 question=21238 lang=Java
 * 2024-08-18 00:43:14
 * https://www.nowcoder.com/practice/440f16e490a0404786865e99c6ad91c9?tpId=37&tqId=21238
 * [HJ15] 求int型正整数在内存中存储时1的个数
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        if (num <= 1) {
            System.out.println(num);
            return;
        }
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
                num -= 1;
            } else {
                num /= 2;
            }
        }
        System.out.println(count);
    }
}

/** @nc code=end */
