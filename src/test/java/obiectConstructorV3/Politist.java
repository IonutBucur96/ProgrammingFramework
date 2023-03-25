package obiectConstructorV3;

import java.util.HashMap;
import java.util.List;

public class Politist {

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sectie;
    public String oras;
    public HashMap<String, List<String>> candidatiExamen;

    public Politist(String nume, String prenume, Integer varsta, String sectie, String oras, HashMap<String, List<String>> candidatiExamen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sectie = sectie;
        this.oras = oras;
        this.candidatiExamen = candidatiExamen;
    }

    public void rezumatCandidati(){
        System.out.println("Rezumat al tuturor candidatilor pe care politistul "+nume+" "+prenume+" i-a examinat:");
        for (String candidat: candidatiExamen.keySet()){
            System.out.println("-Numele candidatului este: "+candidat);
            System.out.println("-Greselile facute de candidatul "+candidat+" sunt urmatoarele:"+candidatiExamen.get(candidat));
            calculTraseu(candidatiExamen.get(candidat));
        }
    }

    public void rezumatCandidat(String nume, String prenume){
        String numeComplet = nume+" "+prenume;
        List<String> greseliCandidat = candidatiExamen.get(numeComplet);
        calculTraseu(greseliCandidat);
    }

    public void calculTraseu(List<String> greseliCandidat){
        Integer calculFinal = 0;
        for (Integer index = 0; index<greseliCandidat.size();index++){
            String nrPuncte = greseliCandidat.get(index).split("=")[1];
            int nrPuncteInteger=Integer.parseInt(nrPuncte);
            calculFinal = calculFinal + nrPuncteInteger;
        }
        if (calculFinal <=20){
            System.out.println("Candidatul a promovat examenul practic cu un nr de puncte: "+calculFinal);
        }
        else {
            System.out.println("Candidatul NU a promovat examenul practic cu un nr de puncte: "+calculFinal);
        }
    }
}
