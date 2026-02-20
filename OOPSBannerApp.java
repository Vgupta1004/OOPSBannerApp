
/**
 * Creates a HashMap containing ASCII art patterns for supported characters.
 *
 * Each character is mapped to an array of strings where each string represents
 * one line of the characters's ASCII art pattern. All patterns are assumed to have
 * the same height.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.*;

class OOPSBannerArray{
	
	public static HashMap<Character,String[]> createCharMap(){
		
		HashMap<Character,String[]> charMap = new HashMap<>();
		
		charMap.put('O',new String[] {
			"  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
		});
		
		charMap.put('P',new String[] {
			"****  ",
			"**  **",
			"**  **",
			"****  ",
			"**    ",
			"**    ",
			"**    "
		});
		
		charMap.put('S',new String[] {
			"  ***** ",
			" **   **",
			"**      ",
			"  ***** ",
			"      **",
			"**   ** ",
			" *****  "
		});
		
		return charMap;
	}
	
	public static void dispBanner(String msg, HashMap<Character,String[]> charMap){
		
		String del = "  ";
		StringBuilder sb[] = new StringBuilder[7];
		int h = charMap.get('O').length;
		for (int i=0;i<msg.length();i++){
			String[] pat = charMap.get(msg.charAt(i));
			for(int r = 0;r<h;r++){
				sb[r].append(pat[r]);
			}
			if(i<msg.length() - 1){
				for (int r=0; r<h;r++) sb[r].append(del);
			}
		}
		
		for(int r = 0; r<h; r++){
			System.out.println(sb[r]);
		}
	}
		
	
	
	public static void main(String args[]){
		String word = "OOPS";
		HashMap<Character, String[]> charMap = createCharMap();
		dispBanner(word,charMap);
	}
}