package obiectConstructorV3;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PolitistTest {

    @Test
    public void testMethod(){

        System.out.println("===Primul politist===");
        List<String> alexDorhaGreseli = Arrays.asList("murit motor=5","mers prea incet=3","nesemnalizare=6");
        List<String> sorinaIndrecanGreseli = Arrays.asList("mers prea incet=3");
        List<String> tiberiuUscatuGreseli = Arrays.asList("stelist=20");
        List<String> ionutBucurGreseli = Arrays.asList("trecut pe rosu=21");

        HashMap<String, List<String>> candidatiExamen = new HashMap<>();
        candidatiExamen.put("Alex Dorha", alexDorhaGreseli);
        candidatiExamen.put("Sorina Indrecan", sorinaIndrecanGreseli);
        candidatiExamen.put("Tiberiu Uscatu", tiberiuUscatuGreseli);
        candidatiExamen.put("Ionut Bucur", ionutBucurGreseli);

        Politist NegreaViorel = new Politist("Negrea", "Viorel", 50, "Sectia 1", "Cluj-Napoca", candidatiExamen);
        //NegreaViorel.rezumatCandidati();
        NegreaViorel.rezumatCandidat("Ionut","Bucur");
    }
}
