
/**
 * @nc app=nowcoder id=05182d328eb848dda7fdd5e029a56da9 topic=37 question=21246 lang=Java
 * 2024-08-19 00:41:24
 * https://www.nowcoder.com/practice/05182d328eb848dda7fdd5e029a56da9?tpId=37&tqId=21246
 * [HJ23] 删除字符串中出现次数最少的字符
 */

/** @nc code=start */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str = in.nextLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        int min = Collections.min(hashMap.values());
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (hashMap.get(ch) == min)
                continue;
            sb.append(ch);
        }
        System.out.println(sb);
    }
}

/** @nc code=end */
