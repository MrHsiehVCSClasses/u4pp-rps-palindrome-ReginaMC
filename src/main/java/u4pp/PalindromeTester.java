package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     * "word" becomes whatever is typed by the user with sc.nextLine()
     */
    public static void execute(Scanner sc) {
        /* YOUR CODE HERE */
    	
    	/* takes in user input in word
    	 * isPalindrome tests if the word is a palindrome
    	 * 
    	 * a while loop will repeat isPalindrome when the user types y or Y to play again
    	 * and another while loop inside checks that the input is valid
    	 * 
    	 */
    	String yesNo = "y";
    	while (yesNo.equals("y") || yesNo.equals("Y")) {
    		String word = "";
    		System.out.println("Palindrome Tester, Enter word: ");
    	
    		word = sc.nextLine();
    		if (isPalindrome(word)== true ) {
    			System.out.println(word + " is a palindrome");
    		}
    		else {
    			System.out.println(word + " is not a palindrome");
    		}
    		System.out.println("Play Again: (y)es or (n)o");
    		yesNo = sc.nextLine();
    		while (!(yesNo.equals("Y") || yesNo.equals("y") 
    				|| yesNo.equals("N") || yesNo.equals("n"))) {
    			System.out.println("Invadid input, try again");
    			yesNo = sc.nextLine();
    		}
    	}
    	System.out.println("Thank you for Playing");
    }
    	

    /**
     * YOUR JAVADOC HERE
     * isPalindrome will check every character of the word/phrase and only test
     *  the letters of the phrase
     *  
     *  then it will check every letter backwards 
     * if the letters equal each other forwards and backwards then it
     * returns true else it returns false
     */
     
    public static boolean isPalindrome(String phrase) {
        /* YOUR CODE HERE */
    	String b = phrase.toLowerCase();
    	int a = phrase.length() - 1;
    	
    	String newPhrase = "";
    	String letter = "";
    	String rightWay = "";
    	boolean b1 = false;
    	boolean b2 = false;
    	for (int i = 0; i <= a; i++) {
    		b2 = Character.isLetter(phrase.charAt(i));
    		letter = b.substring(i, i+1);
    		if (b2 == true) {
    			rightWay += letter; 
    			//System.out.println(rightWay);
    		}
    	}
    	letter = "";
    	for (int i = a; i > -1; i--) {
    		b1 = Character.isLetter(phrase.charAt(i));
    		letter = b.substring(i, i+1);
    		if (b1 == true) {
    			newPhrase += letter; 
    			//System.out.println(newPhrase);
    		}
    	}

    	if (rightWay.equals(newPhrase)) {

    		return true;
    	}
    	else {

    		return false;
    	}
    }

    /* Any helper methods you might need */
}