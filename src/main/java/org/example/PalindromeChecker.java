package org.example;

/**
 * @author pashtet
 */
public class PalindromeChecker {

    public boolean checkCycle(String inputString) {
        if (inputString.isEmpty()) return true;
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) return false;
        }
        return true;
    }

    public boolean checkRecursion(String inputString) {
        if (inputString.isEmpty()) {
            return true;
        } else {
            return inputString.length() == 1 ||
                    (inputString.charAt(0) == inputString.charAt(inputString.length() - 1) &&
                            checkRecursion(inputString.substring(1, inputString.length() - 1)));
        }
    }
}
