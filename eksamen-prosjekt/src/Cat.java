import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cat extends Observation {
    private String color;

    public Cat(String whatAnimal, String whereItWasSeen, LocalDateTime whenItWasSeen, String comment, String color) {
        super(whatAnimal, whereItWasSeen, whenItWasSeen, comment);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
            return String.format("%s %s", super.toString(), color);
        }
}

