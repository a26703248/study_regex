package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex07 {

  /*
   * 限制匹配數字符
   * 1. * (範例: (abc)*) 匹配包含abc任意數量字元
   * 2. + (範例: m+(abc)*) 匹配開頭指少有1個m,後接abc任意數量字元
   * 3. ? (範例: m+abc?) 匹配開頭指少有1個m,後接abc或ab任意數量字元(c只能出現0或1次)
   * 當 ? 前方為其他限制匹配字符(*+?{n}{n,}{n,m}) 則為非貪婪模式匹配
   * 4. {n} (範例: [abcd]{3}) 匹配包含任意abcd字元組成長度為3的字元
   * 5. {n,} (範例: [abcd]{3,}) 匹配包含abcd至少出現3次的字元
   * 6. {n,m} (範例: [abcd]{3,10}) 匹配包含abcd出現3到10次的字元
   */
  public static void main(String[] args) {

    String content = "al1c8abcabc1abcABC$ \t　\n.圈差三角";
    // Java 匹配模式預設為貪婪模式,會盡量匹配越多字元
    // String regStr = "(abc1?){1,2}";
    // 非貪婪模式
    String regStr = "(abc1?){1,2}?";

    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
