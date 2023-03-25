package oop_mostenireIncapsulare;

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

//
//        Dacia dusterDorhaJr = new Dacia("Dacia","Duster","120 cai", 2023,17500,"carlig electric");
//        dusterDorhaJr.infoDacia();
//
//        System.out.println("===Masina AUDI===");
//        Audi a3Bucur = new Audi("Audi","A3","110 cai", 2022, 33000, Arrays.asList("gps","scaune electrice"));
//        a3Bucur.infoAudi();
    }
}
