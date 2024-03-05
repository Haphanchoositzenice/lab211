package Model;

public class Model {
    private String number;
    private String character;

    public Model(String number, String character) {
        this.number = number;
        this.character = character;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
