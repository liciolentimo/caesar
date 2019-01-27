//import java.io.Console;
import javax.swing.JOptionPane;
 

public class App{
    public static void main(String[] args){

        String str = (JOptionPane.showInputDialog("Input Data to encypt:"));
         

        String key = (JOptionPane.showInputDialog("Input the key:"));

        int keyLength=key.length();

        String encrypted = encrypt(str, keyLength);

        System.out.println("Encrypted message:" + encrypted);
    }
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
