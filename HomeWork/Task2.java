package HomeWork;

public class Task2 {

    static boolean reverseString(String str1, String str2) {
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String str1 = "AAACCC";
        String str2 = "CCCAAA";

        if (reverseString(str1, str2))
            System.out.println("Mission Complete :)");
        else
            System.out.println("Mission false :(");
    }
}
