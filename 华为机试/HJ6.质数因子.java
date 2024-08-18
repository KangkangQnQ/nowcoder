
/**
 * @nc app=nowcoder id=196534628ca6490ebce2e336b47b3607 topic=37 question=21229 lang=Java
 * 2024-08-17 23:14:12
 * https://www.nowcoder.com/practice/196534628ca6490ebce2e336b47b3607?tpId=37&tqId=21229
 * [HJ6] 质数因子
 */

/** @nc code=start */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int num = in.nextInt();
        int count = 2;
        while (num > 1) {
            if (num % count == 0) {
                num /= count;
                arrList.add(count);
            } else {
                count++;
            }
        }
        arrList.forEach(x -> System.out.print(x + " "));
    }
}

/** @nc code=end */
