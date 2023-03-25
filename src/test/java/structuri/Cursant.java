package structuri;

import org.testng.annotations.Test;

public class Cursant {

    //structurile pot sa fie de 2 feluri
    //structuri alternative si repetitive
    //structurile alternative sunt de tipul:DACA...ATUNCI/ALTFEL sau SWITCH...CASE
    //nu tebuie tot timpul sa avem exact structura de IF si ELSE
    //daca vrei sa iei catul unei impartiri => DIV(/)
    //daca vrei sa iei restul unei impartiri => MOD(%)

    public String nume;
    public String prenume;
    public Integer nrOre;

    @Test
    public void testmethod(){
        System.out.println("TEST DESIGN 1");
        verificOreCursant(35);
        verificOreCursant(30);
        verificOreCursant(31);
        verificOreCursant(29);
        verificOreCursant(10);
        verificOreCursant(-10);
        verificOreCursant(333);

        System.out.println("TEST DESIGN 2");
        promovareExamen(21);
        promovareExamen(20);
        promovareExamen(22);
        promovareExamen(5);
        promovareExamen(42);
        promovareExamen(-11);

        System.out.println("TEST DESIGN 3");
        verificNumarPar1(2);
        verificNumarPar1(3);
        verificNumarPar1(-2);
        verificNumarPar1(-5);
        verificNumarPar1(0);

        System.out.println("TEST DESIGN 4");
        verificNumarPar2(2);
        verificNumarPar2(3);
        verificNumarPar2(-2);
        verificNumarPar2(-5);
        verificNumarPar2(0);


        System.out.println("SWITCH CASE");
        zileSaptamana(1);

    }

    //verificam daca un cursant a facut 30 de ore
    //35,30,31,29,10,-10,333
    public void verificOreCursant(Integer value){
        System.out.println("==Numarul de ore curent: "+value+"==");
        if (value>=30){
            System.out.println("Cursantul si-a terminat toate orele");
        }
        else {
            System.out.println("Cursantul mai trebuie sa faca cateva ore...ghinion");
        }
    }

    //verificam daca un cursant a promovat la examen
    public void promovareExamen(Integer value){
        System.out.println("==Numarul de puncte de penalizare: "+value+"==");
        if (value<21){
            System.out.println("Cursantul a promovat examenul");
        }
        else {
            System.out.println("Mai incearca peste 17 zile");
        }

    }

    //verificam daca un numar este par si pozitiv
    //varianta 1 cu bugs
    public void verificNumarPar1(Integer value){
        System.out.println("==Numarul curent: "+value+"==");

        if (value%2==0 && value>0){
            System.out.println("Numarul este si par si povitiv");
        }
        else {
            System.out.println("Numarul este negativ si impar");
        }
    }

    //aceeasi cerinta de mai sus cu mai multe cazuri
    public void verificNumarPar2(Integer value){
        System.out.println("==Numarul curent: "+value+"==");
        if (value == 0){
            System.out.println("Numarul este egal cu 0");
        }
        if (value>0){
            if (value%2==0){
                System.out.println("Numarul este par si pozitiv");
            }
            else {
                System.out.println("Numarul este impar si pozitiv");
            }
        }
        if (value<0){
            if (value%2==0){
                System.out.println("Numarul este par si negativ");
            }
            else {
                System.out.println("Numarul este impar si negativ");
            }
        }
    }

    //nr de ore sa fie 30 si sa fie platita taxa de 2400 lei
    //caz 1: 30 DA taxa DA
    //caz 2: 30 DA taxa NU
    //caz 3: 30 NU taxa DA
    //caz 4: 30 NU taxa NU

    //switch ii mult mai ok sa il aplicam cand stim ca avem mai multe cazuri care se bazeaza pe o valoare
    //daca ai 10 if si tu ai nevoie de al 5 lea => se parcurg toate ifurile de sus
    //daca ai 10 cases si tu ai nevoie de al 5 lea => sare direct la al 5 lea
    public void zileSaptamana(Integer ziNumar){
        switch (ziNumar){
            case 0:
                System.out.println("Duminica");
                break;
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
        }
    }
}
