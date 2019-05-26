package code.kliangh.util;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputUtils {

    public static List collectScannerInput(Scanner scanner) {
        List<String> inputs = new ArrayList<>();

        return retrieveInputsFromScanner(scanner, inputs);
    }

    public static List collectBufferedReaderInput(BufferedReader bufferedReader) {
        List<String> inputs = new ArrayList<>();
        String input;

        try (BufferedReader autoCloseableBufferedReader = bufferedReader) {
            do {
                input = autoCloseableBufferedReader.readLine();
                inputs.add(input);

            } while (StringUtils.isNotBlank(input) && !"\r\n".equals(input));
        } catch (IOException e) {
            System.out.println();
        } finally {
            return inputs;
        }
    }

    public static List collectMainArgs(String[] args) {
        return Arrays.asList(args);
    }

    public static List splitString(String input, char separator) {
        return Arrays.asList(StringUtils.split(input, separator));
    }


    /*
     * Tail recursion method to retrieve input from scanner
     */
    private static List retrieveInputsFromScanner(Scanner scanner, List result) {
        String input = scanner.nextLine();

        if (StringUtils.isNotBlank(input) && !"\r\n".equals(input)) {
            result.add(input);
        } else {
            return result;
        }

        return retrieveInputsFromScanner(scanner, result);
    }
}
