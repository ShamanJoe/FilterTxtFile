import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog extends Observation {
    private String race;
    private Boolean onLeash;

    public Dog(String whatAnimal, String whereItWasSeen, LocalDateTime whenItWasSeen, String comment, String race, Boolean onLeash) {
        super(whatAnimal, whereItWasSeen, whenItWasSeen, comment);
        this.race = race;
        this.onLeash = onLeash;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Boolean getOnLeash() {
        return onLeash;
    }

    public void setOnLeash(Boolean onLeash) {
        this.onLeash = onLeash;
    }

    public String toString() {
        return String.format("%s %s", super.toString(), race, onLeash);
    }
}
