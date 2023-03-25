package structuri;

import org.testng.annotations.Test;

public class Angajat {

    //structuri repetitive = tip de structura care ne ajuta sa facem o actiune de N ori
    //for, while
    //++ creste valoarea initiala cu +1
    //-- scade valoarea initiala cu -1

    @Test
    public void methodTest(){
        //afisareNumere();
        //afisareNumereV2();
        afisareNrPare(250);
    }


    //afiseaza pe tastatura primele 100 numere [0-100]
    public void afisareNumere(){
        for (Integer contor=0;contor<=100;contor++){
            System.out.println(contor);
        }
    }

    //afiseaza pe tastatura primele 100 numere [0-100] v2
    public void afisareNumereV2(){
        Integer contor = 0;
        while (contor<=100){
            System.out.println(contor);
            contor++;
        }
    }

    //afiseaza toate numerele care sunt pare de la [0-70]
    public void afisareNrPare(Integer capatInterval){
        System.out.println("Numerele pare de la 0 la "+capatInterval+" sunt urmatoarele:");
        for (Integer index=0;index<=capatInterval;index++){
            if (index%2==0){
                System.out.println(index);
            }
        }
    }
}
