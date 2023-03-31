package oop_mostenireIncapsularePolimorfism;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MostenireTest {

    @Test
    public void testMethod(){

        System.out.println("===Masina DACIA===");
        Dacia sanderoDorha = new Dacia("Dacia","Sandero","80 cai", 2023, 14500,"carlig standard");
        sanderoDorha.setAn(2021);
        sanderoDorha.setTipCarlig("carlig electric");
        sanderoDorha.infoDacia();
        sanderoDorha.pornesteMasina();

        sanderoDorha.afisareMasiniSediu();
        sanderoDorha.afisareMasiniSediu("Sandero");
        sanderoDorha.afisareMasiniSediu("Sandero",2010);
        sanderoDorha.afisareMasiniSediu(2005);

//
//        Dacia dusterDorhaJr = new Dacia("Dacia","Duster","120 cai", 2023,17500,"carlig electric");
//        dusterDorhaJr.infoDacia();
//
        System.out.println("===Masina AUDI===");
        Audi a3Bucur = new Audi("Audi","A3","110 cai", 2022, 33000, Arrays.asList("gps","scaune electrice"));
        a3Bucur.infoAudi();
        a3Bucur.pornesteMasina();


//        System.out.println("===Masina VOLKSWAGEN===");
//        Volskwagen touranAndra = new Volskwagen("Volkswagen","Touran","140 cai", 2018,19000,Arrays.asList("boxe Boose","pornire buton"),Arrays.asList("camera spate","senzori parcare"));
//        touranAndra.infoVolskwagen();

        System.out.println("===Masina SEAT===");
        Seat exeoIonut = new Seat("Seat", "Exeo", "170 cai", 2009, 6000, "Remorca extra");
        exeoIonut.infoSeat();
        exeoIonut.pornesteMasina();
    }
}
