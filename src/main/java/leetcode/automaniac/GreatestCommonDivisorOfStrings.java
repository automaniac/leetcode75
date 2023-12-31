package leetcode.automaniac;

public class GreatestCommonDivisorOfStrings {
    String smallerString = "";
    String biggerString = "";

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        return str1.substring(0, greatestCommonDivisor(str1.length(), str2.length()));
    }

    public int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

}
