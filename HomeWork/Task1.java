package HomeWork;

public class Task1 {
    public static void main(String[] args) {
        String text = "qwertyuiop";

        CharSequence seq = "q";
        boolean bool = text.contains(seq);
        System.out.println("Search 'q': " + bool);

        boolean sqFound = text.contains("a");
        System.out.println("Search 'a': " + sqFound);
    }
}
