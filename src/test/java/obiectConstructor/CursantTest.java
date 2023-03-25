package obiectConstructor;

import org.testng.annotations.Test;

public class CursantTest {

    @Test
    public void methodTest(){
        //vreau sa definesc primul meu cursant
        //"facem un obiect de tipul x"
        System.out.println("===Cursant 1==");
        Cursant AlexDorha = new Cursant("Dorha","Alex",false,123456);
        AlexDorha.prezentareCursant();
        AlexDorha.prezentareBoard();

        System.out.println("==Cursant 2==");
        Cursant SorinaIndrecan = new Cursant("Indrecan","Sorina",true,654321);
        SorinaIndrecan.prezentareCursant();
        SorinaIndrecan.prezentareBoard();

        System.out.println("==Cursant 3==");
        Cursant IonutBucur = new Cursant("Bucur","Ionut",true,11111,true);
        IonutBucur.prezentareCursant();
        IonutBucur.prezentareBoard();
    }

    //tema: definesc mai multe tipuri de masini
    //marca,model,specificatii,pret (fara discount)

}
