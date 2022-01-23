import java.util.ArrayList;
import java.util.Arrays;

public class TrainingsProgramm implements Trainingsziel{
    Trainingseinheit trainingseinheit;
    Trainingseinheit [] myTrainingsProgrammsInArray;
    ArrayList<Trainingseinheit> myTrainingsProgramms;
    private int Kalorienziel = 0;

    public TrainingsProgramm(Trainingseinheit trainingseinheit, Trainingseinheit [] myTrainingsProgrammsInArray,ArrayList<Trainingseinheit> myTrainingsProgramms) {
        this.trainingseinheit = trainingseinheit;
        this.myTrainingsProgrammsInArray = myTrainingsProgrammsInArray;
        this.myTrainingsProgramms = myTrainingsProgramms;
    }

    public Trainingseinheit[] getMyTrainingsProgrammsInArray() {
        return myTrainingsProgrammsInArray;
    }

    public void setMyTrainingsProgrammsInArray(Trainingseinheit[] myTrainingsProgrammsInArray) {
        this.myTrainingsProgrammsInArray = myTrainingsProgrammsInArray;
    }

    @Override
    public void setKalorienZiel(int kalorienZiel) {
        this.Kalorienziel = kalorienZiel;
    }

    @Override
    public int getKalorienZiel() {
        int totalKaloZiel = 0;
        for (Trainingseinheit kaloZiel : myTrainingsProgrammsInArray) {
            totalKaloZiel += kaloZiel.getKalorienZiel();
        }
        return totalKaloZiel;
    }

    @Override
    public double getZielerreichungsgrad() {
        return 0;
    }



    public void addTrainingseinheit (Trainingseinheit trainingseinheit){
        int LastArrayElement = this.myTrainingsProgrammsInArray.length +1;
        System.out.println(LastArrayElement);
        System.out.println(myTrainingsProgrammsInArray.length);
        this.myTrainingsProgrammsInArray = Arrays.copyOf(myTrainingsProgrammsInArray, LastArrayElement);
        System.out.println(myTrainingsProgrammsInArray.length);
        this.myTrainingsProgrammsInArray[LastArrayElement-1] = trainingseinheit;

        /* Try another day
        int AmountOfArrayElementsFromNewArray = 0;
        int LastArrayElement = this.myTrainingsProgrammsInArray.length + 1;
        Trainingseinheit [] myNewBiggerTrainingsProgrammsInArray = new Trainingseinheit[LastArrayElement];
        for (Trainingseinheit TrainEinheit : this.myTrainingsProgrammsInArray) {
            myNewBiggerTrainingsProgrammsInArray[AmountOfArrayElementsFromNewArray] = TrainEinheit;
            AmountOfArrayElementsFromNewArray++;
        }
        myNewBiggerTrainingsProgrammsInArray[LastArrayElement] = trainingseinheit;
        this.setMyTrainingsProgrammsInArray(myNewBiggerTrainingsProgrammsInArray);

         */
    }



    /*
       Later
        Beachten Sie, dass bei der Methode getZielerreichungsgrad () der gesamte
        Kalorienverbrauch aller Trainingseinheiten berücksichtig werden muss! Den Kalorienverbrauch einer
        Trainingseinheit können Sie berechnen, da für jede Trainingseinheit die Dauer und das verwendete
        Fitnessgerät bekannt sind.


     */

}
