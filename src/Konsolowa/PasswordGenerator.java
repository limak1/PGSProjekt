package Konsolowa;


import java.util.Random;

public class PasswordGenerator {

    private final static String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
    private final static String bigLetters = smallLetters.toUpperCase();//toUpperCase zamienia poszczególne litery na duże
    private final static String specialSigns = "!@#$%^&-+_<>";
    private final static String numbers = "1234567890";



    public static String generate(int length){
        String result = "";
        String allStrings = smallLetters+bigLetters+specialSigns+numbers;

        for (int i = 0;i<length;i++){
            Random random = new Random();
            int number=random.nextInt(9);
            result += allStrings.charAt(number);

        }
        return result;
    }
}
