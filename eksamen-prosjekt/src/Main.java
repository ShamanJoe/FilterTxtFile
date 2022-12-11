import java.io.IOException;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Program prog = new Program();
            try {
                /*OPPGAVE 1 : */
                List<Observation> list = prog.readFromFile();
                list.forEach(System.out::println);

                /*OPPGAVE 3 : */
                System.out.println("printing all Cats in the txt file/array" );
                prog.printCats();

                System.out.println("Printing number of observations. Starting at 0 :)");
                prog.getNumberOfObservations();

                System.out.println("Printing out observations between 2022-06-03T10:15 and 2022-06-15T12:46");
                prog.printObservations();
            }
            catch (IOException xIo) {
                xIo.printStackTrace();
            }
        }
    }