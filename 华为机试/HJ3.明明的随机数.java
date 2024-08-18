
/**
 * @nc app=nowcoder id=3245215fffb84b7b81285493eae92ff0 topic=37 question=21226 lang=Java
 * 2024-08-17 22:23:16
 * https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&tqId=21226
 * [HJ3] 明明的随机数
 */

/** @nc code=start */

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int count = in.nextInt();
        TreeSet<Integer> numSet = new TreeSet<>();
        while (count > 0) {
            numSet.add(in.nextInt());
            count--;
        }
        numSet.forEach(x -> System.out.println(x));
    }
}

/** @nc code=end */
