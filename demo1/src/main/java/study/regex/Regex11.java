package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex11 {

  public static void main(String[] args) {
    String content = "我...我要...學學學學學.....學Java";
    String regStr = "\\.";
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    content = matcher.replaceAll("");
    System.out.println("替換到 . 符號:" + content);

    // 1. 使用(.)\\1+匹配任意字串
    // pattern = Pattern.compile("(.)\\1+");
    // matcher = pattern.matcher(content);
    // while (matcher.find()) {
    //   System.out.println("找到: " + matcher.group(1));
    // }

    // 2. 使用反向引用$替換匹配到的字串
    // content = matcher.replaceAll("$1");
    // System.out.println("結果: " + content);

    // 簡寫
    content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
    System.out.println("結果: " + content);
  }
}
