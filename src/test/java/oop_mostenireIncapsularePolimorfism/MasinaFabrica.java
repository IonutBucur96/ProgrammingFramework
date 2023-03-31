package oop_mostenireIncapsularePolimorfism;

public class MasinaFabrica {

    //OOP = object oriented programming (programare orientata obiect)
    //4 principii: mostenire, abstractizare, incapsulare, polimorfism
    //mostenire: conceptul prin care o clasa mosteneste alta clasa
    //in momentul cand o clasa este mostenita => se poate accesa tot ce exista in clasa respectiva
    //in Java putem mosteni o singura clasa
    //Clasa care mosteneste se numeste clasa copil
    //clasa care este mostenita se numeste clasa parinte
    //In momentul in care clasa copil mosteneste clasa parinte => trebuie sa apelam constructorul din parinte cu super
    //cuvantul super are ca rol sa faca trimiterea catre o componenta din clasa parinte
    //=======================
    //incapsulare = conceptul prin care tinem departe de exterior anumite proprietati
    //in java sunt 3 tipuri de access control: public, private, protected
    //public => este vizibil peste tot in acest proiect
    //private => este vizibl doar in clasa unde a fost declarat


    //=======================================================
    //Polimorfism = procesul prin care o metoda poate avea implementari diferite
    //Polimorfismul este de 2 feluri: dinamic(override) si static(overloading)
    //polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite(apare cand ii vorba de mostenire)
    //polimorfismul static = o metoda poate avea forme diferite pe baza numarului de parametrii sau tipul acestora

    private String brand;
    private String model;
    private String putere;
    private Integer an;
    private Integer pret;

    public MasinaFabrica(String brand, String model, String putere, Integer an, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.putere = putere;
        this.an = an;
        this.pret = pret;
    }

    public void infoMasina(){
        System.out.println("Brandul este "+brand);
        System.out.println("Modelul este "+model);
        System.out.println("Puterea este "+putere);
        System.out.println("Anul este "+an);
        System.out.println("Pretul este "+pret);
    }

    //polimorfism dinamic
    public void pornesteMasina(){
        System.out.println("Masina se porneste daca introducem cheia in contact");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPutere() {
        return putere;
    }

    public void setPutere(String putere) {
        this.putere = putere;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Integer getPret() {
        return pret;
    }
}
