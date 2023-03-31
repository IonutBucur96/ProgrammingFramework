package oop_abstractizareinterfete;

import org.testng.annotations.Test;

public class InterfataTest {

    @Test
    public void testMethod(){

        System.out.println("===Instructori auto===");
        PersoanaInstructor IonutBucur = new PersoanaInstructor("Bucur", "Ionut",26);
        IonutBucur.cunoasteCursant();
        IonutBucur.prezentareBoard();
        IonutBucur.sustineSedintePractice();

        PersoanaInstructor IonutBucur2 = new PersoanaInstructor("Bucur2", "Ionut2",262);
        IonutBucur2.cunoasteCursant();
        IonutBucur2.prezentareBoard();
        IonutBucur2.sustineSedintePractice();

        System.out.println("===Instructori auto si programatori===");
        PersoanaInstructorProgramator Vlad = new PersoanaInstructorProgramator("Vlad","Vlad",10);

    }

}
