public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("resignation", ""));
        System.out.println(contains("baba yaga", "baba"));

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char bletters [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char sletters [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0 ; j < bletters.length; j++) {
                if (str.charAt(i) == bletters[j]) {
                    str = str.replace(str.charAt(i),sletters[j]);
                }
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        if (str2.length() > str1.length() || str1.indexOf(str2.charAt(0)) == -1) {
            return false;
        }
        int index2 = str1.indexOf(str2.charAt(0));
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str1.charAt(index2)) {
                return false;
            }
            index2++;
         
    }
    return true;
}
}
