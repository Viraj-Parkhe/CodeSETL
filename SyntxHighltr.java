package setl.code;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushXml;



public class SyntxHighltr {
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {

	      @Override
	      public void run() {
	        // the SyntaxHighlighter parser
	        SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushXml());
	        // turn HTML script on
	        parser.setHtmlScript(true);
	        // turining java script on
	        parser.setBrush(new BrushJava());
	       
	        // set HTML Script brushes
	     //  parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJScript(), new BrushPhp()));
	       
	        // initialize the highlighter and using a  theme
	        SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeDjango());
	        //setting the starting line number
	        highlighter.setFirstLine(1);
	        // set to highlight line 3, 10, 20
	        highlighter.setHighlightedLineList(Arrays.asList(3,10,20));
	        try {
	          highlighter.setContent(new File("test_java.java"));
	        } catch (IOException ex) {
	        ex.printStackTrace();
	        }

	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setContentPane(highlighter);
	        frame.setLocationByPlatform(true);
	        frame.pack();
	        frame.setVisible(true);
	      }
	    });
	  }
}
