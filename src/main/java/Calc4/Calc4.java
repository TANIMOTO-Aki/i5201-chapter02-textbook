import java.io.*;

public class Calc4 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* メッセージの表示 */
        System.out.println("整数を入力してください");

        /* キーボードから入力 */
        String str = br.readLine();

        /* 整数に変換して計算する */
        System.out.println("２倍すると" + (Integer.parseInt(str) * 2));

    }
}
