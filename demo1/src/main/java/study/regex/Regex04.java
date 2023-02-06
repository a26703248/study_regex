package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {

  /*
   * 字元匹配字符
   * 1. [] (範例: [abc]) 尋找abc任一匹配字元
   * 2. [^] (範例: [^abc]) 排除abc任一匹配字元
   * 3. - (範例: [A-Z]) A到Z區間任一匹配字元
   * 4. . (範例: a..b) 開頭a結尾b中間長度為4,除 \n 以外任意匹配字元
   * 5. \\d (範例: \\d{3}(\\d)) 包含3到4個數字字元(\\d 等效於 [0-9])
   * 6. \\D (範例: \\D(\\d)*) 匹配開頭不為數字後續任意數字字元(\\D 等效於 [^0-9])
   * 7. \\w (範例: \\d{3}\\w{4}) 前3個字元以數字開頭後續任意字母數字,總長度為7的字元(\\w 等效於 [0-9a-zA-z])
   * 8. \\W (範例: \\W+\\d{2}) 開頭至少1個以上非字母數字字元後續2個數字結尾(\\W 等效於 [^0-9a-zA-z])
   */
  public static void main(String[] args) {
    String content = "abc$(a.bc(((123(";
    String regStr = "\\w{3}";
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println("找到: " + matcher.group(0));
    }
  }

}
