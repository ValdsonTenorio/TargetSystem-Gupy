public class Exec5 {

    public static String reverter(String str2){

        char[] chars = str2.toCharArray();

        for (int i = 0; i < chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str1 = "Oi tudo bem";
        String str2 = reverter(str1);
        System.out.println("String inversa: "+str2);
    }
}
