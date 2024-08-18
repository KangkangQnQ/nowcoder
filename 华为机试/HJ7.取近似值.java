
/**
 * @nc app=nowcoder id=3ab09737afb645cc82c35d56a5ce802a topic=37 question=21230 lang=Java
 * 2024-08-17 23:33:21
 * https://www.nowcoder.com/practice/3ab09737afb645cc82c35d56a5ce802a?tpId=37&tqId=21230
 * [HJ7] 取近似值
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        double numCopy = num;
        while (numCopy > 1) {
            numCopy -= 1;
        }
        if (numCopy >= 0.5)
            System.out.println((int) Math.ceil(num));
        else
            System.out.println((int) Math.floor(num));
    }
}

/** @nc code=end */
