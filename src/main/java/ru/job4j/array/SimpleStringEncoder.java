package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        int counter = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 == input.length()) {
                result.append(input.charAt(i));

                if (counter > 1) {
                    result.append(counter);
                }
                break;
            }

            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                result.append(input.charAt(i));

                if (counter > 1) {
                    result.append(counter);
                }

                counter = 1;
            }

        }
        return result.toString();
    }
}
