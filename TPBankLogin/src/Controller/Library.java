package Controller;

import java.util.Locale;
import java.util.Scanner;
import java.util.ResourceBundle;

public class Library {
    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }
    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
     public String getString(String mes){
        System.out.print(mes);
        return sc.nextLine();
    }

    public double checkInputDouble(String promt) {
        while (true) {
            System.out.print(promt);
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
    public boolean checkInputYN(String mes) {
        System.out.print(mes);
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    private final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";

    public int checkInputIntLimit(int min, int max, Locale language) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                getWordLanguage(language, "errorCheckInputIntLimit");
                System.out.println();
            }
        }
    }

    public String checkInputString(Locale language) {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 0) {
                getWordLanguage(language, "errorCheckInputIntLimit");
                System.out.println();
            } else {
                return result;
            }
        }
    }

    public int checkInputAccount(Locale language) {
        while (true) {
            String result = sc.nextLine();
            if (result.matches(ACCOUNT_NUMBER_VALID)) {
                return Integer.parseInt(result);
            }
            getWordLanguage(language, "errorCheckInputAccount");
            System.out.println();
            getWordLanguage(language, "enterAccountNumber");
        }
    }

    public String checkInputPassword(Locale language) {
        String result;
        while (true) {
            result = checkInputString(language);
            if (isValidPassword(result, language)) {
                return result;
            }
            getWordLanguage(language, "enterPassword");
        }
    }
    public void getWordLanguage(Locale curLocate, String key) {
        ResourceBundle words = ResourceBundle.getBundle("Language/" + curLocate, curLocate);
        String value = words.getString(key);
        System.out.print(value);
    }
     public boolean isValidPassword(String password, Locale language) {
        int lengthPassword = password.length();
        if (lengthPassword < 8 || lengthPassword > 31) {
            getWordLanguage(language, "errorCheckLengthPassword");
            System.out.println();
            return false;
        } else {
            int countDigit = 0;
            int countLetter = 0;
            for (int i = 0; i < lengthPassword - 1; i++) {
                if (Character.isDigit(password.charAt(i))) {
                    countDigit++;
                } else if (Character.isLetter(password.charAt(i))) {
                    countLetter++;
                }
            }
            if (countDigit < 1 || countLetter < 1) {
                getWordLanguage(language, "errorCheckAlphanumericPassword");
                System.out.println();
                return false;
            }
        }
        return true;
    }
    

private final char[] chars = {'0','1', '2', '3', '4', '5', '6',
        '7', '8', '9', 'A', 'B', 'C', 'F', 'E', 'F', 'G', 'H', 'J', 'K',
        'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
        'Z'};
    
    public String generateCaptchaText() {
        final int LENGTH = 5;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < LENGTH; i++) {
            index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);
        }
        return sb.toString();
    }
    
    public String getInputCaptcha(Locale language) {
        String result = sc.nextLine();
        return result;
    }
    
    public boolean checkInputCaptcha(String captchaGenerated, Locale language) {
        getWordLanguage(language, "enterCaptcha");
        String captchaInput = getInputCaptcha(language);
        if(captchaInput.length()==0){
            return false;
        }
        for (int i = 0; i < captchaInput.length(); i++) {
            if (!captchaGenerated.contains(Character.toString(captchaInput.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}
