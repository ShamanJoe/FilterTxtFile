import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static final String  BIRD = "Fugl";
    private static final String DOG = "Hund";
    private static final String  CAT = "Katt";
    private static final String WALRUS = "Hvalross";
    List<Observation> observationList = new ArrayList<>();
    List<String> fields = new ArrayList<>();

    public List<Observation> readFromFile() throws IOException {
        File equipment = new File("observations.txt");
        observationList = new ArrayList<>();
        fields = new ArrayList<>();
        String line;
        String type = null;
        Observation observation = null;
        try (Scanner reader = new Scanner(equipment)) {
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                if (isTypeLine(line)) {
                    if (type != null) {
                        switch (type) {
                            case BIRD:
                                observation = createBird(fields);
                                break;
                            case DOG:
                                observation = createDog(fields);
                                break;
                            case CAT:
                                observation = createCat(fields);
                                break;
                            case WALRUS:
                                observation = createWalrus(fields);
                                break;
                            default:
                                observation = null;
                        }
                        if (observation != null) {
                            observationList.add(observation);
                        }
                    }
                    fields.clear();
                    type = line;
                }
                else {
                    fields.add(line);
                }
            }
            if (type != null) {
                switch (type) {
                    case BIRD:
                        observation = createBird(fields);
                        break;
                    case DOG:
                        observation = createDog(fields);
                        break;
                    case CAT:
                        observation = createCat(fields);
                        break;
                    case WALRUS:
                        observation = createWalrus(fields);
                        break;
                    default:
                        observation = null;
                }
                if (observation != null) {
                    observationList.add(observation);
                }
            }
            return observationList;
        }
    }

    public List<Observation> getNumberOfObservations(){
            for (int i = 0; i <observationList.size(); i++) {
                System.out.println(i);
            }
        return null;
    }

    public List<Observation> printCats(){
        for (Observation observation: observationList) {
            if (observation.getWhatAnimal() == CAT) {
                System.out.println(observation);
            }
        }
        return null;
    }

    public List<Observation> printObservations(){

        for (Observation observation: observationList) {

            String str = "2022-06-03T10:15";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            LocalDateTime fromDateTime = LocalDateTime.parse(str, formatter);

            String str2 = "2022-06-15T12:46";
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            LocalDateTime toDateTime = LocalDateTime.parse(str2, formatter2);

            if (observation.getWhenItWasSeen().isAfter(fromDateTime) && observation.getWhenItWasSeen().isBefore(toDateTime))
                System.out.println(observation);
        }
        return null;
    }


    private Bird createBird(List<String> fields) {
        String whereItWasSeen = fields.get(0);
        LocalDateTime whenItWasSeen = LocalDateTime.parse(fields.get(1));
        String comment = fields.get(2);
        String typeOfBird = fields.get(3);
        Integer howMany = Integer.valueOf(fields.get(4));
        Bird bird = new Bird(BIRD, whereItWasSeen, whenItWasSeen, comment, typeOfBird, howMany);
        return bird;
    }

    private Cat createCat(List<String> fields) {
        String whereItWasSeen = fields.get(0);
        LocalDateTime whenItWasSeen = LocalDateTime.parse(fields.get(1));
        String comment = fields.get(2);
        String color = fields.get(3);
        Cat cat = new Cat(CAT, whereItWasSeen, whenItWasSeen, comment, color);
        return cat;
    }

    private Walrus createWalrus(List<String> fields) {
        String whereItWasSeen = fields.get(0);
        LocalDateTime whenItWasSeen = LocalDateTime.parse(fields.get(1));
        String comment = fields.get(2);
        Integer fangsIntact = Integer.valueOf(fields.get(3));
        Walrus walrus = new Walrus(WALRUS, whereItWasSeen, whenItWasSeen, comment, fangsIntact);
        return walrus;
    }

    private Dog createDog(List<String> fields) {
        String whereItWasSeen = fields.get(0);
        LocalDateTime whenItWasSeen = LocalDateTime.parse(fields.get(1));
        String comment = fields.get(2);
        String race = fields.get(3);
        Boolean onLeash = Boolean.valueOf(fields.get(4));
        Dog dog = new Dog(DOG, whereItWasSeen, whenItWasSeen, comment, race, onLeash);
        return dog;
    }

    private boolean isTypeLine(String line) {
        return BIRD.equals(line)  ||  DOG.equals(line) ||  WALRUS.equals(line) ||  CAT.equals(line);
    }
}
