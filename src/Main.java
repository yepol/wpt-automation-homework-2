public class Main {

    public static void main(String[] args) {
        // Input strings
        String usdt = "25,287 USDT";
        String btc = "546,888098761 BTC";
        String xrp = "975,287 XRP";
        String usd = "5,1 USD";

        // Extract numeric values from input strings using regular expressions
        double usdtNum = extractNumericValue(usdt);
        double btcNum = extractNumericValue(btc);
        double xrpNum = extractNumericValue(xrp);
        double usdNum = extractNumericValue(usd);

        System.out.println("----------------");
        System.out.println("usdtNum: " + usdtNum);
        System.out.println("btcNum: " + btcNum);
        System.out.println("xrpNum: " + xrpNum);
        System.out.println("usdNum: " + usdNum);
        System.out.println("----------------");

        // Calculate average of numeric values
        double average = (usdtNum + btcNum + xrpNum + usdNum) / 4;
        System.out.println("Average value: " + average);

        // Convert average value to a string
        String averageString = Double.toString(average);
        System.out.println("Average value as string: " + averageString);
        System.out.println("----------------");

        // Extract integer values from average value string using extractIntValue method
        int intValue = extractIntValue(averageString, 0, 9);

        // Output integer values
        System.out.println("Int value: " + intValue);
    }

    // Helper method to extract numeric value from a string using regular expressions
    private static double extractNumericValue(String input) {
        // Use regular expression to match all digits and decimal points
        String numericString = input.replaceAll(",", ".").replaceAll("[A-Za-z\\s]+", "");
        // Convert resulting string to a double and return
        return Double.parseDouble(numericString);
    }

    // Helper method to extract integer value from a string using substring
    private static int extractIntValue(String input, int startIndex, int endIndex) {
        String intString = input.replace(".", "").substring(startIndex, Math.min(endIndex, input.length()));
        return Integer.parseInt(intString);
    }
}