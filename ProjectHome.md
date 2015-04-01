This project started out of a need in our church where we had all our worship lyrics in Microsoft Powerpoint format in a non-unicode font "[tamilbible(bamini)](http://www.tamilchristian.com/tpages/keyboard.html)".

We thought of moving to a worship presentation software called "[openlp](http://www.tamilchristian.com/tpages/keyboard.html)" and hence wanted to standardize all tamil lyrics into unicode. Though there are some [online tools](http://kandupidi.com/converter) to [convert](http://www.suratha.com/reader.htm) non-unicode tamil text to unicode, it was a tedious task for us to convert content from more than 1500 powerpoint/word files into unicode and hence this project born.

Internally it uses the excellent "[Apache Tika](http://tika.apache.org)" library to extract content from various sources like powerpoint, word, odt etc. In fact Apache Tika supports numerous other file formats as well.

To convert non-unicode code to unicode, it currently uses the javascript file from "[kandupidi converter](http://kandupidi.com/converter)".

Currently only "bamini" type fonts are supported.

**Related projects**:

  * [Simple OpenLP Importer](https://code.google.com/p/simpleopenlpimporter) - A utility to import lyrics from text files into openlp database