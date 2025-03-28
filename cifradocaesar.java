package tudelft.caesarshift;
public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift) {
        // Handle empty string
        if (message == null || message.isEmpty()) {
            return "";
        }

        // Normalize shift to be between 0 and 25
        shift = ((shift % 26) + 26) % 26;

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            // Check if character is lowercase
            if (c < 'a' || c > 'z') {
                return "invalid";
            }
            // Perform shift
            char shiftedChar = (char) (((c - 'a' + shift) % 26) + 'a');
            sb.append(shiftedChar);
        }
        return sb.toString();
    }
}
