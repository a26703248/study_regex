package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex05 {

  public static void main(String[] args) {
    String content = "al1c8abcABC$ \t　\n.";
    // 1. 匹配 a-z 字元
    // String regStr = "[a-z]";

    // 2. 匹配 A-Z 字元
    // String regStr = "[A-Z]";

    // 3. 預設匹配區分大小寫
    // String regStr = "abc";

    // 4. 匹配不區分大小寫
    // String regStr = "(?i)abc";
    // bc 不區分大小寫
    // String regStr = "a(?i)bc";
    // b 不區分大小寫
    // String regStr = "a((?i)b)c";
    // 指定部曲分大小寫
    // String regStr = "abc";
    // Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);

    // 5. 匹配不包含a-z字元
    // String regStr = "[^a-z]";

    // 6. 匹配0-9字元
    // String regStr = "[0-9]";

    // 7. 匹配不包含0-9字元
    // String regStr = "[^0-9]";

    // 8. 匹配0-9字元
    // String regStr = "\\d";

    // 9. 匹配不包含0-9字元
    // String regStr = "\\D";

    // 10. 匹配0-9a-zA-z字元
    // String regStr = "\\w";

    // 11. 匹配不包含0-9a-zA-z_字元
    // String regStr = "\\W";

    // 12. 匹配空白字元(不包含全行空白)
    // String regStr = "\\s";

    // 13. 匹配不包含空白字元(不包含全行空白)
    // String regStr = "\\S";

    // 14. 匹配\n以外字元(若要匹配.字元則須加上\\.)
    String regStr = ".";

    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
