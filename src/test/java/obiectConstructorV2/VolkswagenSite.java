package obiectConstructorV2;

import java.util.List;

public class VolkswagenSite {

    public String model;
    public String transmisie;
    public String putere;
    public String consum;
    public Integer an;
    public String tractiune;
    public Integer pret;
    public List<String> dotariExterioare;
    public List<String> dotariInterioare;

    public VolkswagenSite(String model, String transmisie, String putere, String consum, Integer an, String tractiune, Integer pret) {
        this.model = model;
        this.transmisie = transmisie;
        this.putere = putere;
        this.consum = consum;
        this.an = an;
        this.tractiune = tractiune;
        this.pret = pret;
    }

    public VolkswagenSite(String model, String transmisie, String putere, String consum, Integer an, String tractiune, Integer pret, List<String> dotariExterioare, List<String> dotariInterioare) {
        this.model = model;
        this.transmisie = transmisie;
        this.putere = putere;
        this.consum = consum;
        this.an = an;
        this.tractiune = tractiune;
        this.pret = pret;
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareFinala(){
        System.out.println(model);
        System.out.println(transmisie);
        System.out.println(putere);
        System.out.println(consum);
        System.out.println(an);
        System.out.println(tractiune);
        System.out.println("Pretul initial al masinii este "+pret);
        if (dotariExterioare != null) {
            System.out.println(dotariExterioare);
            calculPretDotari();
        }
        if (dotariInterioare !=null) {
            System.out.println(dotariInterioare);
            calculPretDotari();
        }
        System.out.println("Pretul final al masinii este "+pret);

    }

    public void aplicareDiscount(Integer discount){
        Integer reducerePret = (pret*discount)/100;
        pret = pret-reducerePret;
        System.out.println("Pretul final al masinii dupa un discount de "+discount+"% este de "+pret);

    }

    public void calculPretDotari(){
        if (dotariExterioare != null) {
            for (Integer index = 0; index<dotariExterioare.size();index++){
                switch (dotariExterioare.get(index)){
                    case "faruri led":
                        pret = pret + 1200;
                        break;
                    case "jante 17":
                        pret = pret + 500;
                        break;
                    case "vopsea metalizata":
                        pret = pret + 700;
                        break;
                }
            }
        }
        if (dotariInterioare !=null) {
            for (Integer index = 0; index<dotariInterioare.size();index++){
                switch (dotariInterioare.get(index)){
                    case "aer conditionat":
                        pret = pret + 200;
                        break;
                    case "display touchscreen":
                        pret = pret + 500;
                        break;
                    case "scaun incalzit":
                        pret = pret + 800;
                        break;
                }
            }        }
    }
}
