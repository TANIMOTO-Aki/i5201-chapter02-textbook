import java.io.*;

public class Question {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("あなたのお名前は？");

        String name = br.readLine();

        System.out.println(name + "さんの誕生日を当てましょう");
        System.out.println("これから伝える数値を入力してください");
        System.out.println("");
        System.out.println("あなたの誕生月に「４」を掛けます");
        System.out.println("次に「９」を足します");
        System.out.println("次に「２５」を掛けます");
        System.out.println("その数字に誕生日の「日にち」を足してください");
        System.out.println("");

        System.out.println("数字はいくつになりましたか？");
        String str = br.readLine();

        System.out.println(name + "さんの誕生日は" + (Integer.parseInt(str) - 225 ) + "（〇〇月〇〇日）ですね！");
    }    
}
