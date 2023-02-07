package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExam05 {
  public static void main(String[] args) {
    // 解析 URL
    // 1. 取得協定
    // 2. 取得域名
    // 3. 取得 port
    // 4. 取得頁面路徑
    String content = "https://www.howard7892.com:443/index@#$%^&.html";
    String regStr = "^(http|https)://([\\w.]+):(\\d+)[\\w-/]*/([\\w.@#$%^&]+)$";
    Matcher matcher = Pattern.compile(regStr).matcher(content);

    if(matcher.matches()){ // 整體匹配
      System.out.println("整體匹配: " + matcher.group(0));
      System.out.println("協定: " + matcher.group(1));
      System.out.println("域名: " + matcher.group(2));
      System.out.println("port: " + matcher.group(3));
      System.out.println("頁面名稱: " + matcher.group(4));
    }else{
      System.out.println("匹配失敗");
    }
  }
}
