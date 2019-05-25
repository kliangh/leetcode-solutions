package code.kliangh.util;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.util.*;

public class InputUtils {

    public static List collectScannerInputToList(Scanner scanner) {
        List<String> inputs = new ArrayList<>();

        return retrieveInputsFromScanner(scanner, inputs);
    }

    public static List collectBufferedReaderInputToList(BufferedReader bufferedReader) {
        return Collections.emptyList();
    }

    public static List collectMainArgsToList(String[] args) {
        return Arrays.asList(args);
    }

    public static List splitStringIntoList(String input, char separator) {
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
