package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */
	static String playerHand =""; 
	static String computerHand = "";
	static double computerCH;
	static double playerCH;
	static int wins = 0;
	static int losses = 0;
	static int ties = 0;
	static String playButton = "Y";
    /**
     * JAVADOC HERE
     * 
     * play takes in input for the user choice 
     * or will randomly choose if "any" is the input 
     * and chooses at random, r, p, or s with Math.random for the computer choice
     * the user input and random choice is used in results method
     * then prints the number of wins, losses, and ties
     * play will loop as long as playbutton = y or Y (determined from input from the user)
     * if the user chooses n or N then the method will print "Thank You for Playing" and end 
     * other 
     */
    public static void play(Scanner sc) {
        /* YOUR CODE HERE */
    	while (playButton.equals("Y") || playButton.equals("y")) {
    		String player =""; 
    		System.out.println("Choose: Rock, Paper, Scissors");
			System.out.println("Select R, P, S, or Any");
    		playerHand = sc.nextLine();
    		player = playerHand.toLowerCase();

    		while (!(player.equals("r")|| player.equals("p")||
    				player.equals("s") || player.equals("any"))) {
    			System.out.println("Invalid input");
    			System.out.println("Choose: Rock, Paper, Scissors");
    			System.out.println("Select R, P, S, or Any");
        		playerHand = sc.nextLine();
        		player = playerHand.toLowerCase();
    		}

    			if (player.equals("any")) {
    				playerCH = (int)(Math.random()*3 + 1);
    				if (playerCH == 1.0) {
    					player = "r";
    				}
    				else if (playerCH == 2.0) {
    					player = "p";
    				}
    				else if  (playerCH == 3.0) {
    					player = "s";
    				}			
    	}
    		System.out.println("You Picked " + player);
    	
    		computerCH = (int)(Math.random()*3) +1;
    		if (computerCH == 1.0) {
    			computerHand = "r";
    		}
    		else if (computerCH == 2.0) {
    			computerHand = "p";
    		}
    		else if (computerCH == 3.0) {
    			computerHand = "s";
    		}
    		
    		results(player, computerHand);
    		System.out.println("WINS: " + wins + ", LOSSES: " + losses + ", TIES: " + ties);
    	
    		System.out.println("Play Again: (Y)es or (N)o");
    		playButton = sc.nextLine();
    		while (!(playButton.equals("Y") || playButton.equals("y") 
    				|| playButton.equals("N") || playButton.equals("n"))) {
    			System.out.println("Invalid input");
    			System.out.println("       (°ロ°)☝    ☜(˚▽˚)☞     ರ_ರ");
    			System.out.println("Play Again: (Y)es or (N)o");
    			playButton = sc.nextLine();
    		}
    	}
    	System.out.println("(~˘▾˘)~ Thank you for Playing ~(˘▾˘~)");
    	System.out.println("        ｡◕‿‿◕｡  \\ (•◡•) /");
    }


    /**
     * JAVADOC HERE 
     *  the results method compares the user input and random choice to determine where the user 
     *  wins, loses, or ties
     *  based on the result the method will print a certain phrase, add 1 to a certain variable,
     *  and return a certain value 
     * 
     */
  public static int results(String playerChoice, String computerChoice) {
        /* YOUR CODE HERE */

	  System.out.println("Computer chose " + computerChoice);
	  if (playerChoice.equals(computerChoice)) {
		  ties ++;
		  System.out.println("You tied");
		  System.out.println("       〆(・∀・＠)");
		  return 0;
	  }    
	  else if ((playerChoice.equals("r") && computerChoice.equals("s") || 
			  (playerChoice.equals("p") && computerChoice.equals("r")) || 
			  (playerChoice.equals("s")  && computerChoice.equals("p")))) {
		  wins ++;
		  System.out.println("You won");
		  System.out.println("       ᕦ(ò_óˇ)ᕤ  (─‿‿─)");
		  return 1;
	  }
	  else {
		  System.out.println("You lost");
		  System.out.println("       ¯\\_(ツ)_/¯");
		  losses ++;
		  return -1;
	  }
  }
 
	
	
    /* any helper methods you might need */
  
}