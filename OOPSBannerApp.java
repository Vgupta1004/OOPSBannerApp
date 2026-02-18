/**
* Printing OOPS Banner using Arrays and Loops
* @author Developer
* @version 4.0
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