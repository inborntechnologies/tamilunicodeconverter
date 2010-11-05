/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tamilunicodeconverter;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author James Selvakumar
 */
public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		// source file
		System.out.println("Enter the source file or directory: ");
		String sourceFilePath = keyboard.next();

		// output dir
		System.out.println("Enter the output directory: ");
		String outputDir = keyboard.next();
		
		// auto create file names
		System.out.println("Automatically create output file names based on content? (True|False): ");
		boolean createOutputFileName = keyboard.nextBoolean();

		if (StringUtils.isNotBlank(sourceFilePath)
				&& StringUtils.isNotBlank(outputDir)) {
			new TamilUnicodeConverter(createOutputFileName).convert(new File(sourceFilePath),
					new File(outputDir));
		} else {
			System.out.println("Both source and output dir are mandatory. Please run the program again.");
		}
	}
}
