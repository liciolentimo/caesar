public class Decrypt{
public static String decrypt(String str, int keyLength){
        
    String decrypted = "";
    


    for(int i=0; i < str.length(); i++) {
        int chars = str.charAt(i);
        if(Character.isUpperCase(chars)){
            chars = chars - (keyLength % 26);
            if (chars > 'Z')
            chars = chars + 26;
        }
        else if (Character.isLowerCase(chars)) {
            chars = chars - (keyLength % 26);
            if (chars > 'z')
            chars = chars + 26;
        }
        decrypted += (char) chars;
        

    }
    return decrypted;
}
}