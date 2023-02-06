package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExam01 {

  public static void main(String[] args) {
    // 1. 驗證是否都為中文字
    // 格式 叉叉叉圈圈圈,叉叉叉a圈圈圈,叉叉叉 圈圈圈,叉叉叉1圈圈圈
    String content = "叉叉叉圈圈圈";
    String regStr = "^[\u4E00-\u9FA5]+$";

    // 2. 驗證電話
    // 格式 0912345678,09-12345678,02212345678,022-12345678
    // String content = "09-12345678";
    // String regStr = "^0[1-9]{1,2}-?\\d{8}$";

    // 3. 驗證是否為公司電話(加分機)
    // 格式 (02)12345678#02,02-12345678#02,0212345678#02
    // String content = "(02)12345678#02";
    // String regStr = "^\\(0[1-8]{1,2}\\)|0[1-8]{1,2}-?\\d{8}#\\d{1,4}$";

    // 4. URL 驗證
    // String content = "https://www.youtube.com/watch?v=QYvXGTB0vU4&list=PLjwE8m3kyOle-wKE_yLFQMGrGskyHIMmZ&index=17";
    // 當限制匹配數字符寫入[]內則為單純匹配字元
    // String regStr = "^((https?)://)([\\w-]+\\.)+[\\w-]+(?<param>\\/[\\w-?=&/%.#]*)?$";

    Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(content);
    if (matcher.find()) {
      System.out.println("找到");
    } else {
      System.out.println("沒找到");
    }
  }
}
