package oop_abstractizareinterfete;

public class PersoanaInstructor extends Persoana implements InstructorAuto{

    public PersoanaInstructor(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void cunoasteCursant() {
        System.out.println("Instructorul "+getNume()+" "+getPrenume()+" a cunoscut noul cursant");
    }

    @Override
    public void prezentareBoard() {
        System.out.println("Instructorul "+getNume()+" "+getPrenume()+" a prezentat boardul noului cursant");
    }

    @Override
    public void sustineSedintePractice() {
        System.out.println("Instructorul "+getNume()+" "+getPrenume()+" sustine sedinte practice cu noul cursant");
    }
}
