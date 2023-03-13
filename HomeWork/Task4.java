package HomeWork;

public class Task4 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;

        StringBuilder text = new StringBuilder();
        text.append(String.format("%d + %d = %d\n", num1,num2,num1+num2));
        text.append(String.format("%d * %d = %d\n", num1,num2,num1*num2));
        text.append(String.format("%d - %d = %d\n", num1,num2,num1-num2));
        text.append(String.format("%d / %d = %d\n", num1,num2,num1/num2));
        System.out.println(text);
    }
}
