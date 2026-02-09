import java.util.ArrayList;

public class StandardAlgorithmsAnswer {
    // Algorithm 1: Find Min (Same thing for Max)
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for (Integer num : arr){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    // Algorithm 2: Find Average
    public static double findAvg(ArrayList<Integer> arr){
        // first find sum by adding all elements 
        int sum = 0;
        for (Integer num : arr){
            sum += num;
        }
        // then calculate for avg in double
        return (double) sum / arr.size();
    }

    // Algorithm 3: mode of elements
    public static int findMode(ArrayList<Integer> arr){
        int maxCount = 0;
        int modeValue = arr.get(0);

        for (int i = 0; i < arr.size(); i++){
            int count = 0; // reset each i!!!   
            for (int j = 0; j < arr.size(); j++){
                if (arr.get(i).equals(arr.get(j))){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                modeValue = arr.get(i);
            }
        }
        return modeValue;
    }

    // Algorithm 4: Search for a particular element in the array
    // This method will return the index of the
    // first element found in the array that is an even number
    public static int searchOne(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            // unboxing
            if (arr.get(i) % 2 == 0){
                return i;
            }
        }
        return -1;
    }


    // Algorithm 5: Determine if all elements have a particular property
    // This method returns true if all elements are negative
    public static boolean allNegative(ArrayList<Integer> arr){
    for (Integer num : arr){
        if (num >= 0){   // remember to include "=" because 0 is NOT negative
            return false;
        }
    }
    return true;
}


    // Algorithm 6: Count all consecutive pairs of elements
    // This method returns the number of consecutive pairs
    // For example: [2,3,3,1,1,3,2,2] has three consecutive pairs
    public static int countConsecutivePairs(ArrayList<Integer> arr){
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++){
            if (arr.get(i).equals(arr.get(i + 1))){
                count += 1;
            }
        }
        return count;
    }


    // Algorithm 7: Determine the presence or absence of duplicate elements
    // This method returns ture if the if there are duplicated elements
    // for example: [1,2,3,1] -> true, 1 is duplicated
    public static boolean hasDuplicates(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size() - 1; i++){
            for (int j = i + 1; j < arr.size(); j++){
                if (arr.get(i).equals(arr.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

    // Algorithm 8: Determine the number of elements meeting specific criteria
    // This method counts how many of the String-type elements in the ArrayList 
    // starts with the letter "a"
    // Pre-condition: Assume all elements have at least one character!
    // For example: ["app", "banana", "audio", "bear"] -> 2
    public static int firstLetterA(ArrayList<String> arr)
    {
        int count = 0;
        for (String str : arr ){
            if (str.substring(0,1).equals("a")){
                count ++;
            }
        }
        return count;
    }

    
    // Algorithm 9: Shift or rotate elements left
    // For example: [1,2,3,4,5] -> [2,3,4,5,1]
    public static void shiftLeft(ArrayList<Integer> arr){
        int first = arr.get(0);
        for (int i = 1; i < arr.size(); i++){
            arr.set(i-1,  arr.get(i));
        }
        arr.set(arr.size()-1,  first);
    }


    // Algorithm 9.5: Shift or rotate elements right
    // For example: [1,2,3,4,5] -> [5,1,2,3,4]
    public static void shiftRight(ArrayList<Integer> arr){
        int last = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i++){
            arr.set(i + 1, arr.get(i));
        }
        arr.set(0, last);
    }



    // Algorithm 10: Reverse the order of the elements
    // For example: ["a", "b", "c", "d"] -> ["d", "c", "b", "a"]
    public static void reverse(ArrayList<String> arr){
        for (int i = 0; i < arr.size() / 2; i++){
            String first = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, first);
        }
    }
}
