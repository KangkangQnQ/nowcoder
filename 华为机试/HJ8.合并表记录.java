
/**
 * @nc app=nowcoder id=de044e89123f4a7482bd2b214a685201 topic=37 question=21231 lang=Java
 * 2024-08-17 23:40:11
 * https://www.nowcoder.com/practice/de044e89123f4a7482bd2b214a685201?tpId=37&tqId=21231
 * [HJ8] 合并表记录
 */

/** @nc code=start */

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            if (treeMap.containsKey(key)) {
                treeMap.put(key, value + treeMap.get(key));
            } else {
                treeMap.put(key, value);
            }
        }
        treeMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}

/** @nc code=end */
