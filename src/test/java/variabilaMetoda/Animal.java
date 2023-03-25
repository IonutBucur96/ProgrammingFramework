package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    //o metoda poate sau nu sa contina parametrii
    //parametrii sunt similari cu declararea unei variabile locale
    //o metoda poate sa contina N parametrii

    @Test
    public void methodTest(){
        infoAnimal("Caine","ciobanesc");
        infoAnimal("Caine","maidanez");
        infoAnimal("Caine","corcitura");
        sumaNumerelor(5,9,7);
        sumaNumerelor(5,3,6);

    }


    public void infoAnimal(String nume, String rasa){
        System.out.println(nume);
        System.out.println(rasa);
    }


    //calculam suma a 2 numere
    public void sumaNumerelor(Integer numar1, Integer numar2,Integer numar3){
        Integer suma=numar1+numar2+numar3;
        System.out.println(suma);
    }



}
