/**
* Printing OOPS Banner using static functions for each letter
*
* @author Developer
* @version 6.0
*/

class OOPSBannerArray{
	public static String[] getO(){
		return new String[] {
			"  ***  ",
			" ** ** ",
			"**   **",
			"**   **",
			"**   **",
			" ** ** ",
			"  ***  "
		};
	}
	
	public static String[] getP(){
		return new String[] {
			"****  ",
			"**  **",
			"**  **",
			"****  ",
			"**    ",
			"**    ",
			"**    "			
		};
	}
	
	public static String[] getS(){
		return new String[] {
			"  ***** ",
			" **   **",
			"**      ",
			"  ***** ",
			"      **",
			"**   ** ",
			" *****  "
		};
	}
	
	public static void main(String args[]){
		System.out.println();
		for(int i=0; i<getO().length;i++){
			System.out.println(String.join(" ",getO()[i],getO()[i],getP()[i],getS()[i]));
		}
	}
}
