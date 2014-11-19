package setl.code;


import java.awt.Color;
import java.awt.Font;
import syntaxhighlight.Style;
import syntaxhighlight.Theme;

/**
 * Django theme.
 * @author Viraj Parkhe
 */
public class ThemeDjango extends Theme {

  public ThemeDjango() {
    super();

    setFont(new Font("Consolas", Font.PLAIN, 12));
    setBackground(Color.decode("0x0a2b1d"));

    setHighlightedBackground(Color.decode("0x233729"));

    setGutterText(Color.decode("0x497958"));
    setGutterBorderColor(Color.decode("0x41a83e"));
    setGutterBorderWidth(3);
    setGutterTextFont(new Font("Verdana", Font.PLAIN, 11));
    setGutterTextPaddingLeft(7);
    setGutterTextPaddingRight(7);

    Style style = new Style();
    style.setBold(true);
    addStyle("bold", style);

    style = new Style();
    style.setColor(Color.decode("0xf8f8f8"));
    addStyle("plain", style);
    setPlain(style);

    style = new Style();
    style.setItalic(true);
    style.setColor(Color.BLACK);
    addStyle("comments", style);

    style = new Style();
    style.setColor(Color.decode("0x9df39f"));
    addStyle("string", style);

    style = new Style();
    style.setBold(true);
    style.setColor(Color.magenta);
    addStyle("keyword", style);

    style = new Style();
    style.setColor(Color.pink);
    addStyle("preprocessor", style);

    style = new Style();
    style.setColor(Color.BLUE);
    addStyle("variable", style);

    style = new Style();
    style.setColor(Color.CYAN);
    addStyle("value", style);

    style = new Style();
    style.setColor(Color.GRAY);
    addStyle("functions", style);
    style = new Style();
    style.setColor(Color.GREEN);
    addStyle("brackets", style);
    style = new Style();
    style.setColor(Color.BLACK);
    addStyle("bracketsr", style);

    style = new Style();
    style.setColor(Color.blue);
    addStyle("constants", style);

    style = new Style();
    style.setBold(true);
    style.setColor(Color.blue);
    addStyle("script", style);

    style = new Style();
    addStyle("scriptBackground", style);

    style = new Style();
    style.setColor(Color.BLACK);
    addStyle("color1", style);

    style = new Style();
    style.setColor(Color.RED);
    addStyle("color2", style);
    style = new Style();
    style.setColor(Color.YELLOW);
    addStyle("string", style);

    style = new Style();
    style.setColor(Color.decode("0xedef7d"));
    addStyle("color3", style);
  }
}
