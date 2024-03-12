package Controller;

import Model.User;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class LoginDAO {  
    Library l;
    List<User> userList;

    public LoginDAO() {
        l = new Library();
        userList = new LinkedList<>();
    }

    public void login(Locale language) {
        l.getWordLanguage(language, "enterAccountNumber");
        int accountNumber = l.checkInputAccount(language);
        l.getWordLanguage(language, "enterPassword");
        String passString = l.checkInputPassword(language);
        String captchaGenerated = l.generateCaptchaText();
        System.out.println("Captcha: " + captchaGenerated);
        while (!l.checkInputCaptcha(captchaGenerated, language)) {
            l.getWordLanguage(language, "errorCaptchaIncorrect");
            System.out.println("");
            captchaGenerated = l.generateCaptchaText();
            System.out.println("Captcha: " + captchaGenerated);
        }
        l.getWordLanguage(language, "loginSuccess");
        System.out.println();
        userList.add(new User(accountNumber, passString, captchaGenerated));
    }
}