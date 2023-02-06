package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex03 {

  public static void main(String[] args) {
    // 轉義字元
    String content = "abc$(a.bc(123(";
    // Java 中各出字元須加上 \\ (例: .*+()$/\?[]^{})
    // String regStr = "(";
    String regStr = "\\.";
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println("找到: " + matcher.group(0));
    }
  }
}
