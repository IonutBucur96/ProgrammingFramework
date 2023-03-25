package obiectConstructorV2;

import java.util.HashMap;
import java.util.List;

public class FotbalistObject {

    public String nume;
    public String prenume;
    public String echipa;
    public String pozitie;
    public Integer salariu;
    public HashMap<String, Integer> bonusuriPersonale;
    public HashMap<String, Integer> bonusuriEchipa;

    public FotbalistObject(String nume, String prenume, String echipa, String pozitie) {
        this.nume = nume;
        this.prenume = prenume;
        this.echipa = echipa;
        this.pozitie = pozitie;
    }

    public FotbalistObject(String nume, String prenume, String echipa, String pozitie, Integer salariu, HashMap<String, Integer> bonusuriPersonale, HashMap<String, Integer> bonusuriEchipa) {
        this.nume = nume;
        this.prenume = prenume;
        this.echipa = echipa;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.bonusuriPersonale = bonusuriPersonale;
        this.bonusuriEchipa = bonusuriEchipa;
    }

    public void detaliiContract() {
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(echipa);
        System.out.println(pozitie);
        System.out.println("Salariul fara bonusuri este " + salariu);
        if (bonusuriPersonale != null) {
            System.out.println("Bonusurile la nivel de jucator sunt urmatoarele:");
            System.out.println(bonusuriPersonale);
        }
        if (bonusuriEchipa != null) {
            System.out.println("Bonusurile la nivel de echipa sunt urmatoarele:");
            System.out.println(bonusuriEchipa);
        }
        System.out.print("Salariul cu bonusuri este ");
        calculFinalSalariu(bonusuriPersonale);
        calculFinalSalariu(bonusuriEchipa);
        System.out.println(salariu);
    }

    public void calculFinalSalariu(HashMap<String, Integer> bonusuri){
        if(bonusuri !=null){
            for (String key: bonusuri.keySet()){
                salariu=salariu+bonusuri.get(key);
            }
        }
    }


    public void asezarePozitie() {
        if (pozitie.equals("atac")) {
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca atacant central");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca atacant stanga");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca atacant dreapta");
        }
        if (pozitie.equals("mijloc")) {
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca mijlocas central");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca mijlocas stanga");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca mijlocas dreapta");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca mijlocas defensiv");
        }
        if (pozitie.equals("aparare")) {
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca fundas central");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca fundas stanga");
            System.out.println("Jucatorul cu numele: " + nume + "," + prenume + " poate juca fundas dreapta");
        }
    }
}