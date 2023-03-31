package oop_abstractizareClasaAbstracta;

public abstract class Persoana {

    //clasa abstracta este foarte asemanatoare cu clasa normala
    //ca sa facem o clasa sa fie clasa abstracta ii adaugam cuvantul abstract inaintea clasei
    //intr-o clasa abstracta trebuie sa definim access control la o metoda (public, private, protected)
    //intr-o clasa abstracta putem sa avem metode abstracte dar si cu body
    //intr-o clasa abstracta putem sa avem un constructor => NU poti sa faci un obiect
    //o clasa abstracta poate sa implementeze o interfata
    //metodele abstracte trebuie sa contina cuvantul abstract

    public abstract void cunoasteCursant();
    public abstract void prezentareBoard();
    public abstract void sustineSedintePractice();
    public abstract void mergeInSedinte();
    public abstract void scrieCodAplicatie();
    public abstract void ajutaColegi();
}
