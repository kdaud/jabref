package net.sf.jabref.exporter.layout.format;

import static org.junit.Assert.*;

import net.sf.jabref.Globals;
import org.junit.Test;


public class RisKeywordsTest {

    @Test
    public void testEmpty() {
        assertEquals("", new RisKeywords().format(""));
    }

    @Test
    public void testNull() {
        assertEquals("", new RisKeywords().format(null));
    }

    @Test
    public void testSingleKeyword() {
        assertEquals("KW  - abcd", new RisKeywords().format("abcd"));
    }

    @Test
    public void testTwoKeywords() {
        assertEquals("KW  - abcd" + Globals.NEWLINE + "KW  - efg", new RisKeywords().format("abcd, efg"));
    }

}
