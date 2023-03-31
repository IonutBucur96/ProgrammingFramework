package oop_abstractizareinterfete;

public interface InstructorAuto {

    //recunoastem o interfata dupa cuvantul interface
    //intr-o interfata putem avea DOAR metode abstracte(metoda care nu are body {})
    //toate metodele dintr-o interfata sunt publice
    //dintr-o interfata nu putem sa facem un obiect
    //intr-o interfata nu putem sa avem un constructor
    //o interfata se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //o clasa poate sa implementeze N interfete
    //O clasa abstracta poate sa implementeze o interfata
    //o interfata poate sa mosteneasca o alta interfata

    void cunoasteCursant();
    void prezentareBoard();
    void sustineSedintePractice();

}
