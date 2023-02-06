package study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex09 {

  /*
   * 分組
   * 1. (pattern)
   * 非命名捕獲,捕獲匹配的子字元,編號為零的第1個的捕獲是由整個正則表示式模式匹配
   * 的文本,其他捕獲結果根據左括號的順序從1開始自動編號
   * 2. (?<name>pattern)
   * 命名捕獲,將匹配的子字串捕獲到一個組名稱或是編號名稱中,用於name的字串不能包
   * 含任何標點符號,並且不能以數字開頭,可以使用單引號代替尖括號,例:(?'name')
   * 3. (?:pattern)
   * 匹配 pattern 但不捕獲匹配子表示式,即使是一個非捕獲匹配,不儲存供以後匹配,
   * 這對於用or字符組合模式的情況有用
   * 例: 'industr(?:y|ies)'是對比'industry|industries'更容易閱讀
   * 4. (?=pattern)
   * 它是一個非捕獲匹配,例如'Windows(?=95|98|NT|2000)'匹配'Windows 2000'
   * 中的'Windows',但不匹配'Windows 3.1'中的 Windows
   * 5. (?!pattern)
   * 該表示式匹配不屬於匹配pattern的字串的起點的搜索字串,它是一個非捕獲匹配,例
   * 如'Windows(?!95|98|NT|2000)'匹配'Windows 3.1'中的'Windows',但不
   * 匹配'Windows 2000'中的'Windows'
   */
  public static void main(String[] args) {
    /*
     *
     * String content = "hanspingacc chan53451 nnhan12341500";
     * // 1. 非命名捕獲
     * String regStr = "(\\d\\d)(\\d\\d)";
     * // 2. 命名捕獲
     * String regStr = "(?<one>\\d\\d)(?<two>\\d\\d)";
     * Pattern pattern = Pattern.compile(regStr);
     * Matcher matcher = pattern.matcher(content);
     * while (matcher.find()) {
     * System.out.println("找到: " + matcher.group(0));
     * System.out.println("找到第一組: " + matcher.group(1));
     * System.out.println("找到第二組: " + matcher.group(2));
     * System.out.println("找到名稱第一組: " + matcher.group("one"));
     * System.out.println("找到名稱第二組: " + matcher.group("two"));
     * }
     */

    String content = "台大醫學系 台大資工系 台大政治系";
    // 3. 匹配 pattern 但不捕獲匹配子表示式
    // String regexStr = "台大(?:醫學|資工|政治)系";

    // 4. 滿足分組中的匹配字串
    // String regexStr = "台大(?=醫學|資工)";

    // 5. 不滿足分組中的匹配字串
    String regexStr = "台大(?!醫學|資工)";

    Pattern pattern = Pattern.compile(regexStr);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println("找到: " + matcher.group(0));
      // 3,4,5 接回非捕獲不可使用 group(1) 取得
      // System.out.println("找到: " + matcher.group(1));
    }
  }
}
