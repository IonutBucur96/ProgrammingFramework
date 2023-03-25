package obiectConstructorV2;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FotbalistTest {

    @Test
    public void testMethod(){
        System.out.println("===Contract fara bonusuri===");
        HashMap<String,Integer> adiPopaBonusuriEchipa = new HashMap<>();
        adiPopaBonusuriEchipa.put("10 goluri",100);
        adiPopaBonusuriEchipa.put("5 victorii consecutive",50);

        HashMap<String,Integer> adiPopaBonusuriPersonale = new HashMap<>();
        adiPopaBonusuriPersonale.put("10 goluri",100);
        adiPopaBonusuriPersonale.put("5 victorii consecutive",50);
        adiPopaBonusuriPersonale.put("0 cartonase rosii",100);
        FotbalistObject AdiPopa = new FotbalistObject("Popa", "Adi","Steaua","atac",1000,adiPopaBonusuriPersonale,adiPopaBonusuriEchipa);
        AdiPopa.asezarePozitie();
        AdiPopa.detaliiContract();


//
//        System.out.println();
//        FotbalistObject AdiPopa2 = new FotbalistObject("Popa", "Adi","Steaua","mijloc");
//        AdiPopa2.asezarePozitie();
//
//        System.out.println();
//        FotbalistObject AdiPopa3 = new FotbalistObject("Popa", "Adi","Steaua","aparare");
//        AdiPopa3.asezarePozitie();
    }
}
