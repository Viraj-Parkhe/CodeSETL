package setl.code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import syntaxhighlighter.brush.Brush;
import syntaxhighlighter.brush.HTMLScriptRegExp;
import syntaxhighlighter.brush.RegExpRule;

/**
 * Java brush.
 * @author Viraj Parkhe
 */
public class BrushJava extends Brush {

  public BrushJava() {
    super();

    String keywords = "abstract assert boolean break byte case catch char class const "
            + "continue default do double else enum extends "
            + "false final finally float for goto if implements import "
            + "instanceof int interface long native new null "
            + "package private protected public return "
            + "short static strictfp super switch synchronized this throw throws true "
            + "transient try void volatile while";

    List<RegExpRule> _regExpRuleList = new ArrayList<RegExpRule>();
    _regExpRuleList.add(new RegExpRule(RegExpRule.singleLineCComments, "comments")); // one line comments
    _regExpRuleList.add(new RegExpRule("\\/\\*([^\\*][\\s\\S]*?)?\\*\\/", Pattern.MULTILINE, "comments")); // multiline comments
    _regExpRuleList.add(new RegExpRule("\\/\\*(?!\\*\\/)\\*[\\s\\S]*?\\*\\/", Pattern.MULTILINE, "preprocessor")); // documentation comments
    _regExpRuleList.add(new RegExpRule(RegExpRule.doubleQuotedString, "string")); // strings
    _regExpRuleList.add(new RegExpRule(RegExpRule.singleQuotedString, "string")); // strings
    _regExpRuleList.add(new RegExpRule("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b", Pattern.CASE_INSENSITIVE, "value")); // numbers
    _regExpRuleList.add(new RegExpRule("(?!\\@interface\\b)\\@[\\$\\w]+\\b", "color1")); // annotation @anno
    _regExpRuleList.add(new RegExpRule("\\@interface\\b", "color2")); // @interface keyword
    _regExpRuleList.add(new RegExpRule(getKeywords(keywords), Pattern.MULTILINE, "keyword")); // java keyword
    _regExpRuleList.add(new RegExpRule("[}{]", "brackets")); 
    //_regExpRuleList.add(new RegExpRule("{", "brackets"));
    _regExpRuleList.add(new RegExpRule("[()]", "bracketsr"));
    _regExpRuleList.add(new RegExpRule("^\\w*.", "variable"));
    //_regExpRuleList.add(new RegExpRule(")", "bracketsr")); 
    setRegExpRuleList(_regExpRuleList);

    setHTMLScriptRegExp(new HTMLScriptRegExp("(?:&lt;|<)%[@!=]?", "%(?:&gt;|>)"));

    setCommonFileExtensionList(Arrays.asList("java"));
  }
}
