package study.regex;

public class RegexExam04 {
  public static void main(String[] args) {
    // 驗證是否為整數或小數123 -435 34.89 -87.9 0.45 -0.01 0034.89 +123 (需考慮正負數)
    String content = "0.45";
    String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

    if (content.matches(regStr)) {
      System.out.println("匹配成功");
    } else {
      System.out.println("匹配失敗");
    }
  }

}
