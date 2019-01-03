public class FizzBuzz {
    public static String of(int i) {
        if (i == 0)
            return "0";

        return _of(i);
    }

    private static String _of(int i) {
        String output = "";
        if (i % 3 == 0)
            output += "Fizz";
        if (i % 5 == 0)
            output += "Buzz";

        return !output.isEmpty() ? output : String.valueOf(i);
    }
}
