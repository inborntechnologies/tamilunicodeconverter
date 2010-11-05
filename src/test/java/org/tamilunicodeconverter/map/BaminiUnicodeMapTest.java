package org.tamilunicodeconverter.map;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class BaminiUnicodeMapTest
{
	private Map<String, String> map = BaminiUnicodeMap.getMap();

	@Test
	public void testPrintAllEntries()
	{
		for (String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
	}

	@Test
	public void testChars()
	{
		assertEquals("ரி", map.get("hp"));
		assertEquals("க", map.get("f"));
		assertEquals("கௌ", map.get("nfs"));
		assertEquals("ஷே", map.get("N\\"));
	}

	@Test
	public void testBaminiWord_1()
	{
		String input = "uh[h";
		String expected = "ராஜா";
		String unicodeText = input;
		for (String key : map.keySet()) {
			unicodeText = unicodeText.replace(key, map.get(key));
		}
		System.out.println("Input text: " + input + ", Unicode text: "
				+ unicodeText);
		assertEquals(expected, unicodeText);
	}
}
