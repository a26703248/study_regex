package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex08 {

  /*
   * 定位字符
   * 1. ^ (範例: ^[0-9]+[a-z]*) 開頭為數字後接a-z字元
   * 2. $ (範例: ^[0-9]\\-[a-z]+$) 開頭為數字後接任意數量a-z結尾為a-z字元
   * 3. \\b (範例: han\\b) 匹配文字結束是han或是han後方有空白字元
   * 4. \\B (範例: han\\B) 匹配文字結束不是han或是han後方有空白字元
   */
  public static void main(String[] args) {
    String content = "hanspingacc chan han";
    String regStr = "han\\B";
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println("找到: " + matcher.group(0));
    }
  }
}
