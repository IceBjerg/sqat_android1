package hu.mark.dobo.sqat_project;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringTransformTest {

    @Test
    public void charTranslate_EmptyNeptunId_EmptyString() {
        StringTransform transform = new StringTransform("");
        assertEquals("", transform.charTranslate(""));
    }

    @Test
    public void charTranslate_NonEmptyNeptunId_EmptyString() {
        StringTransform transform = new StringTransform("yb5loo");
        assertEquals("", transform.charTranslate(""));
    }

    @Test
    public void charTranslate_EmptyNeptunId_NonEmptyString() {
        StringTransform transform = new StringTransform("");
        assertEquals("apple", transform.charTranslate("apple"));
    }

    @Test
    public void charTranslateEveryCharTransform() {
        StringTransform transform = new StringTransform("yb5loo");
        assertEquals("bb55lloo", transform.charTranslate("yybb55ll"));
    }

    @Test
    public void charTranslateLastCharactersStayTheSame() {
        StringTransform transform = new StringTransform("yb5loo");
        assertEquals("bb55lloooo", transform.charTranslate("yybb55lloo"));
    }

    @Test
    public void charTranslateWithUppercase() {
        StringTransform transform = new StringTransform("yb5loo");
        assertEquals("AlMAB", transform.charTranslate("A5MAY"));
    }

    @Test
    public void sumASCII_EmptyString() {
        StringTransform transform = new StringTransform("");
        assertEquals("0", transform.sumASCII(""));
    }

    @Test
    public void sumASCII_lowercaseA() {
        StringTransform transform = new StringTransform("");
        assertEquals("97", transform.sumASCII("a"));
    }

    @Test
    public void sumASCII_uppercaseA() {
        StringTransform transform = new StringTransform("");
        assertEquals("65", transform.sumASCII("A"));
    }

    @Test
    public void sumASCII_multipleA() {
        StringTransform transform = new StringTransform("");
        assertEquals(Integer.toString(97*5), transform.sumASCII("aaaaa"));
    }

    @Test
    public void sumASCII_newLines() {
        StringTransform transform = new StringTransform("");
        assertEquals(Integer.toString(10*5), transform.sumASCII("\n\n\n\n\n"));
    }




}