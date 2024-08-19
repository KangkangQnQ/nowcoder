
/**
 * @nc app=nowcoder id=119bcca3befb405fbe58abe9c532eb29 topic=37 question=21240 lang=Java
 * 2024-08-18 22:09:12
 * https://www.nowcoder.com/practice/119bcca3befb405fbe58abe9c532eb29?tpId=37&tqId=21240
 * [HJ17] 坐标移动
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(";");
        int x = 0, y = 0;
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            String subStr = "";
            try {
                subStr = str.substring(1);
            } catch (Exception e) {
                continue;
            }

            int num = 0;
            try {
                num = Integer.parseInt(subStr);
            } catch (Exception e) {
                continue;
            }
            if (str.charAt(0) == 'A') {
                x -= num;
            } else if (str.charAt(0) == 'D') {
                x += num;
            } else if (str.charAt(0) == 'W') {
                y += num;
            } else if (str.charAt(0) == 'S') {
                y -= num;
            } else {
                continue;
            }
        }
        System.out.println(x + "," + y);
    }
}

/** @nc code=end */
