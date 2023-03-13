package HomeWork;

public class Task5 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        String plus = "равно";
        long begin = System.currentTimeMillis();

        StringBuilder text = new StringBuilder();
        text.append(String.format("%d + %d = %d\n", num1,num2,num1+num2));
        text.append(String.format("%d * %d = %d\n", num1,num2,num1*num2));
        text.append(String.format("%d - %d = %d\n", num1,num2,num1-num2));
        text.append(String.format("%d / %d = %d\n", num1,num2,num1/num2));
        long end = System.currentTimeMillis();
        System.out.println(text.toString().replaceAll("=", "равно"));
        System.out.println(end-begin+"ms");
    }
}
