package HomeWork;

public class Task3 {
    
    public static void reverString(String text, int index) {
        if(index==0){ 
            System.out.println(text.charAt(index));
            return;}
        
        System.out.print(text.charAt(index));
        reverString(text, index-1);
    }
    
    
    
    public static void main(String[] args) {
        String text = "Revers";
        System.out.println(text);

        if(text.length()>0){
            reverString(text, text.length()-1);
        }
    }
}
