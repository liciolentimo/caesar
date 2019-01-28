public class Encrypt{
public static String encrypt(String str, int keyLength){
        
    String encrypted = "";
    
    for(int i=0; i < str.length(); i++) {
        int chars = str.charAt(i);
        if(Character.isUpperCase(chars)){
            chars = chars + (keyLength % 26);
            if (chars > 'Z')
            chars = chars - 26;
        }
        else if (Character.isLowerCase(chars)) {
            chars = chars + (keyLength % 26);
            if (chars > 'z')
            chars = chars - 26;
        }
        encrypted += (char) chars;
    }
    return encrypted;
}
}