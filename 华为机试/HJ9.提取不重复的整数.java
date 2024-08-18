
/**
 * @nc app=nowcoder id=253986e66d114d378ae8de2e6c4577c1 topic=37 question=21232 lang=Java
 * 2024-08-17 23:49:12
 * https://www.nowcoder.com/practice/253986e66d114d378ae8de2e6c4577c1?tpId=37&tqId=21232
 * [HJ9] 提取不重复的整数
 */

/** @nc code=start */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        String str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            hashSet.add(str.charAt(i));
        }
        String s = "";
        for (Character ch : hashSet) {
            s += ch;
        }
        System.out.println(Integer.parseInt(s));
    }
}

/** @nc code=end */
