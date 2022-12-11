import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bird extends Observation {
    private String typeOfBird;
    private Integer howMany;


    public Bird(String whatAnimal, String whereItWasSeen, LocalDateTime whenItWasSeen, String comment, String typeOfBird, Integer howMany) {
        super(whatAnimal, whereItWasSeen, whenItWasSeen, comment);
        this.typeOfBird = typeOfBird;
        this.howMany = howMany;
    }

    public String getTypeOfBird() {
        return typeOfBird;
    }

    public void setTypeOfBird(String typeOfBird) {
        this.typeOfBird = typeOfBird;
    }

    public Integer getHowMany() {
        return howMany;
    }

    public void setHowMany(Integer howMany) {
        this.howMany = howMany;
    }

    public String toString() {
        return String.format("%s %s", super.toString(), typeOfBird, howMany);
    }
}
