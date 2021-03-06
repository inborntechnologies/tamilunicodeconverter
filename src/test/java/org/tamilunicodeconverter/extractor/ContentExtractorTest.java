/*
 * Licensed to the http://code.google.com/p/tamilunicodeconverter under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tamilunicodeconverter.extractor;

import java.io.File;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.tamilunicodeconverter.extractor.ContentExtractor;

import static org.junit.Assert.*;

/**
 *
 * @author James Selvakumar
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
