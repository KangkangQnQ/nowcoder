
/**
 * @nc app=nowcoder id=fe298c55694f4ed39e256170ff2c205f topic=37 question=21245 lang=Java
 * 2024-08-19 00:17:21
 * https://www.nowcoder.com/practice/fe298c55694f4ed39e256170ff2c205f?tpId=37&tqId=21245
 * [HJ22] 汽水瓶
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int count = in.nextInt();
            if (count == 0)
                return;
            else {
                int result = 0;
                while (count >= 3) {
                    result += count / 3;
                    count = count / 3 + count % 3;
                }
                while (count >= 2) {
                    result += count / 2;
                    count = count / 2 + count % 2;
                }
                System.out.println(result);
            }
        }

    }
}

/** @nc code=end */
