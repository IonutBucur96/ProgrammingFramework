package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void methodTest(){
        Masina Combi = new Masina("Volkswagen","Passat",2020,false,'M');
        Combi.prezentareMasina();
        Combi.inmatricularea();

        Masina Berlina = new Masina("BMW","Seria 1",2023,true,'A');
        Berlina.prezentareMasina();
        Berlina.inmatricularea();

        Masina Cabrio = new Masina("Audi","TT", 2017, false,'A');
        Cabrio.prezentareMasina();
        Cabrio.inmatricularea();

        Masina Jeep = new Masina("Lada","Niva",1996,false,'M',true);
        Jeep.prezentareMasina();
        Jeep.inmatricularea();
    }
}
