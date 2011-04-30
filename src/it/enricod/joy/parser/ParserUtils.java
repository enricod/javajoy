package it.enricod.joy.parser;

import it.enricod.joy.Pair;

import org.apache.commons.math.util.BigReal;

public class ParserUtils {

	public static Pair<Integer, BigReal> parseNumber(String str, int startIndex) {
		int idx = startIndex;
		StringBuffer buf = new StringBuffer();
		while(str.charAt(idx) != ' ') {
			buf.append(str.charAt(idx));
			idx++;
		}
		return new Pair<Integer, BigReal>( idx++, new BigReal(buf.toString()));
	}
	
	public static Pair<Integer, String> parseWord(String str, int startIndex) {
		int idx = startIndex;
		StringBuffer buf = new StringBuffer();
		while(str.charAt(idx) != ' ') {
			buf.append(str.charAt(idx));
			idx++;
		}
		return new Pair<Integer, String>( idx++, buf.toString());
	}
	
}
