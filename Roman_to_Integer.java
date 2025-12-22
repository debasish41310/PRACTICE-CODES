public class Roman_to_Integer {
    public static int romanToInt(String s) {
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = values[s.charAt(i)];

            if (i + 1 < s.length() && current < values[s.charAt(i + 1)]) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s1)); // 3
        System.out.println(romanToInt(s2)); // 58
        System.out.println(romanToInt(s3)); // 1994
    }
}
