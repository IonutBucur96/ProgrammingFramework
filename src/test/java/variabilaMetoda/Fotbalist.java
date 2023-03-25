package variabilaMetoda;

import org.testng.annotations.Test;

public class Fotbalist {

    //clasa = un sablon care contine atribute si metode
    //o clasa trebuie sa contina un nume
    // intr-un fisier java putem face N clasa diferentiate prin nume
    //sugestie: intr-un fisier java sa pastram o singura clasa
    //variabile = atributele unei clase
    //metodele = actiunile unei clasa
    //variabilele pot sa fie de 2 feluri: globale si locale
    //metodele pot sa fie de 2 feluri: void si return
    //metodele cu void au ca scop sa ne ofere actiunea
    //metodele cu return au ca scop sa ne returneze actiunea si mai departe sa decidem ce facem cu ea

    public String nume;
    public String prenume;
    public Integer varsta;
    public String echipa;
    public String pozitie;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean Estelovit;

    @Test
    public void infoFotbalist(){
        nume="Messi";
        prenume="Lionel";
        varsta=35;
        echipa="PSG";
        pozitie="atacant";
        inaltime=1.69;
        greutate=65.5f;
        sex='M';
        Estelovit=false;

        afisareInfoFotbalist();
        afisareSalar();
        afisareInfoFotbalist();

    }

    public void afisareSalar(){
        Integer salariu=1234;
        System.out.println(salariu);
    }

    public void afisareInfoFotbalist(){
        System.out.println("Numele fotbalistului este: "+nume);
        System.out.println("Prenumele fotbalistului este: "+prenume);
        System.out.println("Varsta este: "+varsta);
        System.out.println("Echipa actuala: "+echipa);
        System.out.println("Joaca pe pozitia: "+pozitie);
        System.out.println("Inaltimea este: "+inaltime+" m");
        System.out.println("Greutatea este: "+greutate+" kg");
        System.out.println("Genul: "+sex);
        System.out.println("Este fotbalistul lovit? "+Estelovit);
    }




}
