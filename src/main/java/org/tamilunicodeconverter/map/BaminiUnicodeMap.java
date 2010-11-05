package org.tamilunicodeconverter.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaminiUnicodeMap
{
	public static final String MAP_FILE = "bamini.txt";
	private static final Logger logger = LoggerFactory
			.getLogger(BaminiUnicodeMap.class);
	private static Map<String, String> map = new LinkedHashMap<String, String>();

	static {
		URL url = ClassLoader.getSystemClassLoader().getResource(MAP_FILE);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					FileUtils.toFile(url)));
			String line = "";
			while ((line = reader.readLine()) != null) {
				if(line.contains("=")) {
					String[] tokens = StringUtils.split(line, "=");
					if(tokens.length == 2) {
						map.put(tokens[0], tokens[1]);
					}
				}
			}
			
		} catch (Exception ex) {
			logger.error(
					"Error occured while reading the file " + url.getFile(), ex);
		}
	}

	public static Map<String, String> getMap()
	{
		return map;
	}
}
