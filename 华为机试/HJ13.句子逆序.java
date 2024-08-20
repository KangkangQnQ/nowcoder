
/**
 * @nc app=nowcoder id=48b3cb4e3c694d9da5526e6255bb73c3 topic=37 question=21236 lang=Java
 * 2024-08-18 00:22:03
 * https://www.nowcoder.com/practice/48b3cb4e3c694d9da5526e6255bb73c3?tpId=37&tqId=21236
 * [HJ13] 句子逆序
 */

/** @nc code=start */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(" ");
        //Arrays.stream(strings).sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
        for (int i = strings.length - 1; i >= 0; i--) {
        System.out.print(strings[i] + " ");
        }
    }
}

/** @nc code=end */
