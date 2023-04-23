import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {

        List<String> verbsArray = new ArrayList<>(Arrays.asList("run", "jump", "sit", "beat", "scoop"));
        List<String> verbingArray = new ArrayList<>(Arrays.asList("squatting", "lifting", "skipping", "pulling", "coming"));
        List<String> adjectiveArray = new ArrayList<>(Arrays.asList("ugly", "fun", "loud", "tasty", "losing"));
        List<String> nounArray = new ArrayList<>(Arrays.asList("tree", "friend", "country", "house", "mother"));
        List<String> occupationArray = new ArrayList<>(Arrays.asList("producer", "carpenter", "senator", "nurse", "marketer"));
        List<String> animalsArray = new ArrayList<>(Arrays.asList("cat", "dog", "ferret", "elephant", "moose"));


        while (true) {
            Scanner scanner = new Scanner(System.in);
            int index;
            String userInput;

            System.out.println("Welcome to Madlibs! If you would like to play, type 'yes'. Otherwise, enter any other key: ");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }

            System.out.println("Please enter a verb, or say 'random': ");
            String verbUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                verbUserInput = verbsArray.get(index);
            } else {
                verbUserInput = userInput;
            }
            System.out.println();

            // 2. Ask the player to enter a verb

            System.out.println("Please enter a verb ending in 'ing', or say 'random': ");
            String verbingUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                verbingUserInput = verbingArray.get(index);
            } else {
                verbingUserInput = userInput;
            }
            System.out.println();
            // 3. Ask the player to enter a verb ending in 'ing'

            System.out.println("Please enter a noun, or say 'random': ");
            String nounUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                nounUserInput = nounArray.get(index);
            } else {
                nounUserInput = userInput;
            }
            System.out.println();
            // 4. Ask the player to enter a noun

            System.out.println("Please enter an adjective, or say 'random': ");
            String adjectiveUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                adjectiveUserInput = adjectiveArray.get(index);
            } else {
                adjectiveUserInput = userInput;
            }
            System.out.println();
            // 5. Ask the player to enter an adjective

            System.out.println("Please enter an occupation, or say 'random': ");
            String occupationUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                occupationUserInput = occupationArray.get(index);
            } else {
                occupationUserInput = userInput;
            }
            System.out.println();
            // 6. Ask the player to enter an occupation

            System.out.println("Please enter an animal, or say 'random': ");
            String animalUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                animalUserInput = animalsArray.get(index);
            } else {
                animalUserInput = userInput;
            }
            System.out.println();
            // 7. Ask the player to enter an animal

            System.out.println("Please enter another adjective, or say 'random': ");
            String secondAdjectiveUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                secondAdjectiveUserInput = adjectiveArray.get(index);
            } else {
                secondAdjectiveUserInput = userInput;
            }
            System.out.println();
            // 8. Ask the player to enter an adjective

            System.out.println("Please enter another verb ending in 'ing', or say 'random': ");
            String secondVerbingUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                secondVerbingUserInput = verbingArray.get(index);
            } else {
                secondVerbingUserInput = userInput;
            }
            System.out.println();
            // 9. Ask the player to enter a verb ending in 'ing'

            System.out.println("Please enter another noun, or say 'random': ");
            String secondNounUserInput;
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("random")) {
                index = new Random().nextInt(5);
                secondNounUserInput = nounArray.get(index);
            } else {
                secondNounUserInput = userInput;
            }
            System.out.println();
            // 10. Ask the player to enter a noun

            // The quotes below have been written as a group of Strings joined together by + signs.
            // The story contains placeholders, indicated by [** **] which you need to replace with
            // the values entered by the player.
            // Note the \n characters represent newlines that move the following text onto the next line

            String quotes = "'My name is " + verbUserInput + "; learn it well, for it`s the " + verbingUserInput + "sound of your " + nounUserInput + ".'\n" +
                    "'I told Killian I`d be " + adjectiveUserInput + ". I wouldn`t want to be a/an " + occupationUserInput + ".'\n" +
                    "'I`m a cybernetic " + animalUserInput + ": living tissue over a/an " + secondAdjectiveUserInput + "endoskeleton.'\n" +
                    "'If things have gone wrong, I`m " + secondAdjectiveUserInput + " myself, and you`ve got a wet " + secondNounUserInput + " wrapped around your head.'\n" +
                    "- Arnold Schwarzenegger";

            // 11. Print the quotes to the console to display the Mad Lib!
            System.out.println(quotes);
            System.out.println();
        }

        /*
         * EXTRA:
         * Create a random word generator to allow the user to let the program
         * select a random word.
         */
    }
}

