package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String masina;
    public String model;
    public Integer an;
    public String combustibil;
    public String caroserie;
    public String culoare;
    public Double motor;
    public Float km;
    public Character cutie;
    public Boolean Afostlovita;

    @Test
    public void infoMasina(){
        masina="Seat";
        model="Exeo";
        an=2009;
        combustibil="Diesel";
        caroserie="berlina";
        culoare="neagra";
        motor=2.0;
        km=250000.6f;
        cutie='M';
        Afostlovita=false;

        System.out.println("Marca: "+masina);
        System.out.println("Model: "+model);
        System.out.println("Anul fabricatiei: "+an);
        System.out.println("Combustibil utilizat: "+combustibil);
        System.out.println("Caroserie: "+caroserie);
        System.out.println("Culoare: "+culoare);
        System.out.println("Capacitate cilindrica: "+motor+" cc");
        System.out.println("Kilometri parcursi: "+km+" km");
        System.out.println("Cutie: "+cutie);
        System.out.println("A fost lovita masina? "+Afostlovita);



    }




}
