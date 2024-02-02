package Common;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Common {
    protected Scanner sc;

    public Common() {
        sc = new Scanner(System.in);
    }

    public String getString(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }
    public int getInt(String print, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(print + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
                if (a != m || a != n){
                    if (m==n){
                        System.out.println("There is only "+m);
                        continue;
                    }
                    else{
                        System.out.println("Please enter a number between " + m + " and " + n);
                        continue;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
    
    public String getPhoneNumber(String mes) {
        String phoneNumber;
        boolean isValid = false;
        String pattern = "^((\\(\\d{3}\\))|(\\d{3}))[-.\\s]?\\d{3}[-.\\s]?\\d{4}( x\\d+)?$";
        
        do {
            phoneNumber = getString(mes);
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(phoneNumber);
            
            if (matcher.matches()) {
                isValid = true;
            } else {
                System.err.println("Invalid phone number format. Please use one of the following formats:");
                System.err.println("- 1234567890");
                System.err.println("- 123-456-7890");
                System.err.println("- 123-456-7890 x1234");
                System.err.println("- 123-456-7890 ext1234");
                System.err.println("- (123)-456-7890");
                System.err.println("- 123.456.7890");
                System.err.println("- 123 456 7890");
            }
        } while (!isValid);
        
        return phoneNumber;
    }

}