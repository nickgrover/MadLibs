import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {

        // 2. Ask the player to enter a verb

        // 3. Ask the player to enter a verb ending in 'ing'

        // 4. Ask the player to enter a noun

        // 5. Ask the player to enter an adjective

        // 6. Ask the player to enter an occupation

        // 7. Ask the player to enter an animal

        // 8. Ask the player to enter an adjective

        // 9. Ask the player to enter a verb ending in 'ing'

        // 10. Ask the player to enter a noun

        // The quotes below have been written as a group of Strings joined together by + signs.
        // The story contains placeholders, indicated by [** **] which you need to replace with
        // the values entered by the player.
        // Note the \n characters represent newlines that move the following text onto the next line

        String quotes = "'My name is [** 2. Verb **]; learn it well, for it`s the [** 3. Verb-ing **] sound of your [** 4. noun **].'\n" +
                "'I told Killian I`d be [** 5. Adjective **]. I wouldn`t want to be a/an [** 6. Occupation **].'\n" +
                "'I`m a cybernetic [** 7. animal **]: living tissue over a/an [** 8. adjective **] endoskeleton.'\n" +
                "'If things have gone wrong, I`m [** 9. adjective **] myself, and you`ve got a wet [** 10. noun **] wrapped around your head.'\n" +
                "- Arnold Schwarzenegger";

        // 11. Print the quotes to the console to display the Mad Lib!
        System.out.println(quotes);

        /*
         * EXTRA:
         * Create a random word generator to allow the user to let the program
         * select a random word.
         */
    }
}

