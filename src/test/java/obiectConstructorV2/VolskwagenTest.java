package obiectConstructorV2;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class VolskwagenTest {

    @Test
    public void methodTest(){

        System.out.println("===Masina standard===");
        VolkswagenSite poloStandard = new VolkswagenSite("Polo", "manuala", "75 cp", "5.5l", 2023,"fata",19200);
        poloStandard.prezentareFinala();
        poloStandard.aplicareDiscount(10);


        System.out.println("===Masina dotari interioare===");
        List<String> golfDotariInterioare = Arrays.asList("aer conditionat", "display touchscreen", "scaun incalzit");
        VolkswagenSite golfInterioare =
                new VolkswagenSite("Golf", "automata", "95 cp", "5.5l", 2023,"spate",24000,null,golfDotariInterioare);
        golfInterioare.prezentareFinala();
        golfInterioare.aplicareDiscount(20);


        System.out.println("===Masina dotari exterioare===");
        List<String> passatDotariExterioare = Arrays.asList("faruri led", "jante 17", "vopsea metalizata");
        VolkswagenSite passatExterioare =
                new VolkswagenSite("Passat", "automata", "105 cp", "5.5l", 2023,"spate",27000,passatDotariExterioare,null);
        passatExterioare.prezentareFinala();
        passatExterioare.aplicareDiscount(10);


        System.out.println("===Masina dotari exterioare-interioare===");
        List<String> tiguanDotariExterioare = Arrays.asList("faruri led", "jante 17", "vopea metalizata");
        List<String> tiguanDotariInterioare = Arrays.asList("aer conditionat", "display touchscreen", "scaun incalzit");
        VolkswagenSite tiguanExteriorInterior =
                new VolkswagenSite("Tiguan", "automata", "105 cp", "5.5l", 2023,"spate",37000,tiguanDotariExterioare,tiguanDotariInterioare);
        tiguanExteriorInterior.prezentareFinala();
        tiguanExteriorInterior.aplicareDiscount(30);

    }
}
