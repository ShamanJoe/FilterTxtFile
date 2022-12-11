import java.time.LocalDate;
import java.time.LocalDateTime;

public class Walrus extends Observation {
    private Integer fangsIntact;

    public Walrus(String whatAnimal, String whereItWasSeen, LocalDateTime whenItWasSeen, String comment, Integer fangsIntact) {
        super(whatAnimal, whereItWasSeen, whenItWasSeen, comment);
        this.fangsIntact = fangsIntact;
    }

    public Integer getFangsIntact() {
        return fangsIntact;
    }

    public void setFangsIntact(Integer fangsIntact) {
        this.fangsIntact = fangsIntact;
    }

    public String toString() {
            return String.format("%s %s", super.toString(), fangsIntact);
        }
}

