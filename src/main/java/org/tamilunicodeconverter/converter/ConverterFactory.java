/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tamilunicodeconverter.converter;


/**
 *
 * @author James Selvakumar
 */
public class ConverterFactory
{
    public static IUnicodeConverter getConverter()
    {
        return new BaminiConverter();
    }
}
