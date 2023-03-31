package oop_mostenireIncapsularePolimorfism;

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

    //polimorfism dinamic
    public void pornesteMasina(){
        System.out.println("Masinile Dacia se pot porni din cheie sau din buton");
    }

    //polimorfism static
    public void afisareMasiniSediu(){
        System.out.println("Avem 100 masini pe stoc");
    }

    public void afisareMasiniSediu(String model){
        System.out.println("Avem 30 masini pe stoc cu modelul "+model);
    }

    public void afisareMasiniSediu(Integer an){
        System.out.println("Avem 50 masini pe stoc din anul "+an);
    }

    public void afisareMasiniSediu(String model, Integer an){
        System.out.println("Avem 10 masini pe stoc cu modelul "+model + " din anul "+an);
    }



    public String getTipCarlig() {
        return tipCarlig;
    }

    public void setTipCarlig(String tipCarlig) {
        this.tipCarlig = tipCarlig;
    }
}
