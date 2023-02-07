package study.regex;

public class RegexExam03 {
   public static void main(String[] args) {
    // 驗證電子信箱
    // 1. 只能有一個 @
    // 2. @ 前面可以是0-9a-zA-Z_-字符
    // 3. @ 後方格式必須為英文(gmail.com,yahoo.com.tw)
    String content = "a123456#@gmail.com";
    String regStr = "^[\\w]+@([a-zA-z]+\\.)+[a-zA-z]+$";

    if (content.matches(regStr)) {
      System.out.println("匹配成功");
    } else {
      System.out.println("匹配失敗");
    }
   }
}
