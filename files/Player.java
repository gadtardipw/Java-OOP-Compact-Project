package files;

public class Player extends Person {
    
    private int number;
    private String position;


    public Player(String name){
        super(name);
    }

    public Player(String name, int number, String position) {
        super(name);
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    // Player[Person[],number=?,position=?]
    public String toString() {
        return "Player[" + super.toString() + " number=" + number + " position=" + position + "]";
    }
}
