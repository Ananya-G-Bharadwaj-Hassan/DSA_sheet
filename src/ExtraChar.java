import java.util.Arrays;

class ExtraChar {
    public static char extraChar(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return c2[i];
            }
        }
        return c2[c2.length - 1];
    }
}
