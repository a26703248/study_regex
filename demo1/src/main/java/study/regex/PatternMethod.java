package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMethod {

  public static void main(String[] args) {
    String content = "hello world, hello Bob!";

    // 1. Pattern.matches() 匹配文字
    // false
    // String regStr = "hello";
    // true
    // String regStr = "hello.*";
    // boolean res = Pattern.matches(regStr, content);
    // System.out.println("整體匹配: " + res);

    // 2. Matcher.start() and Matcher.end() 取得匹配文字的開始及結束索引
    // String regStr = "hello";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);
    // while(matcher.find()){
    // System.out.println("=======================");
    // System.out.println("start index:" + matcher.start());
    // System.out.println("end index:" + matcher.end());
    // }

    // 3. Matcher.matches 同 Pattern.matches
    // String regStr = "hello";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);
    // System.out.println("整體匹配: " + matcher.matches());

    // 4. Matcher.replaceAll() 替換找到的字串
    String regStr = "Bob";
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    String newContent = matcher.replaceAll("Allan");
    System.out.println("替換文字: " + newContent);
  }
}
