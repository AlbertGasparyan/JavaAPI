package SeminarWork;

public class s2 {
    public static void main(String[] args) {
        String str = "Hello world";
        StringBuilder builder = new StringBuilder("Hello WORLD ");
    

        
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String: "+(end-begin)+"ms");


        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: "+(end-begin)+"ms");
    }
}