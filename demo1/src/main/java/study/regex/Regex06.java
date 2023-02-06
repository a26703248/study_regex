package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex06 {

  /*
   * 條件匹配字符
   * 1. | (範例: ab|cd) 匹配ab或cd字元
   */
  public static void main(String[] args) {

    String content = "al1c8abcABC$ \t　\n.圈差三角";
    String regStr = "圈|差|三角";

    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }

}
