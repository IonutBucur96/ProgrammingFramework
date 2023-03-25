package oop_mostenireIncapsulare;

import java.util.List;

public class Audi extends MasinaFabrica{

    private List<String> dotariInterioare;

    public Audi(String brand, String model, String putere, Integer an,Integer pret, List<String> dotariInterioare) {
        super(brand, model, putere, an, pret);
        this.dotariInterioare = dotariInterioare;
    }

    public void infoAudi(){
        infoMasina();
        System.out.println("Dotarile interioare sunt "+dotariInterioare);
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
