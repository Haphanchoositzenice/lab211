package Model;

import java.util.Date;

public class Model {
    private String phone;
    private Date date;
    private String email;

    public Model(String phone, Date date, String email) {
        this.phone = phone;
        this.date = date;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
