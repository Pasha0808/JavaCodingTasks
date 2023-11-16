package week06;

public class Password_Validation {
    public static void main(String[] args) {
       PasswordValidation("ppp");
    }

    public static boolean PasswordValidation(String password) {
        if (password.length() < 6) {
            return false;
        } else {
            for (int i = 0; i < password.length() - 1; i++) {
                char each = password.charAt(i);

                if (Character.isLowerCase(each)) {
                    continue;
                }
                if (Character.isUpperCase(each)) {
                    continue;
                }
                if (Character.isDigit(each)) {
                    continue;
                }
          /*  if(Character.isWhitespace(each)){
                continue;
            }

           */
            }

        }
        return true;
    }
}


