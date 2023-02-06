package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {
  public static void main(String[] args) {
    String content = "Java EE，Java平台企業版（Java Platform Enterprise Edition），之前稱為Java 2 Platform, " +
        "Enterprise Edition (J2EE)，2018年3月更名為Jakarta EE。[1]是Sun公司為企業級應用推出的標準平台。Java平台共分為三個主要版本" +
        "Java EE、Java SE和Java ME。Sun公司在1998年發表JDK1.2版本的時候，使用了新名稱Java 2 Platform，即「Java2平台」，修改後的" +
        "JDK稱為Java 2 Platform Software Developing Kit，即J2SDK。並分為標準版（Standard Edition，J2SE），企業版（" +
        "Enterprise Edition，J2EE），微型版（MicroEdition，J2ME）。J2EE便由此誕生。2005年6月，JavaOne大會召開，SUN公司公開" +
        "Java SE 6。此時，Java的各種版本已經更名以取消其中的數字「2」：J2EE更名為Java EE, J2SE更名為Java SE，J2ME更名為Java ME。" +
        "隨著Java技術的發展，J2EE平台得到了迅速的發展，成為Java語言中最活躍的體系之一。現如今，J2EE不僅僅是指一種標準平台，它更多的表達著" +
        "一種軟體架構和設計思想。";
    // 匹配四個數字字串
    String regStr = "(\\d\\d)(\\d\\d)";
    // 建立匹配原則物件
    Pattern pattern = Pattern.compile(regStr);
    // 建立匹配物件
    Matcher matcher = pattern.matcher(content);
    while(matcher.find()){
      System.out.println("找到: " + matcher.group(0));
      System.out.println("第一組: " + matcher.group(1));
      System.out.println("第二組: " + matcher.group(2));
    }
  }
}
