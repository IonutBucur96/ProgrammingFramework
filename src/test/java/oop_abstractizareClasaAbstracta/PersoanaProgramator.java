package oop_abstractizareClasaAbstracta;

public class PersoanaProgramator extends Persoana{

    private String nume;
    private String prenume;
    private Integer varsta;

    public PersoanaProgramator(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    @Override
    public void cunoasteCursant() {

    }

    @Override
    public void prezentareBoard() {

    }

    @Override
    public void sustineSedintePractice() {

    }

    @Override
    public void mergeInSedinte() {

    }

    @Override
    public void scrieCodAplicatie() {

    }

    @Override
    public void ajutaColegi() {

    }
}
