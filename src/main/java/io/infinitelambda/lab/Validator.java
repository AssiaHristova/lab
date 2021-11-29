package io.infinitelambda.lab;

public interface Validator {
    static boolean validateParameters(String[] args) {
        if (args.length == 0 || args.length > 2) {
            throw new IllegalArgumentException("Not enough parameters");
        }
        return true;
    }
}
