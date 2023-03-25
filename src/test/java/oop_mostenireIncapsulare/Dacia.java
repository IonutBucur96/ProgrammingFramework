package oop_mostenireIncapsulare;

public class Dacia extends MasinaFabrica {

    private String tipCarlig;

    public Dacia(String brand, String model, String putere, Integer an,Integer pret, String tipCarlig) {
        super(brand, model, putere, an,pret);
        this.tipCarlig = tipCarlig;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Tipul de carlig este "+tipCarlig);
    }

    public String getTipCarlig() {
        return tipCarlig;
    }

    public void setTipCarlig(String tipCarlig) {
        this.tipCarlig = tipCarlig;
    }
}
