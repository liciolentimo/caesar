public class Caesar{
    public boolean isAlphabets(String str){
        if (str.matches("^[a-zA-Z]*$") && str != null){
            
        }
        return true;
    }
    public boolean shiftValue(int shift){
       if(shift>26){
           return false;
       }
    //    else if(shift<0){
    //        return false;
    //    }
       else{
           return true;
       }
    }
    

    // public static String encrypt(String str, int keyLength){
        
    //     String encrypted = "";
    //      str = "";
    //      String key = "";
         


    //      keyLength=key.length();
    //      encrypted = encrypt(str, keyLength);
        
    //     for(int i=0; i < str.length(); i++) {
    //         int chars = str.charAt(i);
    //         if(Character.isUpperCase(chars)){
    //             chars = chars + (keyLength % 26);
    //             if (chars > 'Z')
    //             chars = chars - 26;
    //         }
    //         else if (Character.isLowerCase(chars)) {
    //             chars = chars + (keyLength % 26);
    //             if (chars > 'z')
    //             chars = chars - 26;
    //         }
    //         encrypted += (char) chars;
            

    //     }
    //     return encrypted;
    // }
}