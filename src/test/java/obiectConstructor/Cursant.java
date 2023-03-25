package obiectConstructor;

public class Cursant {

    //constructor = are ca rol sa initializeze atributele(variabilele) unei clase
    //o clasa poate avea N constructori
    //constructorii sunt de 2 feluri: cu parametrii si fara parametrii
    //daca intr-o clasa nu ai facut niciun constructor => mereu exista unul by default
    //recunoastem un constructor dupa numele clasei
    //constructorul este mereu public
    //avem nevoie de un constructor ca sa declaram un obiect
    //obiect = instanta unei clase
    //dintr-o clasa putem face n obiecte
    //in momentul in care se declara un obiect => putem accesa toate variabilele si metodele din clasa
    //in momentul in care se declara un obiect => se apeleaza constructorul clasei
    //un obiect se recunoaste dupa cuvantul "new"

    public String nume;
    public String prenume;
    public Boolean arePermis;
    public Integer codCursant;
    public Boolean cursantExceptie;

    //constructor
    public Cursant(String nume, String prenume, Boolean arePermis, Integer codCursant) {
        //daca parametrul ii la fel cu numele variabilei dintr-o clasa => folosim cuvantul this
        this.nume = nume;
        this.prenume = prenume;
        this.arePermis = arePermis;
        this.codCursant = codCursant;
    }

    public Cursant(String nume, String prenume, Boolean arePermis, Integer codCursant, Boolean cursantExceptie) {
        this.nume = nume;
        this.prenume = prenume;
        this.arePermis = arePermis;
        this.codCursant = codCursant;
        this.cursantExceptie = cursantExceptie;
    }

    public void prezentareCursant(){
        System.out.println("Numele cursantului este "+nume);
        System.out.println("Prenumele cursantului este "+prenume);
        System.out.println("Are cursantul permis? "+arePermis);
        System.out.println("Codul cursantului este "+codCursant);
        if (cursantExceptie!=null && cursantExceptie){
            System.out.println("Cursantul este un cursant mai special...");
        }
    }

    public void prezentareBoard(){
        if (arePermis){
            System.out.println("Cursantul are experienta si putem sa pornim la drum");
        }
        else {
            System.out.println("Trebuie sa ii explic cursantului comenzile de baza");
        }
    }


}
