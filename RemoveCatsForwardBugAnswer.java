import java.util.*;

public class RemoveCatsForwardBugAnswer {
    public static void main(String[] args) {

        // Does your code look something like this?
        // Does the answer printed match what you expect?
        // What is the problem with this code?
        ArrayList<String> pets = new ArrayList<>(
                Arrays.asList("cat", "cat", "dog", "cat", "cat", "fish")
        );

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).equals("cat")) {
                pets.remove(i);
            }
        }

        System.out.println("Buggy result: " + pets);

        pets = new ArrayList<>(Arrays.asList("cat", "cat", "dog", "cat", "cat", "fish"));

        System.out.println("Fixed result: " + pets);
    }
}

