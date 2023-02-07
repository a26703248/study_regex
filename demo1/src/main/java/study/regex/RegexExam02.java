package study.regex;

import java.util.Arrays;

public class RegexExam02 {

  public static void main(String[] args) {

    // 使用正則表示式將 Java 版本相關文字替換成 Java(String 類中支援正則表示式的 replaceAll 方法)
    String content = "Java 10 是上一個快速發布版本，且已不再被支援。2018年9月，隨著 Java 11 的發布，Java 10 自當日起不再被支援。Oracle 將在 2019 年 1 月前為商業用途中的 Java 8 長期支援，而針對非商用的更新將繼續提供，直至 2020 年 12 月；此外，AdoptOpenJDK 也為 Java 8 提供免費更新。針對 Java 11 的長期支援將不再由 Oracle 提供，而是改由 OpenJDK 社群提供，例如 Eclipse Adoptium（以前稱之為 AdoptOpenJDK） 的 Eclipse Temurin。";

    System.out.println(content.replaceAll("Java \\d+", "Java"));

    // 判斷 03 或是 02 (String 類中支援正則表示式的 matches 方法)
    System.out.println("================================");
    content = "02-123456";
    if (content.matches("(03|02)-\\d+")) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // 依照~,#,-,數字來分割 hello#abc-jack12smith~ (String 類中支援正則表示式的 matches 方法)
    System.out.println("================================");
    content = "hello#abc-jack12smith~";
    String[] split = content.split("~|-|#|\\d+");
    Arrays.stream(split).forEach(System.out::println);
  }
}
