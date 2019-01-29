public class Caesar {
    public boolean isAlphabets(String str) {
        if (str.matches("^[a-zA-Z]*$") && str != null) {

        }
        return true;
    }

    public boolean shiftValue(int shift) {
        if (shift > 26) {
            return false;
        }
        // else if(shift<0){
        // return false;
        // }
        else {
            return true;
        }
    }

}