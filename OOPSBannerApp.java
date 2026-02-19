
/**
 * Printing OOPS Banner using Arrays and Loops (UC7: Nested Class + String[] Patterns)
 * A program that stores each letter as a 7-line String[] and
 * renders a word by concatenating corresponding rows.
 *
 * @author Developer
 * @version 7.0
 */




class OOPSBannerArray{
	
	static class Patterns{
		
		static String[] O = {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };
		
		static String[] P = {
			"****  ",
			"**  **",
			"**  **",
			"****  ",
			"**    ",
			"**    ",
			"**    "
		};
		
		static String[] S = {
			"  ***** ",
			" **   **",
			"**      ",
			"  ***** ",
			"      **",
			"**   ** ",
			" *****  "
		};
		
		static String[] get(char c){
			switch (Character.toUpperCase(c)){
				case 'O':
					return O;
				case 'P':
					return P;
				case 'S':
					return S;
				default:
					return new String[] {
						"       ",
						"       ",
						"       ",
						"       ",
						"       ",
						"       ",
						"       "
					};
			}
		}		
	}
	
	public static void main(String args[]){
		String word = "OOPS";
		String del = "  ";
		StringBuilder rows[] = new StringBuilder[7];
		for (int i = 0; i < 7; i++) rows[i] = new StringBuilder();
		
		
		for (int i = 0; i < word.length(); i++) {
            String[] pat = Patterns.get(word.charAt(i));
            for (int r = 0; r < 7; r++) {
                rows[r].append(pat[r]);
            }
            if (i < word.length() - 1) {
                for (int r = 0; r < 7; r++) rows[r].append(del);
            }
        }
		
		
		for (int r = 0; r < 7; r++) {
            System.out.println(rows[r]);
        }	
	}
}