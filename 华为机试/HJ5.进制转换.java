
/**
 * @nc app=nowcoder id=8f3df50d2b9043208c5eed283d1d4da6 topic=37 question=21228 lang=Java
 * 2024-08-17 23:08:42
 * https://www.nowcoder.com/practice/8f3df50d2b9043208c5eed283d1d4da6?tpId=37&tqId=21228
 * [HJ5] 进制转换
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Integer.parseInt(str.substring(2, str.length()), 16));
    }
}

/** @nc code=end */
