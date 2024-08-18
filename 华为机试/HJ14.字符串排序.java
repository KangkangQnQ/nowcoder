
/**
 * @nc app=nowcoder id=5af18ba2eb45443aa91a11e848aa6723 topic=37 question=21237 lang=Java
 * 2024-08-18 00:25:17
 * https://www.nowcoder.com/practice/5af18ba2eb45443aa91a11e848aa6723?tpId=37&tqId=21237
 * [HJ14] 字符串排序
 */

/** @nc code=start */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<String> arrayList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            arrayList.add(in.next());
        }
        // System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        arrayList.forEach(x -> System.out.println(x));

    }
}

/** @nc code=end */
