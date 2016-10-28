package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author Alex Baker
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        String tweet;
        //tweet is now a declared as a string
        tweet = scan.nextLine();
        //this line asks the user for input
        System.out.println(tweet.length());
        //It prints the number of characters, regardless of type.--This includes spaces, commas, brackets, numbers, letters, etc.
        
        if(tweet.length() > 140)
        {
            System.out.println("Please shorten your message. Try removing any unnecessary content.");
        }
    }
    
}
