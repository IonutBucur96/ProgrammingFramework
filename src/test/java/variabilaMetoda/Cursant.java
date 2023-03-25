package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    public String numele;
    public String prenumele;
    public Integer numarcursant;
    public Double delaora;
    public Double panalaora;
    public Float km;
    public Character prezenta;
    public Boolean semnatura;

    @Test
    public void infoFoi(){

        numele="Dorha";
        prenumele="Alex";
        numarcursant=123456;
        delaora=9.00;
        panalaora=11.00;
        km=25.3f;
        prezenta='P';
        semnatura=true;


        System.out.println("Nume: "+numele);
        System.out.println("Prenume: "+prenumele);
        System.out.println("Numar matricol cursant: "+numarcursant);
        System.out.println("De la ora: "+delaora);
        System.out.println("Pana la ora: "+panalaora);
        System.out.println("Kilometri parcursi: "+km);
        System.out.println("Prezenta: "+prezenta);
        System.out.println("A semnat? "+semnatura);






    }








}
