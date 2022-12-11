import java.time.LocalDateTime;

public abstract class Observation {
    private String whatAnimal;
    private String whereItWasSeen;
    private LocalDateTime whenItWasSeen;
    private String comment;

    public Observation(String whatAnimal, String whereItWasSeen, LocalDateTime whenItWasSeen, String comment) {
        this.whatAnimal = whatAnimal;
        this.whereItWasSeen = whereItWasSeen;
        this.whenItWasSeen = whenItWasSeen;
        this.comment = comment;
    }

    public String getWhatAnimal() {
        return whatAnimal;
    }

    public void setWhatAnimal(String whatAnimal) {
        this.whatAnimal = whatAnimal;
    }

    public String getWhereItWasSeen() {
        return whereItWasSeen;
    }

    public void setWhereItWasSeen(String whereItWasSeen) {
        this.whereItWasSeen = whereItWasSeen;
    }

    public LocalDateTime getWhenItWasSeen() {
        return whenItWasSeen;
    }

    public void setWhenItWasSeen(LocalDateTime whenItWasSeen) {
        this.whenItWasSeen = whenItWasSeen;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toString() {
        return String.format("%s %s %s %s", whatAnimal, whereItWasSeen, whenItWasSeen, comment);
    }

}
