package multimi;

import com.beust.jcommander.StringKey;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Calculator {

    //multimi = posibilitatea de a parcurge o structura de valori care sunt de acelasi tip
    //se poate reprezenta sub o multime de forme
    //array, lista, hashmap
    //tema=reprezentam o lista de retete de bucatarie

    @Test
    public void methodTest(){
        //cursantiCondusArray();
        //cursantiCondusLista();
        //calculKMCondusCursant();
        //afisareProduseCategoriiDiferite();
        //tariOrase();
        reteteBucatarie();
    }


    //reprezentam cursantii pe care ii am la condus
    public void cursantiCondusArray(){
        System.out.println("Numele cursantilor pe care ii am la condus sunt urmatorii:");
        String[] cursanti = new String[5];
        cursanti[0]="Alex";
        cursanti[1]="Dorha";
        cursanti[2]="Ionut";
        cursanti[3]="Sorina";
        cursanti[4]="Alex";
        for (Integer index=0;index<cursanti.length;index++){
            System.out.println(cursanti[index]);
        }
    }

    public void cursantiCondusLista(){
        System.out.println("Numele cursantilor pe care ii am la condus sunt urmatorii:");
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Alex");
        cursanti.add("Dorha");
        cursanti.add("Sorina");
        cursanti.add("Ionut");
        cursanti.add("Pila");
        for (Integer index=0;index<cursanti.size();index++){
            System.out.println(cursanti.get(index));
        }
    }

    //calculam numarul de km facuti de un cursant la condus
    //un cursant trebuie sa faca minm 100 km ca sa mearga la examen
    public void calculKMCondusCursant(){
        List<Integer> nrKM = new ArrayList<>();
        nrKM.add(45);
        nrKM.add(34);
        nrKM.add(20);
        nrKM.add(7);
        Integer total = 0;
        for (Integer index=0;index< nrKM.size();index++){
            total=total+ nrKM.get(index);
        }
        if (total>=100){
            System.out.println("Cursantul poate sa mearga la proba urmatoare");
        }
        else {
            System.out.println("Cursantul mai trebuie sa faca ore");
        }
    }

    //clasifica niste elemente dupa categoria din care fac parte
    //key=value
    //cheia trebuie sa fie unica
    //structurile de genul key=value functioneaza cu un for each
    public void afisareProduseCategoriiDiferite(){
        HashMap<String,String> produse = new HashMap<>();
        produse.put("fruct","mar");
        produse.put("haina","pantalon");
        produse.put("obiect","laptop");
        for (String key: produse.keySet()){
            System.out.println("Cheia produsul este "+key);
            System.out.println("Valoarea produsul este "+produse.get(key));
        }
    }

    //reprezentam o multime de orase care se gasesc intr-o tara
    public void tariOrase(){
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Iasi");

        //List<String> oraseRomania = Arrays.asList("Cluj", "Bucuresti", "Iasi");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Torino");
        oraseItalia.add("Venetia");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevilla");

        HashMap<String,List<String>> rezultatFinal = new HashMap<>();
        rezultatFinal.put("Romania",oraseRomania);
        rezultatFinal.put("Italia",oraseItalia);
        rezultatFinal.put("Spania",oraseSpania);
        for (String key: rezultatFinal.keySet()){
            System.out.println("Tara curenta este "+key);
            System.out.println("Orasele din tara curenta sunt  "+rezultatFinal.get(key));
        }
    }

    //tema=reprezentam o lista de retete de bucatarie
    public void reteteBucatarie(){
        List<String> ingredientePaste = new ArrayList<>();
        ingredientePaste.add("apa");
        ingredientePaste.add("penne");
        ingredientePaste.add("ciuperci");
        ingredientePaste.add("pui");
        ingredientePaste.add("smantana de gatit");
        ingredientePaste.add("usturoi");
        ingredientePaste.add("condimente");

        List<String> ingredientePizza = new ArrayList<>();
        ingredientePizza.add("aluat");
        ingredientePizza.add("sos de rosii");
        ingredientePizza.add("mozzarela");
        ingredientePizza.add("prosciutto");
        ingredientePizza.add("rucola");
        ingredientePizza.add("parmigiano");

        List<String> ingredienteSupa = new ArrayList<>();
        ingredienteSupa.add("apa");
        ingredienteSupa.add("legume");
        ingredienteSupa.add("pui");
        ingredienteSupa.add("condimente");

        List<String> ingredienteBruschette = new ArrayList<>();
        ingredienteBruschette.add("bagheta");
        ingredienteBruschette.add("rosii");
        ingredienteBruschette.add("usturoi");
        ingredienteBruschette.add("ulei de masline");
        ingredienteBruschette.add("oregano");
        ingredienteBruschette.add("busuioc");

        HashMap<String,List<String>> reteteBucatar = new HashMap<>();
        reteteBucatar.put("Paste", ingredientePaste);
        reteteBucatar.put("Pizza", ingredientePizza);
        reteteBucatar.put("Supa", ingredienteSupa);
        reteteBucatar.put("Bruschette", ingredienteBruschette);
        for (String key: reteteBucatar.keySet()){
            System.out.println("Reteta pentru:  "+key);
            System.out.println("Ingrediente:  "+reteteBucatar.get(key));

        }


    }
}
