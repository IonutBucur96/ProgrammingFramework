package oop_mostenireIncapsulare;

public class Seat extends MasinaFabrica {

    private remorca;

    public Seat(String brand, String model, String putere, Integer an, Integer pret, String remorca) {
        super(brand, model, putere, an, pret);
        this.remorca = remorca;

    }
    public void infoSeat(){
        infoMasina();
        System.out.println("Ansamblul este cu: " +remorca);
    }

}
