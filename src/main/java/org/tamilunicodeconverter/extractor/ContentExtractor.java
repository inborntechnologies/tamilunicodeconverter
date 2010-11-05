/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tamilunicodeconverter.extractor;

import java.io.File;
import org.apache.commons.lang.UnhandledException;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.utils.ParseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author James Selvakumar
 */
public class ContentExtractor
{
    private static final Logger logger = LoggerFactory.getLogger(ContentExtractor.class);
    private static ContentExtractor instance;

    private ContentExtractor()
    {
    }

    public static ContentExtractor get()
    {
        if (instance == null) {
            instance = new ContentExtractor();
        }
        return instance;
    }

    public String getContent(File file)
    {
        String content = "";
        try {
            TikaConfig config = TikaConfig.getDefaultConfig();
            content = ParseUtils.getStringContent(file, config);
        } catch (Exception ex) {
            throw new UnhandledException("Error occured while extracting content from the file " + file, ex);
        }
        return content;
    }
}
