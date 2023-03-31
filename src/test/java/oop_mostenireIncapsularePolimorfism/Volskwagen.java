package oop_mostenireIncapsularePolimorfism;

import java.util.List;

public class Volskwagen extends MasinaFabrica{

    private List<String> dotariInterioare;
    private List<String> dotariExterioare;

    public Volskwagen(String brand, String model, String putere, Integer an, Integer pret,List<String> dotariInterioare, List<String> dotariExterioare) {
        super(brand, model, putere, an, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }

    public void infoVolskwagen(){
        infoMasina();
        System.out.println("Dotarile interioare sunt "+dotariInterioare);
        System.out.println("Dotarile exterioare sunt "+dotariExterioare);
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
