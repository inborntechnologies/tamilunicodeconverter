/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tamilunicodeconverter.extractor;

import java.io.File;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.tamilunicodeconverter.extractor.ContentExtractor;

import static org.junit.Assert.*;

/**
 *
 * @author james
 */
public class ContentExtractorTest
{
    public final String PPT_DIR = "src/test/resources/ppt";
    private ContentExtractor contentExtractor = ContentExtractor.get();

    public ContentExtractorTest()
    {
    }

    @Test
    public void testExtract()
    {
        File file = new File(PPT_DIR, "A-001.PPT");
        String result = contentExtractor.getContent(file);
        assert StringUtils.isNotBlank(result);
        System.out.println("Content:\n" + result);
    }
}
