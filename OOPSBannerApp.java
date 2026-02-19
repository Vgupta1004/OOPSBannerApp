/**
* Printing OOPS Banner using Array and Inline Array Initialization
*
* @author Developer
* @version 5.0
*/

class OOPSBannerArray{
	public static void main(String args[]){
		String arr[] = {String.join(" ","  ***  ","  ***  ","****  ","  ***** "), String.join(" "," ** ** "," ** ** ","**  **"," **   **"), String.join(" ","**   **","**   **","**  **","**      "), String.join(" ","**   **","**   **","****  ","  ***** "), String.join(" ","**   **","**   **","**    ","      **"), String.join(" "," ** ** "," ** ** ","**    ","**   ** "), String.join(" ","  ***  ","  ***  ","**    "," *****  ");}
		System.out.println();
		for(String s:arr){
			System.out.println(s);
		}
	}
}
