package study.regex;

public class Regex10 {

  /*
   * 捕獲:
   * 把正則表示式分組匹配的內容,保存到記憶體中以指定名稱或是數字的分組內
   * 方便後面使用,順序為從左至右
   * 反向引用:
   * 分組內容被捕獲後,可以在這個括號後被使用,從而更加複雜的表示式,此引用
   * 可用在正則表示式內部,符號為\\(name or seq),也可使用在外部,符號為
   * $(name or seq)
   */
  public static void main(String[] args) {
    // 1. 匹配2個連續相同的數字
    // String content = "1122";
    // String regStr = "(\\d)\\1";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);

    // 2. 匹配5個連續相同的數字
    // String content = "1111122";
    // String regStr = "(\\d)\\1{4}";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);

    // 3. 尋找數字且 1.第個位數與第千位數要相同 2. 第十位數與第百位數要相同 5225, 1551
    // String content = "5225";
    // String regStr = "(\\d)(\\d)\\2\\1";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);

    // 4. 匹配產品編號 12321-333999111,需求:開頭為五位數中間需用-分隔,
    // 後續接上9個數字且必須連續三個位數都要相同數字
    // String content = "12321-333999111";
    // String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
    // Pattern pattern = Pattern.compile(regStr);
    // Matcher matcher = pattern.matcher(content);

    // while (matcher.find()) {
    //   System.out.println("找到: " + matcher.group(0));
    // }
  }
}
