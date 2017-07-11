package com.omar.util;

import java.io.IOException;
import java.io.Writer;

public class CSVUtils {
	 private static final char DEFAULT_SEPARATOR = ',';

	    public void writeLine(Writer w, String values) throws IOException {
	        writeLine(w, values, DEFAULT_SEPARATOR, ' ');
	    }

	    public static void writeLine(Writer w, String values, char separators) throws IOException {
	        writeLine(w, values, separators, ' ');
	    }

	    public static void writeLine(Writer w, String values, char separators, char customQuote) throws IOException {
	        StringBuilder sb = new StringBuilder();
	        sb.append(values);
	        sb.append("\n");
	        w.append(sb.toString());

	    }

}
